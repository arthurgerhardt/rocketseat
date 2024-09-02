package je04_bank;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private String nomeCliente;
    private String agencia;
    private String contaCorrente;
    private LocalDate dataNascimento;
    private double saldoDisponivel;
    private boolean contaAtiva;
    private List<Transacao> transacoes;

    // Construtor
    public ContaBancaria(String nomeCliente, String agencia, String contaCorrente, LocalDate dataNascimento, double saldoDisponivel) {
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.contaCorrente = contaCorrente;
        this.dataNascimento = dataNascimento;
        this.saldoDisponivel = saldoDisponivel;
        this.contaAtiva = true;
        this.transacoes = new ArrayList<>();
        registrarTransacao("Criação da conta", saldoDisponivel);
    }

    // Método para sacar um valor
    public boolean sacar(double valor) {
        if (!contaAtiva || valor <= 0 || valor > saldoDisponivel) {
            System.out.println("Saque inválido.");
            return false;
        }
        saldoDisponivel -= valor;
        registrarTransacao("Saque", -valor);
        return true;
    }

    // Método para transferir entre contas
    public boolean transferir(ContaBancaria contaDestino, double valor) {
        if (!contaAtiva || !contaDestino.contaAtiva || valor <= 0 || valor > saldoDisponivel) {
            System.out.println("Transferência inválida.");
            return false;
        }
        saldoDisponivel -= valor;
        contaDestino.saldoDisponivel += valor;
        registrarTransacao("Transferência para conta " + contaDestino.contaCorrente, -valor);
        contaDestino.registrarTransacao("Transferência recebida de conta " + this.contaCorrente, valor);
        return true;
    }

    // Método para cancelar a conta com uma justificativa
    public boolean cancelarConta(String justificativa) {
        if (!contaAtiva) {
            System.out.println("Conta já está inativa.");
            return false;
        }
        contaAtiva = false;
        registrarTransacao("Cancelamento da conta", saldoDisponivel);
        saldoDisponivel = 0;
        System.out.println("Conta cancelada: " + justificativa);
        return true;
    }

    // Método para consultar o saldo entre duas datas
    public double consultarSaldo(LocalDate dataInicio, LocalDate dataFim) {
        if (dataInicio.isAfter(dataFim)) {
            System.out.println("Data inicial deve ser anterior à data final.");
            return 0;
        }
        double saldo = 0;
        for (Transacao t : transacoes) {
            if (!t.data.isBefore(dataInicio) && !t.data.isAfter(dataFim)) {
                saldo += t.valor;
            }
        }
        return saldo;
    }

    // Método para consultar o saldo atual
    public double consultarSaldoAtual() {
        return saldoDisponivel;
    }

    // Método auxiliar para registrar transações
    private void registrarTransacao(String tipo, double valor) {
        transacoes.add(new Transacao(tipo, valor, LocalDate.now()));
    }

    // Classe interna para representar uma transação
    private static class Transacao {
        private String tipo;
        private double valor;
        private LocalDate data;

        public Transacao(String tipo, double valor, LocalDate data) {
            this.tipo = tipo;
            this.valor = valor;
            this.data = data;
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso
        ContaBancaria conta1 = new ContaBancaria("João Silva", "001", "12345-6", LocalDate.of(1990, 5, 15), 1000);
        ContaBancaria conta2 = new ContaBancaria("Maria Oliveira", "001", "65432-1", LocalDate.of(1985, 8, 20), 500);

        conta1.sacar(200);
        conta1.transferir(conta2, 150);

        System.out.println("Saldo atual da conta 1: " + conta1.consultarSaldoAtual());
        System.out.println("Saldo atual da conta 2: " + conta2.consultarSaldoAtual());

        // Consultar saldo entre duas datas
        LocalDate dataInicio = LocalDate.now().minusDays(10);
        LocalDate dataFim = LocalDate.now();
        System.out.println("Saldo entre " + dataInicio + " e " + dataFim + ": " + conta1.consultarSaldo(dataInicio, dataFim));

        // Cancelar a conta
        conta1.cancelarConta("Cliente solicitou o cancelamento.");

        // Tentar sacar após o cancelamento
        conta1.sacar(100);
    }
}

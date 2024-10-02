package je13_poo;

public class Cliente {
    String nome;
    Double limiteCredito = 10.0;

    public void solicitarLimiteCredito(Double valorSolicitado) {
        Double limiteCredito = valorSolicitado;
    }

    public void comprar(Double valorProduto) {
        limiteCredito = limiteCredito - valorProduto;
    }
}
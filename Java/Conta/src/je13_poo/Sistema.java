package je13_poo;

public class Sistema {
    public static void main(String[] args) {
        Cliente gleyson = new Cliente();
        gleyson.nome = "Gleyson Sampaio";
        System.out.println(gleyson.limiteCredito);
        gleyson.solicitarLimiteCredito(500.0);
        System.out.println("O saldo de " + gleyson.nome + " é " +gleyson.limiteCredito);

        gleyson.comprar(50.0);

        Cliente izabelly = new Cliente();
        izabelly.nome = "Izabelly Sampaio";
        System.out.println(izabelly.limiteCredito);
        izabelly.solicitarLimiteCredito(80.0);
        System.out.println("O saldo de " + izabelly.nome + " é " +izabelly.limiteCredito);
        gleyson.comprar(22.0);

        System.out.println("Limite do(a): " + izabelly.nome + " é " + izabelly.limiteCredito);
        System.out.println("Limite do(a): " + gleyson.nome + " é " + gleyson.limiteCredito);

    }
}

package je13_poo;

public class Sistema {
    public static void main(String[] args) {
        Cliente gleyson = new Cliente("Gleyson Sampaio");
        System.out.println(gleyson.limiteCredito);
        gleyson.solicitarLimiteCredito(200.0);
        System.out.println("O novo limite de crédito é de: " + gleyson.limiteCredito);

        gleyson.comprar(70.0);
        System.out.println("O saldo atual é de: " + gleyson.limiteCredito);

        Cliente izabelly = new Cliente("Izabelly Sampaio");
        System.out.println(izabelly.limiteCredito);
        izabelly.solicitarLimiteCredito(100.0);
        System.out.println("O novo limite de crédito é de: " + izabelly.limiteCredito);

        izabelly.comprar(22.0);
        System.out.println("O saldo atual é de: " + izabelly.limiteCredito);
    }
}

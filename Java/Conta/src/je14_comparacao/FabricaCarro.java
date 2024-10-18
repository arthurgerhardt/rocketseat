package je14_comparacao;

public class FabricaCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("branca", "fiat", "palio");
        Carro carro2 = new Carro("branca", "fiat", "uno");
        Carro carro3 = new Carro("branca", "fiat", "palio");
        Carro carro4 = new Carro("branca", "fiat", "palio");
        Carro carro5 = new Carro("branca", "fiat", "palio");

        Carro carro6 = carro1;

        //case01
        System.out.println(carro1 == carro6); //false
        //case02
        System.out.println(carro1.equals(carro2));//false
        System.out.println(carro1.equals(carro3));//false
    }

}

package je13_poo.enums;

public class SistemaEnumeracao {
    public static void main(String[] args) {
        String nomeString = "sao_paulo";
        for(EstadoBrasileiro eb: EstadoBrasileiro.values()) {
            System.out.println("ESTADO LOCALIZADO: " + eb.toString());
            System.out.println(eb.getNome());
            System.out.println(eb.name());
            System.out.println(eb.getSigla());
        }

    }
}

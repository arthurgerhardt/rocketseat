package je11_repeticoes;

import java.util.Random;

public class ExemploDoWhile {
    private static int numeroTentativas = 0;
    public static void main(String[] args) {
        System.out.println("Discando...");
        do {
            // executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando - trim trim");
        }
        while (tocando());
        if(numeroTentativas < 5)
            System.out.println("Aloooooou !!!");
        else
            System.out.println("Não atendeu.");
    }
    private static boolean tocando() {
        numeroTentativas++;
        boolean atendeu = new Random().nextInt(5) == 1;
        if(numeroTentativas == 5)
            return false;
        else
            return ! atendeu;
    }
}

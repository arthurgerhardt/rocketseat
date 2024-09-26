package je11_repeticoes;

import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile2 {
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada > 0) {
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: " + valorDoce + " adicionado no carrinho. ");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Anya gastou toda a sua mesada em doces.");

    }
    private static Double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}

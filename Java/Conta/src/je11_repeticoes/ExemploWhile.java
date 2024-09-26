package je11_repeticoes;

import java.util.Random;

public class ExemploWhile {
    public static void main(String[] args) {
        int carneirinhos = 0;
        boolean acordado = true;
        while( acordado ) {
            System.out.println("Contando carneirinhos .. " + (++carneirinhos));
            acordado = !(new Random().nextInt(3) == carneirinhos);
            if(carneirinhos == 20)
                carneirinhos = 0;
        }
        System.out.println("Dormiu...");
    }
}

package je07_operadores;

public class Logicos {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 1;

        if (numero1 == 2 || numero2++ == 2) {
            System.out.println("As duas condicoes são verdadeiras.");
        }
        System.out.println("O número 1 agora é " + numero1);
        System.out.println("O número 2 agora é " + numero2);
    }
}

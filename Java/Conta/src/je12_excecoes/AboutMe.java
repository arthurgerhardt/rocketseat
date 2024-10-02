package je12_excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        // Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();
        System.out.println("Digite a sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Digite a sua altura: ");
        double altura = 0;
        try {
            altura = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.err.println("A altura deve ser digitada no padrão americano 0.00 .");
        }
        // Imprimindo os dados obtidos pelo usuário
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos .");
        System.out.println("Tenho " + altura + "  cm de altura .");
    }
}

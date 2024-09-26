package je12_excecoes;

import java.util.Scanner;
import java.util.Locale;

public class Excecoes {
    public static void main(String[] args) {
        // Criando o objeto scanner com a localidade dos EUA.
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite a sua altura: ");
        double altura = scanner.nextDouble();

        // Fechando o scanner
        scanner.close();

        // Imprimindo os dados obtidos pelo usuário
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase() + ".");
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("E tenho " + altura + " de altura.");
    }
}
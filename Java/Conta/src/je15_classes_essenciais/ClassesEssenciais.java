package je15_classes_essenciais;

import java.util.Scanner;

public class ClassesEssenciais {
    public static void main(String[] args) {
       Scanner scan  = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite a sua idade: ");
        Integer idade = scan.nextInt();

        System.out.println("Seu nome é : " + nome);
        System.out.println("Sua idade é : " + idade + " anos");
    }
}

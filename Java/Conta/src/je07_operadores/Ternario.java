package je07_operadores;

public class Ternario {
    public static void main(String[] args) {
        String nome = "Iza";
        int idade = 1;
        final int MAIOR_IDADE = 18;
        boolean maiorIdade = idade >= MAIOR_IDADE;
        String mensagem = nome + (maiorIdade ? "é maior" : " não é maior .");
        System.out.println(mensagem);
    }
}

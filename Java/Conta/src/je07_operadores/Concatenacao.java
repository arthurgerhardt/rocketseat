package je07_operadores;

public class Concatenacao {
    public static void main(String[] args) {
        String nomeCompleto = "Linguagem" + "Java";
        String concatenado = "?";
        concatenado = 1+1+1+"1";
        concatenado = 1+1+"1"+1;
        concatenado = 1+"1"+1+"1";
        concatenado = "1"+(1+1+1);
        System.out.println(concatenado);
        System.out.println(nomeCompleto);
    }
}

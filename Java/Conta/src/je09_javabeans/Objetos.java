package je09_javabeans;

public class Objetos {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(8);
        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos");

    }
}

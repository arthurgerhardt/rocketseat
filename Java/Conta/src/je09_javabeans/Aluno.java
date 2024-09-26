package je09_javabeans;

public class Aluno {
    private String nome;
    private int idade;
    public String getNome() {
        return nome;
    }
    public void setNome(String newNome) {
        nome = newNome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int newIdade) {
        if(newIdade < 0 || newIdade > 120)
            throw new IllegalArgumentException("Idade deve ter idade entre 0 e 120");
        this.idade = newIdade;
    }
}


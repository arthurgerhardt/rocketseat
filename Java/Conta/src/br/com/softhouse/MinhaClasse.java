package br.com.softhouse;
import br.com.softhouse.model.User;

public class MinhaClasse {
    public static void main(String[] args) {
        User user = new User();
        user.showMyName();

        User userLocal = new User();
        userLocal.showMyName();
    }
}

import java.math.BigDecimal;

public class NumberApp {
    public static void main(String[] args) {
        //Constantes
        BigDecimal zero = BigDecimal.ZERO;
        BigDecimal dez = BigDecimal.TEN;

        BigDecimal decimal = BigDecimal.valueOf(1234.56789);
        BigDecimal numeroString = new BigDecimal("1234.56789");
        System.out.println(decimal); // 1234.56789
        System.out.println(numeroString); // 1234.56789
    }
}

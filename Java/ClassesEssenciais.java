public class ClassesEssenciais {
    
    public static void main(String[] args) {
        String texto = "Hello World Java Programming";
        
        System.out.println("Texto original: " + texto);
        System.out.println("Minúsculas: " + paraMinusculas(texto));
        System.out.println("Maiúsculas: " + paraMaiusculas(texto));
        System.out.println("Título: " + paraTitulo(texto));
        System.out.println("Camel Case: " + paraCamelCase(texto));
        System.out.println("Snake Case: " + paraSnakeCase(texto));
        System.out.println("Alternado: " + paraAlternado(texto));
    }
    
    /**
     * Converte texto para minúsculas
     */
    public static String paraMinusculas(String texto) {
        return texto.toLowerCase();
    }
    
    /**
     * Converte texto para maiúsculas
     */
    public static String paraMaiusculas(String texto) {
        return texto.toUpperCase();
    }
    
    /**
     * Converte texto para formato de título (primeira letra de cada palavra maiúscula)
     */
    public static String paraTitulo(String texto) {
        StringBuilder resultado = new StringBuilder();
        boolean proximaMaiuscula = true;
        
        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                if (proximaMaiuscula) {
                    resultado.append(Character.toUpperCase(c));
                    proximaMaiuscula = false;
                } else {
                    resultado.append(Character.toLowerCase(c));
                }
            } else {
                resultado.append(c);
                if (Character.isWhitespace(c)) {
                    proximaMaiuscula = true;
                }
            }
        }
        
        return resultado.toString();
    }
    
    /**
     * Converte texto para camelCase
     */
    public static String paraCamelCase(String texto) {
        StringBuilder resultado = new StringBuilder();
        boolean proximaMaiuscula = false;
        
        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                if (proximaMaiuscula) {
                    resultado.append(Character.toUpperCase(c));
                    proximaMaiuscula = false;
                } else {
                    resultado.append(Character.toLowerCase(c));
                }
            } else if (Character.isWhitespace(c)) {
                proximaMaiuscula = true;
            }
        }
        
        return resultado.toString();
    }
    
    /**
     * Converte texto para snake_case
     */
    public static String paraSnakeCase(String texto) {
        return texto.toLowerCase().replaceAll("\\s+", "_");
    }
    
    /**
     * Converte texto alternando entre maiúsculas e minúsculas
     */
    public static String paraAlternado(String texto) {
        StringBuilder resultado = new StringBuilder();
        boolean maiuscula = true;
        
        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                if (maiuscula) {
                    resultado.append(Character.toUpperCase(c));
                } else {
                    resultado.append(Character.toLowerCase(c));
                }
                maiuscula = !maiuscula;
            } else {
                resultado.append(c);
            }
        }
        
        return resultado.toString();
    }
}

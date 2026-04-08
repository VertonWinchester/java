package exercicios;

import java.util.*;

public class Palidromo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite alguma coisa: ");
        StringBuilder texto = new StringBuilder(entrada.next());
        String texto1 = texto.toString();
        String texto2 = texto.reverse().toString();
        if (texto1.equals(texto2)){
            System.out.printf("%s é palidrome", texto1);
        }else System.out.printf("%s não é palindrome", texto1);
    }
}

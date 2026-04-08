package exercicios;

import java.util.Scanner;

public class ImprimirLetraPorLetra {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a palavra: ");
        String palavra = entrada.nextLine();

        char[] letras = palavra.toCharArray();

        for (char letra : letras) {
            System.out.println(letra);
        }

        entrada.close();
    }

}
package exercicios;

import java.util.Scanner;

public class PiramideMatriz {
    public static void main(String[] args) {
        int numero;
        int inicial;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        numero = entrada.nextInt();

        for (inicial = 0; inicial < numero + 1; inicial++){
            for (int l = 0; l < inicial; l++){
                System.out.print(inicial);
            }
            System.out.println();
        }

    }
}

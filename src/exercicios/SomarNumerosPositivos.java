package exercicios;

import java.util.Scanner;

public class SomarNumerosPositivos {
    public static void main(String[] args) {
        int ususario = 0;
        int resultado = 0;
        Scanner entrada = new Scanner(System.in);
        while (ususario >= 0){
            System.out.println("digite um número: ");
            ususario = entrada.nextInt();
            if (ususario >= 0) resultado += ususario;
        }
        System.out.println(resultado);
    }
}

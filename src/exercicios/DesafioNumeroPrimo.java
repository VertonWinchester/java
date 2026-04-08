package exercicios;

import java.util.Scanner;

public class DesafioNumeroPrimo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um números: ");
        int contador = 0;
        int usuario = entrada.nextInt();
        for (int i = 1; i <= usuario; i++){
            if (usuario % i == 0) contador += 1;
        }
        if (contador > 2) System.out.println("Não é primo");
        else System.out.println("é primo");
    }
}

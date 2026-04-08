package exercicios;

import java.util.Scanner;

public class Teleferico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a quantidade de Supervisores: ");
        int superVisores = entrada.nextInt();
        System.out.println("Informe a quantidade de Alunos: ");
        int alunos = entrada.nextInt();

        if (superVisores + alunos > 50) System.out.println
                ("N");
        else System.out.println("S");

    }
}

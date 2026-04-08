package exercicios;

import java.util.Scanner;

public class Nadadeiras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Valor de P: ");
        int p = entrada.nextInt();
        System.out.println("Valor de R: ");
        int r = entrada.nextInt();
        if (p == 0){
            System.out.println("Caminho C");
        }else if (p == 1 && r==0){
            System.out.println("Caminho B");
        }else if (p == 1 && r==1){
            System.out.println("Caminho A");
        }else System.out.println("Porra nenhuma");
    }
}

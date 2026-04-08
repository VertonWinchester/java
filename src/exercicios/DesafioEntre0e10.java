package exercicios;

import java.util.Scanner;

public class DesafioEntre0e10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número qualquer: ");
        int usuario = entrada.nextInt();
        if (usuario >= 0 && usuario <= 10){
            System.out.printf("%d está entre 0 e 10", usuario);
        }else {
            System.out.println(String.format("%d não está entre 0 e 10", usuario));
        }
    }
}

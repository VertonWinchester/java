package exercicios;

import java.util.Scanner;

public class ImprimirOmaiorNumero {
    public static void main(String[] args) {
        int armazenar = 0;
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i <= 10; i++){
            System.out.println("digite um número: ");
            int usuario = entrada.nextInt();
            if (i == 0) armazenar = usuario;
            else{
                if (usuario > armazenar) armazenar = usuario;
            }
        }
        System.out.println(armazenar);
    }
}

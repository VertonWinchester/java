package exercicios;

import java.util.Scanner;

public class DesafioPercorrendoString {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String name = entrada.next().toUpperCase();
        char[] mudanca = name.toCharArray();
        for (char i : mudanca){
            System.out.println(i);
        }
        entrada.close();
    }
}

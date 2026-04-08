package exercicios;

import javax.swing.*;

public class RefatorandoDesafioPrimo {
    public static void main(String[] args) {
        String novo = JOptionPane.showInputDialog("Digite um número:");
        System.out.println("Digite um números: ");
        int contador = 0;
        int usuario = Integer.parseInt(novo);
        for (int i = 1; i <= usuario; i++){
            if (usuario % i == 0) contador += 1;
        }
        System.out.println(contador);
        switch (contador){
            case 0 : case 1: case 2:
                System.out.println("é primo");
                break;
            default : System.out.println("não é primo");
        }
    }
}

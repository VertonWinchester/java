package exercicios;

import javax.swing.*;

public class VerificandoNumeros {
    public static void main(String[] args) {
        var valor1 = JOptionPane.showInputDialog("Digite um número:");

//        if (valor1 != null) {
//            try {
//                Integer.parseInt(valor1);
//                System.out.printf("voce digitou um o numero: %s", valor1);
//            }catch (Exception e){
//                System.out.println("esse valor nao e numerico");
//            }
//        }

        System.out.println(valor1.matches("[0-99]"));
    }
}

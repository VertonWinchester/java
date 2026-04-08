package exercicios;

import javax.swing.*;
import java.util.Arrays;

public class ExercicioArray {
    public static void main(String[] args) {
        double[] entradaNotas = new double[2];
        for (int i = 0; i < entradaNotas.length; i++){
            entradaNotas[i] = Double.parseDouble(JOptionPane.showInputDialog(String.format(
                    "Digite a %d° nota", i + 1)));
            System.out.printf("nota %d - %.1f%n", i + 1, entradaNotas[i]);
        }
        System.out.println("Pimeira forma:");
        double media = 0;
        for (double i : entradaNotas){
            media += i;
        }
        System.out.printf("Média: %.1f%n", media / entradaNotas.length);
        System.out.println("segunda forma: ");
        String gostouAgora = Arrays.stream(entradaNotas).average().toString();
        String teste2 = gostouAgora.substring(15,18);
        System.out.println(gostouAgora.contains("10.0"));
        double saporra = Double.parseDouble(teste2);
        System.out.printf("Média: %.1f", saporra);
        System.out.println("\n\n\n\n ----------------------------------------------------\n");

        //nesse caso ele soma o que ele encontra de numeros
        char[] novoTeste3 = Arrays.stream(entradaNotas).average().toString().toCharArray();
        System.out.println(novoTeste3);
        Double j = 0.0;
        for (char i : novoTeste3){
            try {
                j += Double.parseDouble(String.valueOf(i));
            } catch (Exception ignored) {
            }
        }
        System.out.println(j);
        System.out.println("\n\n ---------------------------------------------- \n");

        //nesse caso aqui convertemos ao final novamente para double
        char[] novoTeste4 = Arrays.stream(entradaNotas).average().toString().toCharArray();
        System.out.println(novoTeste3);
        StringBuilder forma = new StringBuilder(); // aceita métodos que uma string não aceita \ a string aceita métodos de uma lista
        double k = 0.0;
        for (char i : novoTeste3){
            try {
                k += Double.parseDouble(String.valueOf(i));
                forma.append(i);
            } catch (Exception ignored) {
            }
        }
        if (forma.toString().equals("100")) forma.insert(2, ".");
        else forma.insert(1,".");
        double valorFinal = Double.parseDouble(forma.toString());
        System.out.printf("%.2f", valorFinal);


    }
}
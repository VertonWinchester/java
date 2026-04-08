package exercicios;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escreva um dia da semana: ");
        String dia = entrada.next();
        if (dia.equalsIgnoreCase("segunda")){
            System.out.println("2° dia");
        }else if (dia.equals("terça")){
            System.out.println("3° dia");
        }else if (dia.equals("quarta")){
            System.out.println("4° dia");
        }else if (dia.equals("quinta")){
            System.out.println("5° dia");
        }else if (dia.equals("sexta")){
            System.out.println("6° dia");
        }else if (dia.equals("sábado")){
            System.out.println("7° dia");
        }else if (dia.equals("domingo")){
            System.out.println("1° dia");
        }else {
            System.out.println("Dia inválildo");
        }

    }
}

package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos alunos?  ");
        int alunos = entrada.nextInt();
        System.out.println("Quantas notas?  ");
        int notas = entrada.nextInt();

        double[][] produto = new double[alunos][notas];

        for (int i = 0; i < alunos; i++) {
            System.out.println("Informe o nome do aluno: ");
            produto[i][i] = entrada.nextDouble();
            for (int j = 0; j < notas; j++) {
                System.out.printf("Informe a %d° nota do %d° aluno: ",j + 1 ,i + 1);
                produto[i][j] = entrada.nextDouble();
            }
        }
        entrada.close();
        for(double[] i : produto){
            System.out.println(Arrays.toString(i));

        }


    }
}

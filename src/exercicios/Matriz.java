package exercicios;


import java.util.ArrayList;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("quantos alunos? :");
        int qutAlunos = entrada.nextInt();
        System.out.println("quantas notas? :");
        int qutNotas = entrada.nextInt();
        String[] alunos = new String[qutAlunos];
        ArrayList<double[]> total = new ArrayList<>();

        for (int k = 0; k < qutAlunos; k++){
            double[] notas = new double[qutNotas];
            System.out.println("Informe o nome do aluno: ");
            alunos[k] = entrada.next();
            for (int i = 0; i < qutNotas; i++) {
                System.out.printf("Informe %d° nota: ", i + 1);
                notas[i] = entrada.nextDouble();
            }
            total.add(notas);

        }
        for (int n = 0; n < alunos.length; n++){
            double media = 0.0;
            System.out.print(alunos[n] + ") ");
            for (double k : total.get(n)){
                System.out.print(k + ", ");
                media += k;
            }
            System.out.printf("Média: %.1f\n", media / total.get(n).length);
        }
    }
}
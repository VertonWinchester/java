package exercicios;

import kotlin.Pair;

import java.util.ArrayList;
import java.util.Scanner;

public class MediaAluno {

   public static double Average(double notas){
       return notas / 3;
   }

    public static void main(String[] args) {
        ArrayList<Pair<String, ArrayList<Double>>> alunos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        double notas = 0.0;
        String name;
        for (int i = 1; i< 4; i++){
            System.out.print("Digite seu nome: ");
            name = entrada.next();
            for (int l = 1; l< 4; l++){
                System.out.println("Informe " + l + "° nota" );
                notas += Double.parseDouble(entrada.next());
            }
            alunos.add(new Pair(name, Average(notas)));
            notas = 0.0;
        }
        for (Pair<String, ArrayList<Double>> aluno : alunos) {
            System.out.printf("Aluno(a) " + aluno.component1() +
                    " teve média: " + "%.1f%n", aluno.component2());
        }
    }
}

package array;

import java.util.Arrays;

public class PrineiroContatoArray {
    public static void main(String[] args) {
        double[] notasAlunos = new double[4];
        System.out.println(Arrays.toString(notasAlunos));
        notasAlunos[0] = 7.9;
        notasAlunos[1] = 8;
        notasAlunos[2] = 6.7;
        notasAlunos[3] = 9.7;
        System.out.println(Arrays.toString(notasAlunos));
        double totalAlunoA = 0;

//        tambem esta certo
//        for (int i = 0; i < notasAlunos.length; i++) {
//            totalAlunoA += notasAlunos[i];
//        }
        for (double notasAluno : notasAlunos) {
            totalAlunoA += notasAluno;
        }
        System.out.println(totalAlunoA / notasAlunos.length);

        double totalAlunoB = 0;
        final double novaNota = 5.9;
        double[] notasAlunosB = {novaNota, 6.9, 8.9, 10};
        System.out.println(notasAlunosB[0]);
        System.out.println(notasAlunosB[notasAlunosB.length - 1]);
        //testando Stream do Arrays.jav.util
        System.out.println(Arrays.stream(notasAlunosB).findFirst());
        System.out.println(Arrays.stream(notasAlunosB).findAny());
        System.out.println(Arrays.stream(notasAlunosB).average().toString());
        System.out.println(Arrays.stream(notasAlunosB).max());
        System.out.println(Arrays.stream(notasAlunosB).min());
        System.out.println(Arrays.stream(notasAlunosB).count());
        System.out.println(Arrays.stream(notasAlunosB).sum());
        System.out.println(Arrays.stream(notasAlunosB).summaryStatistics()); // mostrar detalhes maior, menor, soma, divisao...

        System.out.println(Arrays.toString(notasAlunosB));

        for (int i = 0; i < notasAlunosB.length; i++) {
            totalAlunoB+= notasAlunosB[i];
        }
        System.out.println(totalAlunoB / notasAlunosB.length);
    }
}

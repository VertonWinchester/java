package exercicios;

import java.util.ArrayList;
import java.util.Scanner;


public class DesafioConversaoo {
    public static double Average(ArrayList<Double> lista){
        double soma = 0;
        for (Double listas : lista){
            soma += listas;
        }
        return soma / lista.size();
    }

    public static void main(String[] args) {
        ArrayList<Double> MediaSalarios = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        for (int i =1; i < 4; i++){
            System.out.printf("Informe o %s° sálario: ", i);
            String salario = entrada.nextLine();
            salario = salario.replace(',', '.');
            MediaSalarios.add(Double.parseDouble(salario));
        }
        System.out.printf("A media do seu ultimos 3 salarios: R$%.2f", Average(MediaSalarios));
    }

}

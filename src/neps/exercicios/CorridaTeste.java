package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CorridaTeste {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Corrida> pessoas = new ArrayList<>();
        ArrayList<Double>ordem = new ArrayList<>();
       int qut = 1;
       while (qut <= 4){
           System.out.println("Informe nome e distancia: ");
           pessoas.add(new Corrida(entrada.next(), entrada.nextDouble()));
           qut++;
       }
        for (Corrida k : pessoas){
            ordem.add(k.distancia);
        }
        Collections.reverse(ordem);
        int contador = 1;
        for (double i : ordem){
            for (Corrida k : pessoas){
                if (k.distancia == i){
                    System.out.printf("""
                                    %d° lugar) %s percorreu %.2f metros
                                    completando %s metros%n
                                    """,contador, k.name, k.distancia,
                            k.regras());
                    contador++;
                }
            }
        }
    }
}

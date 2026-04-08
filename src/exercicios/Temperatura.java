package exercicios;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        final double var1 = 32.0;
        final double var2 = 5.0 / 9.0;
        int graus;
        double resultado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a temperatura: ");
        graus = entrada.nextInt();
        resultado = (graus - var1) * var2;
        System.out.println(graus + " fahrenheit convertidos em celcius " + resultado);
    }
}

package exercicios;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        int aleatorio = new Random().nextInt(100);
        Scanner entrada = new Scanner(System.in);
        int vezes = 0;
        while (10 - vezes != 0){
            System.out.println("digite um número entre 0 e 100: ");
            int usuario = entrada.nextInt();
            if (usuario == aleatorio) {
                System.out.printf("Parabens você acertou!!! o número escolhido foi: %d" +
                        " você usou %d tentativas", aleatorio, vezes);
                break;
            }
            else {
                vezes += 1;
                System.out.printf("Você errou! Ainda restam %d chances\n", 10 - vezes);
            }
        }
        System.out.printf("suas tentativas esgotaram-se!!! você perdeu!!!:(" +
                "o numero escolhido foi: %d", aleatorio);
    }
}
//        int teste = ThreadLocalRandom.current().nextInt(2, 5);
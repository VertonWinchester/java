package exercicios;

import java.util.List;
import java.util.Random;

public class TesteRandom {
    public static void main(String[] args) {
        List<Character> chaves = List.of('a','b', 'c', 'd');
        Character[] portas = {'A', 'B', 'C', 'D'};
        Character[] joias = {'p', 't', 'm', 'e', 'r'};
        Random aleatorio = new Random();
        System.out.println(chaves.get(aleatorio.nextInt(chaves.size())));
        System.out.println(portas[aleatorio.nextInt(portas.length)]);
        System.out.println(joias[aleatorio.nextInt(joias.length)]);

        char teste = chaves.get(aleatorio.nextInt(chaves.size()));
        System.out.println(chaves.contains(teste));
    }
}

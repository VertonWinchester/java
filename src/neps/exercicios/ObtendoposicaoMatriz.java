package exercicios;


import kotlin.Pair;

import java.util.ArrayList;
import java.util.List;

class ObtendoPosicaoMatriz{
    private static List<Boolean> check = new ArrayList<>();

    public static boolean caminho(char[][] tabela, Pair<Integer, Integer> posT, char cord){
        char ordenada = cord;
        int primeiro = 100;
        int segundo = 100;
        switch (ordenada) {
            case 'U' -> {
                primeiro = posT.getFirst() - 1;
                segundo = posT.getSecond();
            }
            case 'D' -> {
                primeiro = posT.getFirst() + 1;
                segundo = posT.getSecond();
            }
            case 'R' -> {
                primeiro = posT.getFirst();
                segundo = posT.getSecond() + 1;
            }
            case 'L' -> {
                primeiro = posT.getFirst();
                segundo = posT.getSecond() - 1;
            }
        }
        char copo;
        try {
            copo = tabela[primeiro][segundo];
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public static void main(String[] args) {

         int cont = 0;
        char[][] listas = new char[4][4];
        char[] itens = {'T', '#', '-', '-', '#', '-', '-', '#', '-', '-', '#', '-',
                '-', '#', '-','-'};
        for (char[] lista : listas) {
            for (int j = 0; j < lista.length; j++) {
                System.out.print(itens[cont++]);
            }
            System.out.println();
        }
    }
}
// L1 baixo, direita, esquerda
// C1 baixo, direita
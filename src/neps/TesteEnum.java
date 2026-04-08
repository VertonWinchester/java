import kotlin.Pair;

import java.util.Arrays;

public class TesteEnum {
    public static boolean vamosLa(char[][] tabela, Pair<Integer, Integer> posT){
        char eae;
        try {
            eae = tabela[posT.getFirst()][posT.getSecond() - 1];
            return true;
        }catch (Exception e){
            return false;
        }finally {
            System.out.println(posT);
        }
    }

    public static void main(String[] args) {
        char[][] listas = new char[3][3];
        for (char[] lista : listas) {
            Arrays.fill(lista, 'V');
        }
        for (char[] i : listas){
            for (char j : i){
                System.out.print(j + "");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(vamosLa(listas, new Pair<>(0,0)));
    }

//    public Pair<Integer, Integer> caminhos(char[][] tabela, Pair<Integer, Integer> posT){
//
//        if (tabela[posT.getFirst()][posT.getSecond() + 1] == '#'){
//            check.add(false);
//            if (tabela[posT.getFirst()][posT.getSecond() - 1] == '#'){
//                check.add(false);
//                if (tabela[posT.getFirst() - 1][posT.getSecond()] == '#'){
//                    check.add(false);
//                    if (tabela[posT.getFirst() + 1][posT.getSecond()] == '#'){
//                        check.add(false);
//                    }return new Pair<>(posT.getFirst() + 1,posT.getSecond());
//                }return new Pair<>(posT.getFirst() - 1,posT.getSecond());
//            }else new Pair<>(posT.getFirst(), posT.getSecond() - 1);
//        }else return new Pair<>(posT.getFirst(),posT.getSecond() + 1);
//        throw new IllegalArgumentException("Erro de retorno");
//    }

}

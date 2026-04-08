package colecao;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        SortedSet<String> listaReprovados = new TreeSet<>();
        listaReprovados.add("Luiz");
        listaReprovados.add("Renato");
        listaReprovados.add("Ana");
        listaReprovados.add("Beatriz");
        listaReprovados.add("Roberto");
        listaReprovados.add("Thiago");

        for (String s : listaReprovados){
            System.out.println(s);
        }

        System.out.println("\n\n");

        Set<String> listaAprovados = new HashSet<>();
        listaAprovados.add("Julia");
        listaAprovados.add("Pedro");
        listaAprovados.add("Ricardo");
        listaAprovados.add("João");
        listaAprovados.add("Carlos");

        for (String s : listaAprovados){
            System.out.println(s);
        }




    }
}

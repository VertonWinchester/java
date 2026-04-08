package colecao;

import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();


        // offer -> retorna true ou false se a fila estiver cheia
        // add -> retorna um erro se não consegui adicionar a lista
        // peek -> retorna null se a fila estiver vazia, se não retorna o priemiro da fila
        // element -> retorna uma exceção se não houver elementos na fila, se não retorna o primneiro da fila
        // pool -> remove o primeiro elemento da fila, e segue a sequencia. se a fila estiver vazia ele retorna null
        // peek e element obtem o primeiro item da lista mas não remove

        fila.add("Roberta");
        fila.add("Suzane");
        fila.add("Cleito");
        fila.add("Luciana");
        fila.offer("Ricardo");
        fila.offer("Felipe");
        fila.offer("Paula");
        fila.offer("Rodolfo");


        System.out.println(fila);
        System.out.println(fila.remove()); // se a fila estiver vazia retorna uma exceção.
        System.out.println(fila.poll());
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila);


    }

}

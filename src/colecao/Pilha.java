package colecao;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();
        livros.add("A Lua");
        livros.push("Logo Ali");
        livros.add("Alguma coisa");
        livros.push("Mais Livros");


        System.out.println(livros);
        System.out.println(livros.element());
        System.out.println(livros.peek());
        System.out.println(livros.pop());
        System.out.println(livros.remove());
        System.out.println(livros.poll());
        System.out.println(livros.pop());

    }
}

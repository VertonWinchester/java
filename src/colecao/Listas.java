package colecao;

import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();
        Usuario u1 = new Usuario("Cralos");
        lista.add(u1);
        lista.add(new Usuario("Josefa"));
        lista.add(new Usuario("Juan"));
        lista.add(new Usuario("Luciana"));
        lista.add(new Usuario("Pedro"));
        lista.add(new Usuario("Tamara"));

        System.out.println("removido?: " + lista.remove(new Usuario("Josefa")));
        System.out.println("removido por index?: " + lista.remove(3));
        System.out.println("contem: " + lista.contains(new Usuario("Luciana")));

        System.out.println(lista.get(1));
        for (Usuario u : lista){
            System.out.println(u);
        }


    }
}

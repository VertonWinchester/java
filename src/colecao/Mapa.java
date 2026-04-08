package colecao;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuario = new HashMap<>();
        usuario.put(13, "Luana");
        usuario.put(22, "Juca");
        usuario.put(14, "Pedro");
        usuario.put(24, "Lucas");
        usuario.put(2, "Joana");
        System.out.println(usuario);
        System.out.println(usuario.keySet());
        System.out.println(usuario.values());
        System.out.println(usuario.entrySet());
        System.out.println(usuario.get(24));
        System.out.println((usuario.containsValue("Luana")) ? "Luana" : "Não existe");

        for (int n : usuario.keySet()){
            System.out.println(n);
        }
        System.out.println();

        for (String s : usuario.values()){
            System.out.println(s);
        }

        System.out.println();

        for (int i : usuario.keySet()){
            System.out.print( i + ":");
            for (String s : usuario.values()){
                if (s.equals(usuario.get(i))){
                    System.out.println(s);
                    break;
                }
            }
        }
        for (Map.Entry<Integer, String> registro : usuario.entrySet()){
            System.out.print(registro.getKey() + "->");
            System.out.println(registro.getValue());
        }
        System.out.println(usuario.remove(24));
        System.out.println(usuario);
        System.out.println(usuario.remove(13, "Luana"));
        System.out.println(usuario);
    }
}
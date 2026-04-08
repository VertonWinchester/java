package fundamentos;

import java.util.ArrayList;
import java.util.List;

public class PercorrendoListas {
    public static void main(String[] args) {
        List<String> listas = new ArrayList<>();
        listas.add("Juca");
        listas.add("Helena");
        listas.add("Samara");
        listas.add("Sebastiao");

        System.out.println(listas.indexOf("Samara"));

        for (int i = 0; i < listas.size(); i++){
            System.out.println(listas.get(i));
        }
        for (String lisa : listas){
            System.out.println(lisa.indexOf("Helena"));
        }
        for (int l = 0; l < listas.size(); l++){
            System.out.printf("%d - %s\n", l, listas.get(l));
        }
    }
}

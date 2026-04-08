package colecao;

import java.util.HashSet;

@SuppressWarnings("ALL")
public class ConjuntoBaguncado {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        HashSet conjunto2 = new HashSet();

        conjunto.add("Everton");
        conjunto.add(2.5);
        conjunto.add(5);
        conjunto.add('v');
        conjunto.add(false);

        conjunto2.add("Juliana");
        conjunto2.add(5);
        conjunto2.add(true);

        System.out.println(conjunto.size());
        System.out.println(conjunto.stream().count());
        System.out.println(conjunto.contains(false));
        System.out.println(conjunto.contains(true));
        conjunto.remove("Everton");
        System.out.println(conjunto);
        System.out.println(conjunto.isEmpty());
        System.out.println(conjunto.stream().count());
        System.out.println(conjunto.addAll(conjunto2));
        System.out.println(conjunto.retainAll(conjunto2));
        System.out.println(conjunto.removeAll(conjunto));
        System.out.println(conjunto.removeAll(conjunto2));
        System.out.println(conjunto.isEmpty());
        System.out.println(conjunto);
        System.out.println(conjunto2);





    }
}

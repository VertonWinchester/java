package Poo;

public class CompraTeste {
    public static void main(String[] args) {

        Comprar comprar1 = new Comprar();
        comprar1.clinte = "João Pedro";
        comprar1.adicionarItem(new Itens("Caneta", 20, 7.45));
        comprar1.adicionarItem(new Itens("Borracha", 12, 3.89));
        comprar1.adicionarItem(new Itens("Caderno", 3, 18.79));


        System.out.println(comprar1.itens.size());
        System.out.println(comprar1.obterValorTotal());
    }
}

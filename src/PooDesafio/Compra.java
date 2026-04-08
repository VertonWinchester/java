package PooDesafio;


import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> items = new ArrayList<>();

    void adicionarItem(Produto p, int quantidade){
        this.items.add(new Item(p, quantidade));
    }

    double obterValorTotal(){
        double total = 0;

        for (Item item : items){
            total += item.quantidade * item.produto.preco;
        }

        return total;
    }

}

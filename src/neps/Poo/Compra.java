package Poo;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    Item item;
    List<Compra> listItem = new ArrayList<>();

    Compra(Item item){
        this.item = item;
        listItem.add(this);
    }

    double valorTotal(){
        double total = 0.0;
        for (Compra i: listItem){
            total += i.item.quantidade * i.item.produto.preco;
        }
        return total;
    }

}

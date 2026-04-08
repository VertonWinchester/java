package Poo;

import java.util.ArrayList;
import java.util.List;

public class Item {

    int quantidade;
    Produto produto;
    List<Item> listProduto = new ArrayList<>();

    Item(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
        listProduto.add(this);
    }

}

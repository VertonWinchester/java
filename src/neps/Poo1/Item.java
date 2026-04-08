package neps.Poo1;

import java.util.ArrayList;
import java.util.List;

public class Item {

    int quantidade;
    neps.Poo1.Produto produto;
    List<Item> listProduto = new ArrayList<>();

    Item(neps.Poo1.Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
        listProduto.add(this);
    }

}

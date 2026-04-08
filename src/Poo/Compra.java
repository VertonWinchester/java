package Poo;

import java.util.ArrayList;

public class Compra {

    String clinte;
    ArrayList<Itens> itens = new ArrayList<>();

    void adicionarItem(Itens item){
        itens.add(item);
        item.compra = this;
    }

    double obterValorTotal(){
        double total = 0;
        for ( Itens item: itens){
            total += item.quantidade * item.preco;
        }

        return total;
    }
}

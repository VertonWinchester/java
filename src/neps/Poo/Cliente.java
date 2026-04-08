package Poo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    String name;
    Compra compra;
    List<Cliente> clientes = new ArrayList<>();

    Cliente(String name, Compra compra){
        this.compra = compra;
        this.name = name;
        clientes.add(this);
    }

    @Override
    public String toString(){
        double preco = 0.0;
        int qutd = 0;
        String tipo = "";
        double total = 0.0;

        for (Cliente i: clientes){
            preco = i.compra.item.produto.preco;
            qutd = i.compra.item.quantidade;
            tipo = i.compra.item.produto.name;
            total = i.compra.valorTotal();
        }

        return String.format("O cliente %s comprou %d %s. valor unitario: %.2f\n" +
                        "valor total da compra R$%.2f",
                name, qutd, tipo, preco, total);
    }
}

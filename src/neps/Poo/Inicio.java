package Poo;


public class Inicio {

    public static void main(String[] args) {
        Produto produto1 = new Produto("Caneta", 3.0);
        Item item1 = new Item(produto1, 8);
        Compra compra1 = new Compra(item1);
        Cliente cliente = new Cliente("Juquinha", compra1);


        System.out.println(cliente);



    }
}

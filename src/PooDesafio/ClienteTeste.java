package PooDesafio;


public class ClienteTeste {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Mari");

        Compra compra1 = new Compra();
        compra1.adicionarItem(new Produto("impressora", 399.55), 2);
        cliente.compras.add(compra1);
        System.out.println(cliente.valorTotal());
    }
}

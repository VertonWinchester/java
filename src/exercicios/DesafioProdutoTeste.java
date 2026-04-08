package exercicios;

public class DesafioProdutoTeste {

    public static void main(String[] args) {
        DesafioProduto p1 = new DesafioProduto();
        p1.name = "Geladeira";
        p1.preco = 2500.50;
        DesafioProduto p2 = new DesafioProduto("monitor", 1399.99);
        var p3 = new DesafioProduto("Fogão", 1987.99);
        var p4 = new DesafioProduto("Lava-Roupas", 3500.20);
        System.out.println(p1.mostrar());
        System.out.println(p2.mostrar());
        System.out.println(p3.mostrar());
        System.out.println(p4.mostrar());

        DesafioProduto.desconto = 0.65;
        System.out.println();

        System.out.println(p1.mostrar());
        System.out.println(p2.mostrar());
        System.out.println(p3.mostrar());
        System.out.println(p4.mostrar());

    }
}

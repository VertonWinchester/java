package classe;


public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Caneta preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1);
        System.out.println(p2);
        System.out.printf("%s %.2f %.0f", p2.nome, p2.preco, p2.desconto * 100);
        System.out.println("%");
        System.out.printf("%s %.2f %.0f%s", p1.nome, p1.preco, p1.desconto * 100, "%");
    }
}

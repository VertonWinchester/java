package exercicios;

public class DesafioProduto {
    String name;
    double preco;
    static double desconto = 0.25;

    DesafioProduto(String name, double preco){
        this.name = name;
        this.preco = preco;
    }

    DesafioProduto(double desconto){
        DesafioProduto.desconto = desconto;
    }

    DesafioProduto(){}

    String mostrar(){
        return String.format("Produto %s custa %.2fR$ com nosso super desconto sairar por" +
                " apenas %.2fR$",name, preco, preco * (1 - desconto));
    }

}

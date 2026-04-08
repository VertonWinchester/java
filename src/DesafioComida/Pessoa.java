package DesafioComida;

public class Pessoa {
    String name;
    double peso;
    final double pesoFixo;

    Pessoa(String name, double peso){
        this.name = name;
        this.peso = peso;
        this.pesoFixo = peso;
    }
}

package DesafioComida;

import java.util.ArrayList;

public class Jantar{
    void comer(Pessoa pessoa, Comida comida){
        pessoa.peso += comida.peso;
        pessoa.name = pessoa.name + String.format("\ncomeu %s", comida.name);
    }
    String satisfeito(Pessoa pessoa){
        return String.format("\n%s \npeso atual %.2fKG\npeso anterior %.2f",
                pessoa.name, pessoa.peso, pessoa.pesoFixo);
    }
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Carlos", 89);
        Pessoa p2 = new Pessoa("Joana", 60);
        Pessoa p3 = new Pessoa("Patricia", 55);
        Pessoa p4 = new Pessoa("juca", 110);

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
//        pessoas.set(1, p3);

        Comida c1 = new Comida("Macarronada", 0.800);
        Comida c2 = new Comida("Carne", 0.400);
        Comida c3 = new Comida("Lasanha", 0.600);
        Comida c4 = new Comida("Salada", 0.100);

        Jantar jantar = new Jantar();
        jantar.comer(p1, c2);
        jantar.comer(p1, c3);

        jantar.comer(p2, c4);

        jantar.comer(p3, c4);
        jantar.comer(p3, c2);

        jantar.comer(p4, c1);
        jantar.comer(p4, c2);
        jantar.comer(p4, c3);
        jantar.comer(p4, c4);

        for (Pessoa i : pessoas){
            System.out.println(jantar.satisfeito(i));
        }
    }
}
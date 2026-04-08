package classe;

public class ConstrutoresTreinando {
    int soma;
    String name;

    ConstrutoresTreinando (int a, int b, int c){
        soma = a + b + c;
    }

    ConstrutoresTreinando(String nome){
        name = nome;
    }

    ConstrutoresTreinando(){
        soma = 0;
        name = "sem nome";
    }
}

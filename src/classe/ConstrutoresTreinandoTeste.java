package classe;

public class ConstrutoresTreinandoTeste {

    public static void main(String[] args) {
        ConstrutoresTreinando cons = new ConstrutoresTreinando();
        cons.name = "suzane";
        cons.soma = 15;
        System.out.printf("%s %d\n", cons.name, cons.soma);


        //nesse caso apresentaria erro, pois não existe nenhum construtor com 4 paramentros
//        ConstrutoresTreinando cons1 = new ConstrutoresTreinando("juca", 10, 50, 30);
        ConstrutoresTreinando cons1 = new ConstrutoresTreinando(10, 50, 30);
        System.out.printf("%s %d\n", cons1.name, cons1.soma);

        ConstrutoresTreinando cons2 = new ConstrutoresTreinando("juca");
        System.out.printf("%s %d\n", cons2.name, cons2.soma);

        ConstrutoresTreinando cons3 = new ConstrutoresTreinando();
        System.out.printf("%s %d\n", cons3.name,cons2.soma);
    }

}

package classe;

public class InstanciaTreinandoTeste {

    //uma variável static não possui instâncias diferentes.
    // O valor atribuido a uma isntancia modificarar o valor das outras instâncias.

    public static void main(String[] args) {
        InstanciaTreinando inst1 = new InstanciaTreinando();
        inst1.sexo = 'M';
        inst1.name = "juca";
        inst1.old = 29;

        InstanciaTreinando inst2 = new InstanciaTreinando();
        inst2.sexo = 'F';
        inst1.name = "Luciana";
        inst1.old = 23;

        System.out.println(inst1.sexo);
        System.out.println(inst1.name);
        System.out.println(inst1.old);

        System.out.println();

        System.out.println(inst2.sexo);
        System.out.println(inst2.name);
        System.out.println(inst2.old);
    }
}

package fundamentos;

import java.util.Scanner;

public class TiposStringEquals {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String ususario = entrada.next().trim();
        String comparar = entrada.next().trim();
        String s = new String("2");
        System.out.println(s == "2");
        System.out.println(s.equals("2"));
        System.out.println(ususario == comparar);
        System.out.println(ususario.equals(comparar));

        //next() tira os espaços em branco
        //nextLine não tira os espaços em branco
    }
}

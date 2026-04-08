package controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String usuario = "";
        while (!usuario.equalsIgnoreCase("sair")){
            System.out.println("Digite alguma coisa: ");
            usuario = entrada.next();
            System.out.println(usuario);
            entrada.close();
        }
    }
}

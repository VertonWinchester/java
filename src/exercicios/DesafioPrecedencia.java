package exercicios;

public class DesafioPrecedencia {
    public static void main(String[] args) {
        double dividendo1 = 3 * 2;
        double dividendo2 = 2;
        double dividendo3 = Math.pow(10,3);
        double linha1 = Math.pow(6* (3+2), 2) / dividendo1;
        double linha2 = Math.pow((1-5) * (2-7) / dividendo2, dividendo2);
        System.out.println(Math.pow(linha1 - linha2, 3) / dividendo3) ;
    }
}

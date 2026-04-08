package exercicios;


public class Corrida {
    String name;
    double distancia;

    Corrida(String name, double distancia){
        this.name = name;
        this.distancia = distancia;
    }

    public String regras(){
        int voltas = 0;
        while (true){
            if (distancia >= 4){
                voltas += 1;
                distancia -= 4;
            }else return String.format("%d volta e %.2f", voltas, distancia);
        }
    }
}

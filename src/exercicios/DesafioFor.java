package exercicios;


public class DesafioFor {
    public static void main(String[] args) {
        for (String verton = "#"; !verton.equals("##########");verton += "#"){
            System.out.println(verton);
        }
    }
}

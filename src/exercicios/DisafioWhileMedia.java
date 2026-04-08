package exercicios;


import javax.swing.*;

public class DisafioWhileMedia {
    public static void main(String[] args) {
        String notas = "";
        double media = 0;
        int contador = 0;
        double verificador;

        while (!notas.equalsIgnoreCase("-1")){
            notas = JOptionPane.showInputDialog(String.format("Digite a %d° nota", contador+1));
            try {
                verificador = Double.parseDouble(notas);
                if (verificador <=10 && verificador >= 0) {
                    media += verificador;
                    contador++;
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Digite um valor válido");
            }
        }
        JOptionPane.showMessageDialog(null, String.format("Média de aluno: %.2f\n" +
                "total de notas válidas: %d", media / contador, contador));
    }
}

package exercicios;

import javax.swing.*;

public class DesafioTelevisaoSorvete {
    public static void main(String[] args) {
        String trabalho1 = JOptionPane.showInputDialog("O Trabalho de terça está confirmado? ").toLowerCase();
        String trabalho2 = JOptionPane.showInputDialog("O Trabalho de quinta está confirmado? ").toLowerCase();
        if (trabalho1.equals("sim") || trabalho1.equals("s")){
            if (trabalho2.equals("sim") || trabalho2.equals("s")){
                JOptionPane.showMessageDialog(null,
                        "Vamos comprar uma TV de 50 polegadas e tomaremos sorvete!!!");
            }else {
                JOptionPane.showMessageDialog(null,
                        "Vamos comprar uma TV de 32 polegadas e tomaremos sorvete!!!");
            }
        }else {
            if (trabalho2.equals("sim") || trabalho2.equals("s")){
                JOptionPane.showMessageDialog(null,
                        "Vamos comprar uma TV de 32 polegadas e tomaremos sorvete!!!");
            }else {
                JOptionPane.showMessageDialog(null,
                        "Ficaremos em casa, comeremos uma comida saudável");
            }
        }
    }
}
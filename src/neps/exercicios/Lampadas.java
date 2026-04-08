package exercicios;

import javax.swing.*;

public class Lampadas {
    public static void main(String[] args) {
        int luz1 = Integer.parseInt(JOptionPane.showInputDialog("Interruptor1 : "));
        int luz2 = Integer.parseInt(JOptionPane.showInputDialog("Interruptor2: "));
        boolean ligado1 = false;
        boolean ligado2 = false;
        for (int i = 0; i < luz1; i++) {
            ligado1 = !ligado1;
        }
        for (int i = 0; i < luz2; i++) {
            ligado1 = !ligado1;
            ligado2 = !ligado2;
        }

        String lampada1 = (ligado1) ? "Lampada1 acesa!" : "Lampada1 apagada";
        String lampada2 = (ligado2) ? "Lampada2 acesa!" : "Lampada2 apagada";
        System.out.printf("%s\n%s", lampada1, lampada2);
    }
}

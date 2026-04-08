package exercicios;


import javax.swing.*;
import java.awt.*;

public class TesteGrid {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        JButton b1 = new JButton ("1");
        JButton b2 = new JButton ("2" );
        JButton b3 = new JButton ("3" );
        JButton b4 = new JButton ("4" );
        JButton b5 = new JButton ("5" );
        JButton b6 = new JButton ("6" );
        JButton b7 = new JButton ("7" );
        JButton b8 = new JButton ("8" );
        JButton b9 = new JButton ("9" );

        janela.add (b1); janela.add (b2); janela.add (b3); janela.add (b4); janela.add (b5);
        janela.add (b6); janela.add (b7); janela.add (b8); janela.add (b9);

        janela.setLayout(new GridLayout(3, 3));

        janela.setSize(300, 300);
        janela.setVisible(true);

    }
}

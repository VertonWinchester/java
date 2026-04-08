package exercicios;

import javax.swing.*;

public class DesafioBissexto {
    public static void main(String[] args) {
        String entrada = JOptionPane.showInputDialog("Digite um ano qualquer: ");
        int dados = Integer.parseInt(entrada);
        if (dados % 4 == 0) JOptionPane.showMessageDialog(null,
                String.format("%d é Bissexto", dados));
        else JOptionPane.showMessageDialog(null,
                String.format("%d não é Bissexto", dados));
    }
}

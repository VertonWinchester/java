package exercicios;

import javax.swing.*;

public class ConversaoStringNumeros {

    public static void main(String[] args) {
        String num1 = JOptionPane.showInputDialog("Digite primeiro numero:");
        String num2 = JOptionPane.showInputDialog("Digite segundo numero:");

        JOptionPane.showMessageDialog(null,
                String.format("%s", Double.parseDouble(num1) + Double.parseDouble(num2)));
    }
}

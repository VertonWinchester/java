package controle;

import javax.swing.*;

public class WhileDeterminado {
    public static void main(String[] args) {
        double media = 0;
        int cont = 1;
        while (cont <=3){
            String entrada = JOptionPane.showInputDialog(String.format("Digite %d° nota", cont));
            try {
                media += Double.parseDouble(entrada);
                cont++;
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Valor inválido!");
            }
        }
        media = media / 3;
        JOptionPane.showMessageDialog(null, String.format("resultado %.2f", media));
    }
}

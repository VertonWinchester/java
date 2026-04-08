package exercicios;

import javax.swing.*;

public class DesafioDataTeste {
    public static void main(String[] args) {
        DesafioData data1 = new DesafioData();
        data1.dia = 5;
        data1.mes = 11;
        data1.ano = 1812;

        var data2 = new DesafioData();
        data2.dia = 14;
        data2.mes = 3;
        data2.ano = 1989;

        DesafioData data3 = new DesafioData();
        DesafioData data4 = new DesafioData(26, 5, 1991);

        JOptionPane.showMessageDialog(null, data1.obterDataFormatada());
        JOptionPane.showMessageDialog(null, data2.obterDataFormatada());
        JOptionPane.showMessageDialog(null, data3.obterDataFormatada());
        JOptionPane.showMessageDialog(null, data4.obterDataFormatada());
    }
}

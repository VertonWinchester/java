package fundamentos;

import javax.swing.*;
public class Ternario {
    public static void main(String[] args) {
        String notas;
        double media = 0;
        for (int i = 1; i <= 3; i++){
            notas = JOptionPane.showInputDialog(String.format("Digite %s° nota: ", i));

            if (notas != null){
                try{
                    media += Double.parseDouble(notas);
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "Digite um valor válido!");
                }
            }

            /*esse método não funciona.
             * Pois não aceita numeros reais
             */

//            if (notas.matches("[0-9]")){
//                media += Double.parseDouble(notas);
//            }else {
//                JOptionPane.showMessageDialog(null, "Digite um valor válido!");
//            }

        }
        media /= 3;
        String parcial = media <= 5 ? "reprovado" : " em  recuperação ";
        String resultado = media <= 6.9 ? parcial : "Aprovado";

        JOptionPane.showMessageDialog(null, String.format("sua média foi %.2f (%s)", media, resultado));
    }
}

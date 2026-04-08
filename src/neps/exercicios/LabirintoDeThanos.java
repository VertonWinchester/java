package exercicios;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LabirintoDeThanos {
    public static void main(String[] args) {
        int M = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        int N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        Set<Character> contem = new HashSet<>();
        List<Character> elementos = List.of('a', 'b', 'c', 'd', 'A', 'B', 'C', 'D',
                'p', 't', 'm', 'e', 'r', 'T');
        Random aleatorio = new Random();

        JFrame windos = new JFrame();
        while (contem.size() < 14){
            for (int j = 0; j < M; j++) {
                for (int i = 0; i < N; i++) {
                    int roleta = aleatorio.nextInt(26);
                    char espaco = (aleatorio.nextInt(5) < 4) ? '-' : '#';
                    if (roleta > 13){
                        windos.add(new Button(String.format("%s",espaco)));
                    }else if (!contem.contains(elementos.get(roleta))){
                        windos.add(new Button(String.format("%s", elementos.get(roleta))));
                        contem.add(elementos.get(roleta));
                    }else windos.add(new Button("#"));
                }
            }
        }
//        System.exit(0); fecha o programa antes de mostrar
        windos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windos.setLayout(new GridLayout(M, N));
        windos.setSize(500, 500);
        windos.setVisible(true);
    }
}

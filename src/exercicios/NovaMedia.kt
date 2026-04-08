package exercicios

import com.sun.tools.javac.util.Pair
import java.util.ArrayList
import javax.swing.JOptionPane

fun main() {
    val alunos = ArrayList<Pair<String, Double>>()
    val soma = arrayListOf<Double>()
    var name: String
    for (i in 1..3){
        name = JOptionPane.showInputDialog("Digite seu nome")
        for (l in 1..3){
            soma.add(JOptionPane.showInputDialog("Informe a $l° nota").toDouble())
        }
        alunos.add(Pair(name, soma.average()))
    }
    for (i in alunos){
        JOptionPane.showMessageDialog(null,
        "Aluno(a) ${i.first} teve média %.1f".format(i.second))
    }
}
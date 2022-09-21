package br.com.unipar.exercicio1.fila.main;

import br.com.unipar.exercicio2.fila.models.Fila;
import javax.swing.JOptionPane;

public class Exercicio1_fila {

    private static Fila fila;

    public static void main(String[] args) {
        fila = new Fila(20);
        int opcao = -1;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma das opções abaixo:\n"
                    + "\n1 - Adicione um paciente a fila"
                    + "\n2 - Chame o próximo paciente"
                    + "\n0 - Sair\n\n"));
            if (opcao == 1) {
                if (fila.isFull()) {
                    JOptionPane.showMessageDialog(null, "A pilha já está cheia, chame o próximo paciente.");
                } else {
                    adcPaciente();
                }
            } else if (opcao == 2) {
                chamaPaciente();
            }
        } while (opcao != 0);

    }

    public static void adcPaciente() {
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do paciente:");
        fila.enqueue(nome);
    }

    public static void chamaPaciente() {
        if (fila.isEmpty()) {
            JOptionPane.showMessageDialog(null, "A fila está vazia!");
        } else {
            JOptionPane.showMessageDialog(null, fila.dequeue());
        }

    }
}

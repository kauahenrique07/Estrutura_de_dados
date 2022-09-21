package br.com.unipar.exercicio2.fila.main;

import br.com.unipar.exercicio2.fila.models.Cliente;
import br.com.unipar.exercicio2.fila.models.Fila;
import javax.swing.JOptionPane;

public class Exercicio2_fila {

    private static Fila filanorm;
    private static Fila filapref;
    private static Fila filaux;
    static int cont = 1;

    public static void main(String[] args) {
        Cliente a = new Cliente(1, "Richard", 1961);
        Cliente b = new Cliente(2, "Pedro", 1960);
        Cliente c = new Cliente(3, "Vania", 1959);
        Cliente d = new Cliente(4, "Leticia", 1958);
        Cliente e = new Cliente(5, "Iagor", 1957);
        Cliente f = new Cliente(6, "Henrique", 1956);
        Cliente g = new Cliente(7, "Lais", 1955);
        Cliente h = new Cliente(8, "Eduardo", 1954);
        Cliente i = new Cliente(9, "Gabriel", 1953);
        Cliente j = new Cliente(10, "Dennis", 1952);
        Cliente k = new Cliente(11, "Téo", 1951);
        Cliente l = new Cliente(12, "Djavan", 1950);
        Cliente m = new Cliente(13, "Manir", 1949);
        Cliente n = new Cliente(14, "Rafael", 1948);
        filanorm = new Fila(15);
        filapref = new Fila(15);
        filaux = new Fila(15);
        filaux.enqueue(a);
        filaux.enqueue(b);
        filaux.enqueue(c);
        filaux.enqueue(d);
        filaux.enqueue(e);
        filaux.enqueue(f);
        filaux.enqueue(g);
        filaux.enqueue(h);
        filaux.enqueue(i);
        filaux.enqueue(j);
        filaux.enqueue(k);
        filaux.enqueue(l);
        filaux.enqueue(m);
        filaux.enqueue(n);
        int opcao = -1;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma das opções abaixo:\n"
                    + "\n1 - Adicione um paciente à fila"
                    + "\n2 - Chame o próximo paciente"
                    + "\n0 - Sair\n\n"));
            if (opcao == 1) {
                if (filanorm.isFull() || filapref.isFull()) {
                    JOptionPane.showMessageDialog(null, "Uma das pilhas já está cheia, chame o próximo paciente!");
                } else {
                    addPaciente();
                }
            } else if (opcao == 2) {
                chamaPaciente();
            }
        } while (opcao != 0);

    }

    public static void addPaciente() {

        if ((2022 - filaux.mostraFrente().getAnoNascimento()) >= 65) {
            JOptionPane.showMessageDialog(null, filaux.mostraFrente().getNome());
            filapref.enqueue(filaux.dequeue());
        } else {
            JOptionPane.showMessageDialog(null, filaux.mostraFrente().getNome());
            filanorm.enqueue(filaux.dequeue());
        }
    }

    public static void chamaPaciente() {

        if (filapref.isEmpty() && filanorm.isEmpty()) {
            JOptionPane.showMessageDialog(null, "A fila está vazia!");
        } else if (cont <= 2 && filapref.isEmpty() == false) {
            cont++;
            JOptionPane.showMessageDialog(null, filapref.dequeue().getNome());
        } else {
            JOptionPane.showMessageDialog(null, filanorm.dequeue().getNome());
            cont = 0;
        }

    }

}

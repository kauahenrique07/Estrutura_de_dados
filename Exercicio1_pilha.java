package br.com.unipar.exercicio1.pilha.main;

import br.com.unipar.exercicio1.pilha.models.Pilha;
import javax.swing.JOptionPane;

public class Exercicio1_pilha {

    private static Pilha<String> pilha;

    public static void main(String[] args) {

        pilha = new Pilha<>(20);
        int opcao = -1;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma das opções abaixo:\n"
                    + "\n1 - Adicione um livro na pilha"
                    + "\n2 - Remove um livro da pilha"
                    + "\n3 - Lista a pilha"
                    + "\n0 - Sair\n\n"));

            switch (opcao) {
                case 1:
                    if (pilha.isFull()) {
                        JOptionPane.showMessageDialog(null, "A pilha está cheia, remova um livro do topo!");
                    } else {
                        addLivro();
                    }
                    break;
                case 2:
                    if (pilha.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "A pilha está vazia!");
                    } else {
                        removeLivro();
                    }
                    break;

                case 3:
                    if (pilha.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não há itens na pilha!");
                    } else {
                        listaLivro();
                    }
                    break;
            }
        } while (opcao != 0);

    }

    public static void addLivro() {
        String str = JOptionPane.showInputDialog("Informe o nome de um livro: ");
        if (str != null) {
            pilha.push(str);
        }
    }

    public static void removeLivro() {
        String str = JOptionPane.showInputDialog("O livro " + pilha.top() + " será removido, deseja mesmo prosseguir?(Y/N)");
        if (str.toUpperCase().equals("Y")) {
            pilha.pop();
            JOptionPane.showMessageDialog(null, "Livro removido!");
        } else {
            JOptionPane.showMessageDialog(null, "Processo cancelado!");
        }
    }

    public static void listaLivro() {
        int aux = pilha.getPosicaoTopo();
        String str = "Livros da Pilha: ";
        while (!pilha.isEmpty()) {
            str += "\n" + pilha.pop();
        }

        JOptionPane.showMessageDialog(null, str);
        pilha.setPosicaoTopo(aux);
    }

}

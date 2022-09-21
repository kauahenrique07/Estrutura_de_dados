package br.com.unipar.exercicio2.pilha.main;

import br.com.unipar.exercicio2.pilha.models.Pilha;
import br.com.unipar.exercicio2.pilha.models.Produto;
import javax.swing.JOptionPane;

public class Exercicio2_pilha {

    private static Pilha<Produto> pilha;
    private static Pilha<Produto> pilha2;

    public static void main(String[] args) {
        Produto a = new Produto(1, "Vassoura", "23/03/22", "PR", "AM");
        Produto b = new Produto(2, "Pão", "24/04/22", "PR", "AM");
        Produto c = new Produto(3, "Carne", "25/05/22", "PR", "AM");
        Produto d = new Produto(4, "Tomate", "26/06/22", "PR", "AM");
        Produto e = new Produto(5, "Colônia", "27/07/22", "PR", "AM");
        Produto f = new Produto(6, "Monster", "28/08/22", "PR", "AM");
        Produto g = new Produto(7, "Chips", "29/09/22", "PR", "AM");
        Produto h = new Produto(8, "Arroz", "30/10/22", "PR", "AM");
        Produto i = new Produto(9, "Feijão", "31/11/22", "PR", "AM");
        Produto j = new Produto(10, "Abacaxi", "01/12/22", "PR", "AM");
        Produto k = new Produto(11, "Creme dental", "02/01/23", "PR", "AM");
        Produto l = new Produto(12, "Gillette", "03/02/23", "PR", "AM");
        Produto m = new Produto(13, "Trident", "04/03/23", "PR", "AM");
        pilha = new Pilha<>(10);
        pilha2 = new Pilha<>(20);
        pilha2.push(a);
        pilha2.push(b);
        pilha2.push(c);
        pilha2.push(d);
        pilha2.push(e);
        pilha2.push(f);
        pilha2.push(g);
        pilha2.push(h);
        pilha2.push(i);
        pilha2.push(j);
        pilha2.push(k);
        pilha2.push(l);
        pilha2.push(m);

        int opcao = -1;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma das opções abaixo:\n"
                    + "\n1 - Adicione uma caixa na pilha"
                    + "\n2 - Remove uma caixa na pilha"
                    + "\n3 - Lista a pilha"
                    + "\n4 - Lista os produto(s)"
                    + "\n0 - Sair\n\n"));
            switch (opcao) {
                case 1:
                    if (pilha.isFull()) {
                        JOptionPane.showMessageDialog(null, "A pilha já está cheia, remova a caixa do topo!");
                    } else {
                        addCaixa();
                    }
                    break;
                case 2:
                    if (pilha.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "A pilha está vazia!");
                    } else {
                        removeCaixa();
                    }
                    break;
                case 3:
                    if (pilha.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não há itens na pilha!");
                        break;
                    } else {
                        listaCaixa();
                        break;
                    }

                case 4:
                    listaProdutos();
                    break;
            }

        } while (opcao != 0);

    }

    public static void addCaixa() {
        if (!pilha.isFull()) {
            pilha.push(pilha2.top());
            pilha2.pop();
        } else {
            System.out.println("A pilha já está cheia, retire o produto do topo!");
        }
        listaCaixa();
    }

    public static void removeCaixa() {
        String str = JOptionPane.showInputDialog("O produto " + pilha.top().getDescricao() + " será removido, deseja mesmo prosseguir?(Y/N)");
        if (str.toUpperCase().equals("Y")) {
            pilha.pop();
            JOptionPane.showMessageDialog(null, "Caixa removida!");
        } else {
            JOptionPane.showMessageDialog(null, "Processo cancelado!");
            listaCaixa();
        }
    }

    public static void listaCaixa() {
        int aux = pilha.getPosicaoTopo();
        String str = "Produtos da Pilha: ";
        while (!pilha.isEmpty()) {
            if (pilha.getPosicaoTopo() == -1) {
                break;
            }
            str += "\n" + pilha.top().getDescricao();
            pilha.pop();
        }

        JOptionPane.showMessageDialog(null, str);
        pilha.setPosicaoTopo(aux);
    }

    public static void listaProdutos() {
        int aux = pilha2.getPosicaoTopo();
        String str = "Produtos da Pilha:";
        while (!pilha2.isEmpty()) {
            if (pilha2.getPosicaoTopo() == -1) {
                break;
            }
            str += "\n" + pilha2.top().getDescricao();
            pilha2.pop();
        }

        JOptionPane.showMessageDialog(null, str);
        pilha2.setPosicaoTopo(aux);
    }

}

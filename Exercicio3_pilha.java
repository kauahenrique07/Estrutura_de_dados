package br.com.unipar.exercicio3.pilha.main;

import br.com.unipar.exercicio3.pilha.models.Pilha;
import br.com.unipar.exercicio3.pilha.models.Produto;
import javax.swing.JOptionPane;

public class Exercicio3_pilha {

    private static Pilha<Produto> pilha;
    private static Pilha<Produto> pilha2;
    private static Pilha<Produto> pilha3;
    private static Pilha<Produto> pilha4;
    private static Pilha<Produto> pilha5;
    private static Pilha<Produto> pilha6;

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
        pilha2 = new Pilha<>(10);
        pilha3 = new Pilha<>(10);
        pilha4 = new Pilha<>(10);
        pilha5 = new Pilha<>(10);
        pilha6 = new Pilha<>(20);
        pilha6.push(a);
        pilha6.push(b);
        pilha6.push(c);
        pilha6.push(d);
        pilha6.push(e);
        pilha6.push(f);
        pilha6.push(g);
        pilha6.push(h);
        pilha6.push(i);
        pilha6.push(j);
        pilha6.push(k);
        pilha6.push(l);
        pilha6.push(m);

        int opcao = -1;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma das opções abaixo: \n"
                    + "\n1 - Adicione uma caixa na pilha"
                    + "\n2 - Remove uma caixa na pilha"
                    + "\n3 - Lista pilha"
                    + "\n4 - Lista produto(s)"
                    + "\n0 - Sair\n\n"));
            switch (opcao) {
                case 1:
                    if (pilha.isFull()) {
                        JOptionPane.showMessageDialog(null, "A pilha está cheia, remova uma caixa do topo!");
                    } else {
                        addCaixa();
                    }
                    break;
                case 2: {
                    removeCaixa();
                }
                break;
                case 3: {
                    listaCaixa();
                }
                break;
                case 4:
                    listaProd();
                    break;
            }

        } while (opcao != 0);

    }

    public static void addCaixa() {
        int caixa;
        caixa = Integer.parseInt(JOptionPane.showInputDialog("Em qual pilha deseja adicionar um produto(1,2,3,4,5)?"));
        switch (caixa) {
            case 1:
                if (!pilha.isFull()) {
                    pilha.push(pilha6.top());
                    pilha6.pop();
                } else {
                    System.out.println("A pilha está cheia, retire o produto do topo!");
                }
                break;
            case 2:
                if (!pilha2.isFull()) {
                    pilha2.push(pilha6.top());
                    pilha6.pop();
                } else {
                    System.out.println("A pilha está cheia, retire o produto do topo!");
                }
                break;
            case 3:
                if (!pilha3.isFull()) {
                    pilha3.push(pilha6.top());
                    pilha6.pop();
                } else {
                    System.out.println("A pilha está cheia, retire o produto do topo!");
                }
                break;
            case 4:
                if (!pilha4.isFull()) {
                    pilha4.push(pilha6.top());
                    pilha6.pop();
                } else {
                    System.out.println("A pilha está cheia, retire o produto do topo!");
                }
                break;
            case 5:
                if (!pilha5.isFull()) {
                    pilha5.push(pilha6.top());
                    pilha6.pop();
                } else {
                    System.out.println("A pilha está cheia, retire o produto do topo!");
                }
                break;
            default:
                break;
        }
        listaCaixa();
    }

    public static void removeCaixa() {
        int caixa;
        caixa = Integer.parseInt(JOptionPane.showInputDialog("De qual pilha deseja remover um produto(1,2,3,4,5)?"));
        
        switch (caixa) {
            case 1: {
                String str = JOptionPane.showInputDialog("O produto " + pilha.top().getDescricao() + " será removido, deseja mesmo prosseguir?(Y/N)");
                if (str.toUpperCase().equals("Y")) {
                    pilha.pop();
                    JOptionPane.showMessageDialog(null, "Caixa removida!");
                } else {
                    JOptionPane.showMessageDialog(null, "Processo cancelado!");
                } 
                
                break;
            }

            case 2: {
                String str = JOptionPane.showInputDialog("O produto " + pilha2.top().getDescricao() + " será removido, deseja mesmo prosseguir?(Y/N)");
                if (str.toUpperCase().equals("Y")) {
                    pilha2.pop();
                    JOptionPane.showMessageDialog(null, "Caixa removida!");
                } else {
                    JOptionPane.showMessageDialog(null, "Processo cancelado!");
                }
                break;

            }

            case 3: {
                String str = JOptionPane.showInputDialog("O produto " + pilha3.top().getDescricao() + " será removido, deseja mesmo prosseguir?(Y/N)");
                if (str.toUpperCase().equals("Y")) {
                    pilha3.pop();
                    JOptionPane.showMessageDialog(null, "Caixa removida!");
                } else {
                    JOptionPane.showMessageDialog(null, "Processo cancelado!");
                }
                break;
            }

            case 4: {
                String str = JOptionPane.showInputDialog("O produto " + pilha4.top().getDescricao() + " será removido, deseja mesmo prosseguir?(Y/N)");
                if (str.toUpperCase().equals("Y")) {
                    pilha4.pop();
                    JOptionPane.showMessageDialog(null, "Caixa removida!");
                } else {
                    JOptionPane.showMessageDialog(null, "Processo cancelado!");
                }
                break;
            }

            case 5: {
                String str = JOptionPane.showInputDialog("O produto " + pilha5.top().getDescricao() + " será removido, deseja mesmo prosseguir?(Y/N)");
                if (str.toUpperCase().equals("Y")) {
                    pilha5.pop();
                    JOptionPane.showMessageDialog(null, "Caixa removida!");
                } else {
                    JOptionPane.showMessageDialog(null, "Processo cancelado!");
                }
                break;
            }

            default:
                break;
        }

        listaCaixa();
    }

    public static void listaCaixa() {
        int aux = pilha.getPosicaoTopo();
        String str = "";
        str += "\n Lista Produtos\n\n Pilha 1:";
        while (!pilha.isEmpty()) {
            if (pilha.getPosicaoTopo() == -1) {
                break;
            }
            str += "\n" + pilha.top().getDescricao();
            pilha.pop();
        }
        pilha.setPosicaoTopo(aux);
        aux = pilha2.getPosicaoTopo();
        str += "\n------------------------\n Pilha 2:";
        while (!pilha2.isEmpty()) {
            if (pilha2.getPosicaoTopo() == -1) {
                break;
            }
            str += "\n" + pilha2.top().getDescricao();
            pilha2.pop();
        }
        pilha2.setPosicaoTopo(aux);
        aux = pilha3.getPosicaoTopo();
        str += "\n------------------------\n Pilha 3: ";
        while (!pilha3.isEmpty()) {
            if (pilha3.getPosicaoTopo() == -1) {
                break;
            }
            str += "\n" + pilha3.top().getDescricao();
            pilha3.pop();
        }
        pilha3.setPosicaoTopo(aux);
        aux = pilha4.getPosicaoTopo();
        str += "\n------------------------\n Pilha 4:";
        while (!pilha4.isEmpty()) {
            if (pilha4.getPosicaoTopo() == -1) {
                break;
            }
            str += "\n" + pilha4.top().getDescricao();
            pilha4.pop();
        }
        pilha4.setPosicaoTopo(aux);
        aux = pilha5.getPosicaoTopo();
        str += "\n------------------------\n Pilha 5:";
        while (!pilha5.isEmpty()) {
            if (pilha5.getPosicaoTopo() == -1) {
                break;
            }
            str += "\n" + pilha5.top().getDescricao();
            pilha5.pop();
        }

        JOptionPane.showMessageDialog(null, str);
        pilha5.setPosicaoTopo(aux);
    }

    public static void listaProd() {
        int aux = pilha6.getPosicaoTopo();
        String str = "Produtos da Pilha:";
        while (!pilha6.isEmpty()) {
            if (pilha6.getPosicaoTopo() == -1) {
                break;
            }
            str += "\n" + pilha6.top().getDescricao();
            pilha6.pop();
        }

        JOptionPane.showMessageDialog(null, str);
        pilha6.setPosicaoTopo(aux);
    }

}

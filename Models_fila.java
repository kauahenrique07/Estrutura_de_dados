package br.com.unipar.exercicio2.fila.models;

public class Models_fila {

    private String[] dados;
    private int frente;
    private int fim;
    private int numItens;

    public Models_fila(int maximo) {
        dados = new String[maximo];
        frente = 0;
        fim = -1;
        numItens = 0;
    }

    public void enqueue(String numero) {
        if (fim == dados.length - 1) {
            fim = -1;
        }
        dados[++fim] = numero;
        numItens++;
    }

    public String dequeue(){
        String temp = dados[frente++];
        if(frente==dados.length){
            frente =0;
        }
        numItens--;
        return temp;
    }
    
    public boolean isEmpty(){
        return numItens ==0;
    }
    
    public boolean isFull(){
        return numItens == dados.length;
    }
    
    
}

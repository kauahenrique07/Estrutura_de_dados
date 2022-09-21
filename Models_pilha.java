
package br.com.unipar.exercicio1.pilha.models;

public class Models_pilha <String> {
    
    private String[] pilha;
    private int posicaoTopo;

    public int getPosicaoTopo() {
        return posicaoTopo;
    }

    public void setPosicaoTopo(int posicaoTopo) {
        this.posicaoTopo = posicaoTopo;
    }

    public Models_pilha(int tamanho) {
        pilha = (String []) new Object[tamanho];
        posicaoTopo = -1;
    }
    
    public void push(String e){
        pilha[++posicaoTopo] = e; 
    }
    
    public String pop(){
        return pilha[posicaoTopo--];
    }
    
    public String top(){
        return pilha[posicaoTopo];
    }
    
    public boolean isEmpty(){
        return posicaoTopo == -1;   
    }
    
    public boolean isFull(){
        return posicaoTopo == pilha.length-1;
    }
    
    
}
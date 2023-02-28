import java.util.Arrays;

import javax.swing.JOptionPane;

public class Pilha {
    public int[] elementos;
    private int quantidade;
    
    // Criar uma nova pilha – Pilha()
    public Pilha() {
        elementos = new int[10];
        quantidade = 0;
    }

    public Pilha(int tamanho) {
        elementos = new int[tamanho];
    }
    
    // Retornar a quantidade de elementos – getQuantidade()
    public int getQuantidade() {
        return quantidade;
    }

    // Verificar se a pilha está vazia – estaVazia()
    public boolean estaVazia() {
        if(quantidade == 0)
            return true;
        else
            return false;
    }

    // Verificar se a pilha está cheia, caso possua um limite – estaCheia()
    public boolean estaCheia() {
        if(quantidade == elementos.length)
            return true;
        else
            return false;
    }
    
    // Acessar o elemento no início da pilha – retornarElemento()
    public int retornarElemento() {
        return elementos[quantidade - 1];
    }

    // Inserir um elemento e no final da pilha – empilhar(e)
    public void empilhar(int elemento) {
        if(estaCheia())
            System.out.println("Não foi possível adicionar pois a pilha está cheia!");
        else {
            elementos[quantidade] = elemento;
            
            quantidade++;
        }
    }

    // Remover o elemento e no início da pilha – desempilhar()
    public void desempilhar() {
        if(estaVazia())
            System.out.println("Não foi possível remover pois a pilha está vazia!");
        else
            quantidade--;
    }
    
    //Exibir todos os elementos
    public void exibir(){
        String elementos = "";
        for (int i = quantidade - 1; i >= 0; i--)
            elementos += "\n" + this.elementos[i];
        
        JOptionPane.showMessageDialog(null, elementos);
    }

    public String toString() {
        return Arrays.toString(elementos);
    }
}
import java.util.Arrays;

import javax.swing.JOptionPane;






public class Fila {
    public int[] elementos;
    private int quantidade;
    
    // Criar uma nova fila – Fila()
    public Fila() {
        elementos = new int[10];
        quantidade = 0;
    }

    public Fila(int tamanho) {
        elementos = new int[tamanho];
    }
    
    // Retornar a quantidade de elementos – getQuantidade()
    public int getQuantidade() {
        return quantidade;
    }

    // Verificar se a fila está vazia – estaVazia()
    public boolean estaVazia() {
        if(quantidade == 0)
            return true;
        else
            return false;
    }

    // Verificar se a fila está cheia, caso possua um limite – estaCheia()
    public boolean estaCheia() {
        if(quantidade == elementos.length)
            return true;
        else
            return false;
    }
    
    // Acessar o elemento no início da fila – retornarElemento()
    public int retornarElemento() {
        return elementos[0];
    }

    private boolean validarEntrada(int indice) {
        if(indice >= 0 || indice <= quantidade)
            return true;
        else
            return false;
    }

    // Inserir um elemento e no final da fila – enfileirar(e)
    public void enfileirar(int elemento) {
        if(estaCheia())
            System.out.println("Não foi possível adicionar pois a fila está cheia!");
        else {
            elementos[quantidade] = elemento;
            
            quantidade++;
        }
    }

    // Remover o elemento e no início da fila – desenfileirar()
    public void desenfileirar() {
        if(estaVazia())
            System.out.println("Não foi possível remover pois a fila está vazia!");
        else {
            for(int i = 0; i < quantidade - 1; i++)
                elementos[i] = elementos[i+1];
            
            quantidade--;
        }
    }
    
    //Exibir todos os elementos
    public void exibir(){
        String elementos = this.elementos[0] + ", ";
        for (int i = 1; i < quantidade; i++) {
            elementos += this.elementos[i];

            if(i != (quantidade - 1))
                elementos += ", ";
        }
        
        JOptionPane.showMessageDialog(null, elementos);
    }

    public String toString() {
        return Arrays.toString(elementos);
    }
}
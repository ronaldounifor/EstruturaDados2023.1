package dinamico;

import javax.swing.JOptionPane;

public class PilhaEncadeada {
    private No primeiro;
    private int quantidade;

    // Criar uma nova Pilha – Pilha()
    public PilhaEncadeada() {
        primeiro = null;
        quantidade = 0;
    }

    public PilhaEncadeada(No primeiro) {
        this.primeiro = primeiro;
        quantidade = 1;
    }

    // Retornar a quantidade de elementos – getQuantidade()
    public int getQuantidade() {
        return quantidade;
    }

    // Verificar se a Pilha está vazia – estaVazia()
    public boolean estaVazia() {
        if(quantidade > 0)
            return false;
        else
            return true;
    }

    // Acessar o primeiro elemento – retornarElemento()
    public int retornarElemento() {
        No noAtual = primeiro;
        while(noAtual.getProximo() != null)
            noAtual = noAtual.getProximo();

        return noAtual.getElemento();
    }

    // Inserir um elemento e na ultima posição – empilhar(e)
    public void empilhar(int elemento) {
        No novoNo = new No(elemento, null);
            
        if(quantidade == 0)
            primeiro = novoNo;
        else {
            No noAtual = primeiro;
            while(noAtual.getProximo() != null)
                noAtual = noAtual.getProximo();
    
            noAtual.setProximo(novoNo);
        }

        quantidade++;
    }

    // Remover o elemento e na última posição – desempilhar()
    public void desempilhar() {
        if(estaVazia())
            System.out.println("Não é possível remover, Pilha vazia!");
        else {
            if(quantidade == 1)
                primeiro = null;
            else {
                No noAtual = primeiro;
                while(noAtual.getProximo().getProximo() != null)
                    noAtual = noAtual.getProximo();
                
                noAtual.setProximo(null);
            }
            quantidade--;
        }
    }

    //Exibir todos os elementos
    public void exibir(){
        String elementos = primeiro.getElemento() + "";

        No noAtual = primeiro;

        for (int i = 0; i < quantidade - 1; i++) {
            noAtual = noAtual.getProximo();
            elementos += ", " + noAtual.getElemento();
        }
        
        JOptionPane.showMessageDialog(null, elementos);
    }

}

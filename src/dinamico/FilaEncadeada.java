package dinamico;

import javax.swing.JOptionPane;

public class FilaEncadeada {
    
    private No primeiro;
    private int quantidade;

    // Criar uma nova Fila – Fila()
    public FilaEncadeada() {
        primeiro = null;
        quantidade = 0;
    }

    public FilaEncadeada(No primeiro) {
        this.primeiro = primeiro;
        quantidade = 1;
    }

    // Retornar a quantidade de elementos – getQuantidade()
    public int getQuantidade() {
        return quantidade;
    }

    // Verificar se a Fila está vazia – estaVazia()
    public boolean estaVazia() {
        if(quantidade > 0)
            return false;
        else
            return true;
    }

    // Acessar o primeiro elemento – retornarElemento()
    public int retornarElemento() {
        return primeiro.getElemento();
    }

    // Inserir um elemento e na ultima posição – enfileirar(e)
    public void enfileirar(int elemento) {
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

    // Remover o elemento e na primeira posição – desenfileirar()
    public void desenfileirar() {
        if(estaVazia())
            System.out.println("Não é possível remover, fila vazia!");
        else {
            primeiro = primeiro.getProximo();
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

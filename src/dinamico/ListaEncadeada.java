package dinamico;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ListaEncadeada {
    
    private No primeiro;
    private int quantidade;

    // Criar uma nova lista – Lista()
    public ListaEncadeada() {
        primeiro = null;
        quantidade = 0;
    }

    public ListaEncadeada(No primeiro) {
        this.primeiro = primeiro;
        quantidade = 1;
    }

    // Retornar a quantidade de elementos – getQuantidade()
    public int getQuantidade() {
        return quantidade;
    }

    // Verificar se a lista está vazia – estaVazia()
    public boolean estaVazia() {
        if(quantidade > 0)
            return false;
        else
            return true;
    }

    // Acessar o elemento na posição i – retornarElemento(i)
    public int retornarElemento(int indice) {
        No noAtual = primeiro;

        for (int i = 0; i < indice; i++)
            noAtual = noAtual.getProximo();

        return noAtual.getElemento();
    }

    private boolean validarEntrada(int indice) {
        if(indice >= 0 && indice <= quantidade)
            return true;
        else
            return false;
    }

    // Inserir um elemento e na posição i – adicionarPosicao(e, i)
    public void adicionarPosicao(int elemento, int indice) {
        if(!validarEntrada(indice))
                System.out.println("Posição inválida!");
        else {
            No novoNo = new No(elemento, null);
            
            if(indice == 0) {
                novoNo.setProximo(primeiro);
                primeiro = novoNo;
            } else {
                No noAtual = primeiro;

                for (int i = 0; i < indice - 1; i++)
                    noAtual = noAtual.getProximo();
    
                novoNo.setProximo(noAtual.getProximo());
                noAtual.setProximo(novoNo);
            }

            quantidade++;
        }
    }

    // Inserir um elemento e no início – adicionarInicio(e)
    public void adicionarInicio(int elemento) {
        adicionarPosicao(elemento, 0);
    }

    // Inserir um elemento e no final – adicionarFinal(e)
    public void adicionarFinal(int elemento) {
        adicionarPosicao(elemento, quantidade);
    }

    // Remover o elemento e na posição i – removerPosicao(i)

    // Remover o elemento no inicio – removerInicio()

    // Remover o elemento no final – removerFinal()




    //Exibir todos os elementos
    public void exibir(){
        String elementos = primeiro.getElemento() + ", ";

        No noAtual = primeiro;

        for (int i = 0; i < quantidade - 1; i++) {
            noAtual = noAtual.getProximo();
            elementos += noAtual.getElemento();

            if(i != (quantidade - 1))
                elementos += ", ";
        }
        
        JOptionPane.showMessageDialog(null, elementos);
    }

}

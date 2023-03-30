package dinamico;

import javax.swing.JOptionPane;

public class ListaDE {
    private No primeiro;
    private int quantidade;

    public ListaDE(int primeiro) {
        this.primeiro = new No(primeiro, null, null);
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
            No novoNo = new No(elemento, null, null);
            
            if(indice == 0) {
                primeiro.setAnterior(novoNo);
                novoNo.setProximo(primeiro);
                primeiro = novoNo;
            } else {
                No noAtual = primeiro;

                for (int i = 0; i < indice - 1; i++)
                    noAtual = noAtual.getProximo();
    
                novoNo.setProximo(noAtual.getProximo());
                novoNo.setAnterior(noAtual);
                noAtual.setProximo(novoNo);

                if(novoNo.getProximo() != null)
                    novoNo.getProximo().setAnterior(novoNo);
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
    public void removerPosicao(int indice) {
        if(!validarEntrada(indice)) {
            System.out.println("Não é possível remover, entrada inválida!");
        } else {
            No noAtual = primeiro;
            for (int i = 0; i < indice - 1; i++)
                    noAtual = noAtual.getProximo();

            if(indice == 0)
                primeiro = noAtual.getProximo();
            else {
                noAtual.setProximo(noAtual.getProximo().getProximo());

                if(indice != quantidade - 1)
                    noAtual.getProximo().setAnterior(noAtual);
            }
            quantidade--;
        }
    }

    // Remover o elemento no inicio – removerInicio()
    public void removerInicio() {
        removerPosicao(0);
    }

    // Remover o elemento no final – removerFinal()
    public void removerFinal() {
        removerPosicao(quantidade - 1);
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

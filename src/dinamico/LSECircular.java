package dinamico;

import javax.swing.JOptionPane;

public class LSECircular {
    private No primeiro;
    private int quantidade;

    // Criar uma nova lista – Lista()
    public LSECircular() {
        primeiro = null;
        quantidade = 0;
    }

    public LSECircular(No primeiro) {
        this.primeiro = primeiro;
        this.primeiro.setProximo(this.primeiro);
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
                
                //O último deve apontar para o novo primeiro
                No noAtual = primeiro;
                for (int i = 0; i < quantidade; i++)
                    noAtual = noAtual.getProximo();

                noAtual.setProximo(primeiro);

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
    public void removerPosicao(int indice) {
        if(!validarEntrada(indice) || estaVazia()) {
            System.out.println("Não é possível remover, entrada inválida!");
        } else {
            if(quantidade == 1) {
                primeiro = null;
            } else {
                No noAtual = primeiro;
                for (int i = 0; i < indice - 1; i++)
                        noAtual = noAtual.getProximo();
    
                if(indice == 0) {
                    primeiro = noAtual.getProximo();
    
                    //O último deve apontar para o novo primeiro
                    No ultimo = primeiro;
                    for (int i = 0; i < quantidade; i++)
                        ultimo = ultimo.getProximo();
    
                    ultimo.setProximo(primeiro);
                } else
                    noAtual.setProximo(noAtual.getProximo().getProximo());
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
            elementos += " -> " + noAtual.getElemento();
        }

        if(!"".equals(elementos))
            elementos = "-> "+elementos+" ->";
        
        JOptionPane.showMessageDialog(null, elementos);
    }

}

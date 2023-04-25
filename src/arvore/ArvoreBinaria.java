package arvore;

public class ArvoreBinaria {
    private NoAB raiz;

    // Criar uma nova árvore – Arvore()
    public ArvoreBinaria() {
        raiz = null;
    }

    public ArvoreBinaria(int raiz) {
        this.raiz = new NoAB(raiz);
    }

    // Verificar se a árvore está vazia – estaVazia()
    public boolean estaVazia() {
        if(raiz == null)
            return true;
        else
            return false;
    }

    //TODO Testar este método
    // Buscar um determinado elemento e – buscarElemento(e)
    public NoAB buscarElemento(int elemento) {
        return buscarElemento(raiz, elemento);
    }

    private NoAB buscarElemento(NoAB atual, int elemento) {
        if(atual.getElemento() == elemento)
            return atual;

        NoAB resultado = null;
        if(atual.getEsquerda() != null)
            resultado = buscarElemento(atual.getEsquerda(), elemento);
        if(resultado == null && atual.getDireita() != null)
            resultado = buscarElemento(atual.getDireita(), elemento);
        
        return resultado;
    }

    // Descobre o pai de um elemento e – buscarPai(e)
    public NoAB buscarPai(int elemento) {
        return buscarPai(raiz, elemento);
    }

    private NoAB buscarPai(NoAB atual, int elemento) {
        if(atual.getEsquerda() != null && atual.getEsquerda().getElemento() == elemento)
            return atual;

        if(atual.getDireita() != null && atual.getDireita().getElemento() == elemento)
            return atual;

        NoAB resultado = null;
        if(atual.getEsquerda() != null)
            resultado = buscarPai(atual.getEsquerda(), elemento);
        if(resultado == null && atual.getDireita() != null)
            resultado = buscarPai(atual.getDireita(), elemento);
        
        return resultado;
    }

    // Retornar o nível do elemento e – nivelElemento(e)
    public int nivelElemento(int elemento) {
        return nivelElemento(raiz, elemento);
    }

    private int nivelElemento(NoAB atual, int elemento) {
        if(atual.getElemento() == elemento)
            return 0;
        //FIXME corrigir retorno +1
        int resultado = -1;
        if(atual.getEsquerda() != null)
            resultado =  1 + nivelElemento(atual.getEsquerda(), elemento);

        if(resultado == 0 && atual.getDireita() != null)
            resultado =  1 + nivelElemento(atual.getDireita(), elemento);

        return resultado;
    }

    // Resgatar a altura da árvore – alturaArvore()
    // Desafio: adicionar()
    // Inserir um elemento e à direita de p – adicionarDireita(e, p)
    // Adicionar e à esquerda de p – adicionarEsquerda(e, p)
    // Remover o elemento e – removerElemento(e)

}

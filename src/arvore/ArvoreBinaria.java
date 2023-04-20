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
    // Retornar o nível do elemento e – nivelElemento(e)
    // Resgatar a altura da árvore – alturaArvore()
    // Desafio: adicionar()
    // Inserir um elemento e à direita de p – adicionarDireita(e, p)
    // Adicionar e à esquerda de p – adicionarEsquerda(e, p)
    // Remover o elemento e – removerElemento(e)

}

package arvore;

public class AVL {
    private NoAB raiz;

    // Criar uma nova árvore – Arvore()
    public AVL() {
        raiz = null;
    }

    public AVL(int raiz) {
        this.raiz = new NoAB(raiz);
    }

    // Verificar se a árvore está vazia – estaVazia()
    public boolean estaVazia() {
        if(raiz == null)
            return true;
        else
            return false;
    }

    // Buscar um determinado elemento e – buscarElemento(e)
    public NoAB buscarElemento(int elemento) {
        if(estaVazia())
            return null;
        
        return buscarElemento(raiz, elemento);
    }

    private NoAB buscarElemento(NoAB atual, int elemento) {
        if(atual == null) return null;

        int elementoAtual = atual.getElemento();
        if(elementoAtual == elemento)
            return atual;

        NoAB resultado = null;
        if(elementoAtual < elemento)
            resultado = buscarElemento(atual.getDireita(), elemento);
        else
            resultado = buscarElemento(atual.getEsquerda(), elemento);

        return resultado;
    }

    // Descobre o pai de um elemento e – buscarPai(e)
    public NoAB buscarPai(int elemento) {
        if(estaVazia())
            return null;
            
        return buscarPai(raiz, elemento);
    }

    private NoAB buscarPai(NoAB atual, int elemento) {
        if(atual == null) return null;
        
        if(atual.getDireita() != null && atual.getDireita().getElemento() == elemento)
            return atual;
                
        if(atual.getEsquerda() != null && atual.getEsquerda().getElemento() == elemento)
            return atual;

        NoAB resultado = null;
        if(atual.getElemento() < elemento)
            resultado = buscarPai(atual.getDireita(), elemento);
        else
            resultado = buscarPai(atual.getEsquerda(), elemento);

        return resultado;
    }

    //FIXME Otimizar
    // Retornar o nível do elemento e – nivelElemento(e)
    public int nivelElemento(int elemento) {
        return nivelElemento(raiz, elemento);
    }

    private int nivelElemento(NoAB atual, int elemento) {
        if(atual.getElemento() == elemento)
            return 0;
        
        int resultado = -1;
        if(atual.getEsquerda() != null)
            resultado =  nivelElemento(atual.getEsquerda(), elemento);

        if(resultado == -1 && atual.getDireita() != null)
            resultado =  nivelElemento(atual.getDireita(), elemento);

        if(resultado >= 0)
            return resultado + 1;
        else
            return resultado;
    }

    // Resgatar a altura da árvore – alturaArvore()
    public int alturaArvore() {
        return alturaArvore(raiz);
    }

    private int alturaArvore(NoAB atual) {
        if(folha(atual))
            return nivelElemento(atual.getElemento());

        int alturaEsquerda = -1;
        int alturaDireita = -1;
        if(atual.getEsquerda() != null)
            alturaEsquerda = alturaArvore(atual.getEsquerda());

        if(atual.getDireita() != null)
            alturaDireita = alturaArvore(atual.getDireita());

        if(alturaDireita > alturaEsquerda)
            return alturaDireita;
        else
            return alturaEsquerda;  
    }

    private boolean folha(NoAB no) {
        if(no.getEsquerda() == null && no.getDireita() == null)
            return true;
        
        return false;
    }

    public void adicionar(int elemento) {
        adicionar(raiz, elemento);
        balancear(buscarElemento(elemento));
    }

    private void adicionar(NoAB atual, int elemento) {
        if(atual.getElemento() < elemento) {
            if(atual.getDireita() == null)
                atual.setDireita(new NoAB(elemento));
            else
                adicionar(atual.getDireita(), elemento);
        } else {
            if(atual.getEsquerda() == null)
                atual.setEsquerda(new NoAB(elemento));
            else
                adicionar(atual.getEsquerda(), elemento);
        }
    }

    /**
 * rotacao dupla esq?
 * rotacao dupla dir?
 */
    private void balancear(NoAB atual) {
        if(atual == null) return;

        int fatorBalanceamento = fatorBalanceamento(atual);

        //fb < -1
        //rotacao direita
        if(fatorBalanceamento < -1)
            rotacionarDireita(atual);

        //fb > 1
        //rotacao esquerda
        if(fatorBalanceamento > 1)
            rotacionarEsquerda(atual);

        balancear(buscarPai(atual.getElemento()));

    }
    
    private void rotacionarDireita(NoAB atual) {
        NoAB noPai = buscarPai(atual.getElemento());
        NoAB noFilho = atual.getEsquerda();

        if(noPai == null)
            raiz = noFilho;

        atual.setEsquerda(null);

        NoAB noPendurado = noFilho.getDireita();
        noFilho.setDireita(atual);
        atual.setEsquerda(noPendurado);
    }

    private void rotacionarEsquerda(NoAB atual) {
        NoAB noPai = buscarPai(atual.getElemento());
        NoAB noFilho = atual.getDireita();

        if(noPai == null)
            raiz = noFilho;

        atual.setDireita(null);

        NoAB noPendurado = noFilho.getEsquerda();
        noFilho.setEsquerda(atual);
        atual.setDireita(noPendurado);
    }

    //FIXME CORRIGIR
    public int fatorBalanceamento(NoAB atual) {
        //altura direita
        int alturaDireita = -1;
        if(atual.getDireita() != null)
            alturaDireita = alturaArvore(atual.getDireita());
        //altura esquerda
        int alturaEsquerda = -1;
        if(atual.getEsquerda() != null)
            alturaEsquerda = alturaArvore(atual.getEsquerda());
        
        return alturaDireita - alturaEsquerda;
    }

    //TODO Remoção por cópia
    // Remover o elemento e – removerElemento(e)
    public void removerElemento(int elemento) {
        //Nó a ser removido é substituído por uma folha
        //      (1) O menor dos nós maiores que o nó a ser removido;
        //      (2) A maior dos nós menores que o nó a ser removido.

        NoAB removido = buscarElemento(elemento);
        // (1) menor dos maiores
        // filho da direita
        // loop filhos da esquerda até nulo
        // se filho da direita existir, assume a posicao

        // alternativa 

        // (2) maior dos menores
        // filho da esquerda
        // loop filhos da direita até nulo
        // se filho da esquerda existir, assume a posicao
    }

    // TODO Desafio: Remover elegante
}
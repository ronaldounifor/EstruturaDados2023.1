// Inserir um elemento e na posição i – adicionarPosicao(e, i)
// Inserir um elemento e no início – adicionarInicio(e)
// Inserir um elemento e no final – adicionarFinal(e)
// Remover o elemento e na posição i – removerPosicao(i)
// Remover o elemento no inicio – removerInicio(i)
// Remover o elemento no final – removerFinal(i)

public class Lista {
    private int[] elementos;
    private int quantidade;
    private int primeiro;
    private int ultimo;
    
    // Criar uma nova lista – Lista()
    public Lista() {
        elementos = new int[10];
        quantidade = 0;
        primeiro = -1;
        ultimo = -1;
    }

    public Lista(int tamanho) {
        elementos = new int[tamanho];
    }
    
    // Retornar a quantidade de elementos – getQuantidade()
    public int getQuantidade() {
        return quantidade;
    }

    // Verificar se a lista está vazia – estaVazia()
    public boolean estaVazia() {
        if(quantidade == 0)
            return true;
        else
            return false;
    }

    // Verificar se a lista está cheia, caso possua um limite – estaCheia()
    public boolean estaCheia() {
        if(quantidade == elementos.length)
            return true;
        else
            return false;
    }
    
    // Acessar o elemento na posição i – retornarElemento(i)
    public int retornarElemento(int indice) {
        //FIXME tratamento
        return elementos[indice];
    }

}
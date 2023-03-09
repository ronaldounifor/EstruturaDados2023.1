import dinamico.PilhaEncadeada;

public class App {
    public static void main(String[] args) throws Exception {
        PilhaEncadeada pilha = new PilhaEncadeada();

        pilha.empilhar(1);
        pilha.empilhar(3);
        pilha.empilhar(5);
        pilha.empilhar(7);
        pilha.empilhar(9);
        pilha.empilhar(8);
        pilha.empilhar(6);

        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();
        
        pilha.exibir();

    }
}

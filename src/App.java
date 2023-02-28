public class App {
    public static void main(String[] args) throws Exception {
        Pilha pilha = new Pilha();

        pilha.empilhar(12);
        pilha.desempilhar();
        pilha.empilhar(3);
        pilha.empilhar(1);
        pilha.desempilhar();
        pilha.empilhar(3);
        pilha.empilhar(1);
        pilha.empilhar(3);
        pilha.empilhar(1);
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.empilhar(300);

        pilha.exibir();
    }
}

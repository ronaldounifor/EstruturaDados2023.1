import dinamico.ListaEncadeada;

public class App {
    public static void main(String[] args) throws Exception {
        ListaEncadeada lista = new ListaEncadeada();

        lista.adicionarFinal(1);
        lista.adicionarFinal(3);
        lista.adicionarFinal(5);
        lista.adicionarFinal(7);
        lista.adicionarFinal(9);
        lista.adicionarPosicao(8, 3);
        lista.adicionarPosicao(6, 1);

        lista.removerInicio();
        lista.removerPosicao(2);
        lista.removerPosicao(4);
        //6 3 8 7
        lista.exibir();

    }
}

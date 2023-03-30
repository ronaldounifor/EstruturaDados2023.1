import dinamico.ListaDE;

public class App {
    public static void main(String[] args) throws Exception {
        ListaDE lista = new ListaDE(7);

        lista.adicionarFinal(5);
        lista.adicionarFinal(3);
        lista.adicionarInicio(11);
        lista.adicionarPosicao(12, 2);
        lista.adicionarFinal(8);
        lista.exibir();
        
        lista.removerPosicao(2);
        lista.exibir();
        lista.removerInicio();
        lista.exibir();
        lista.removerFinal();
        lista.exibir();

    }
}

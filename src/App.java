import dinamico.ListaEncadeada;
import dinamico.No;

public class App {
    public static void main(String[] args) throws Exception {
        ListaEncadeada lista = new ListaEncadeada();

        System.out.println("Esta vazia (inicio): "+lista.estaVazia());
        System.out.println("Quantidade (inicio): "+lista.getQuantidade());

        lista.adicionarInicio(7);
        lista.adicionarFinal(2);
        lista.adicionarFinal(1);

        lista.exibir();
        lista.adicionarPosicao(3, 1);
        lista.adicionarPosicao(12, 12);
        lista.adicionarPosicao(12, 4);
        lista.adicionarPosicao(9, 0);
        lista.exibir();

        System.out.println("Esta vazia (fim): "+lista.estaVazia());
        System.out.println("Quantidade (fim): "+lista.getQuantidade());
    }
}

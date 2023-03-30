import dinamico.LSECircular;

public class App {
    public static void main(String[] args) throws Exception {
        LSECircular listaCircular = new LSECircular();

        listaCircular.adicionarInicio(7);
        listaCircular.adicionarFinal(2);
        listaCircular.adicionarPosicao(8, 1);

        listaCircular.adicionarPosicao(5, 3);
        listaCircular.adicionarPosicao(5, 4);
        listaCircular.adicionarPosicao(5, 5);

        listaCircular.removerFinal();
        listaCircular.removerFinal();

        listaCircular.removerPosicao(2);
        
        listaCircular.exibir();



    }
}

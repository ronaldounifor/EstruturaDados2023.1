import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();

        System.out.println(lista.estaCheia());
        System.out.println(lista.estaVazia());

        lista.adicionarPosicao(7, 0);
        lista.adicionarPosicao(3, 1);
        lista.adicionarPosicao(2, 2);
        lista.adicionarPosicao(1, 3);
        lista.adicionarPosicao(8, 4);
        
        lista.adicionarPosicao(6, 3);

        System.out.println(lista.estaCheia());
        System.out.println(lista.estaVazia());

        lista.exibir();
    }
}

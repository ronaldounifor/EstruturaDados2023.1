import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();

        lista.adicionarFinal(2);
        lista.adicionarFinal(3);
        lista.adicionarFinal(1);
        lista.adicionarFinal(5);
        lista.adicionarFinal(7);
        lista.adicionarFinal(8);
        lista.exibir();
        
        lista.removerPosicao(3);
        lista.exibir();

        lista.removerInicio();
        lista.exibir();
        
        lista.removerFinal();
        lista.exibir();
    }
}

import dinamico.FilaEncadeada;

public class App {
    public static void main(String[] args) throws Exception {
        FilaEncadeada Fila = new FilaEncadeada();

        Fila.enfileirar(1);
        Fila.enfileirar(3);
        Fila.enfileirar(5);
        Fila.enfileirar(7);
        Fila.enfileirar(9);
        Fila.enfileirar(8);
        Fila.enfileirar(6);

        Fila.desenfileirar();
        Fila.desenfileirar();
        Fila.desenfileirar();
        
        Fila.exibir();

    }
}

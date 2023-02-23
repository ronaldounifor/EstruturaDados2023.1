public class App {
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila(5);
        System.out.println(fila.estaVazia());
        System.out.println(fila.estaCheia());

        fila.enfileirar(9);
        fila.enfileirar(1);
        fila.enfileirar(8);
        fila.enfileirar(2);
        fila.enfileirar(7);
        fila.enfileirar(200);

        fila.exibir();

        System.out.println(fila.estaVazia());
        System.out.println(fila.estaCheia());
        
        fila.desenfileirar();
        fila.exibir();
    }
}

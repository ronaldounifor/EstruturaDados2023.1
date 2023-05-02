import arvore.ArvoreBinaria;
import util.BTreePrinter;

public class App {
    public static void main(String[] args) throws Exception {
        ArvoreBinaria arvore = new ArvoreBinaria(12);

        arvore.adicionarEsquerda(15, 12);
        arvore.adicionarDireita(13, 12);
        arvore.adicionarEsquerda(14, 15);
        arvore.adicionarDireita(22, 15);
        BTreePrinter.printNode(arvore.buscarElemento(12));

        arvore.adicionarEsquerda(300, 12);
        BTreePrinter.printNode(arvore.buscarElemento(12));
    }
}

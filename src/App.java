import arvore.ArvoreBusca;
import util.BTreePrinter;

public class App {
    private static final int root = 17;
    private static final ArvoreBusca arvore = new ArvoreBusca(root);

    public static void main(String[] args) throws Exception {    

        arvore.adicionar(14);
        arvore.adicionar(20);
        arvore.adicionar(2);
        arvore.adicionar(16);
        arvore.adicionar(18);
        arvore.adicionar(44);
        arvore.adicionar(19);
        printTree();

        System.out.println(arvore.nivelElemento(14));

    }

    private static void printTree() {
        BTreePrinter.printNode(arvore.buscarElemento(root));

    }
}

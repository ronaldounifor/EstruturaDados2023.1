import arvore.ArvoreBusca;
import util.BTreePrinter;

public class App {
    private static final int root = 17;
    private static final ArvoreBusca arvore = new ArvoreBusca(root);

    public static void main(String[] args) throws Exception {    
        printTree();
        arvore.adicionar(14);
        printTree();
        arvore.adicionar(20);
        printTree();
        arvore.adicionar(2);
        printTree();
        arvore.adicionar(16);
        printTree();
        arvore.adicionar(18);
        printTree();
        arvore.adicionar(44);
        printTree();
        arvore.adicionar(19);
        printTree();
    }

    private static void printTree() {
        BTreePrinter.printNode(arvore.buscarElemento(root));

    }
}

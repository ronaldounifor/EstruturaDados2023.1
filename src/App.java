import arvore.AVL;
import util.BTreePrinter;

public class App {
    private static final int root = 8;
    private static final AVL arvore = new AVL(root);

    public static void main(String[] args) throws Exception {    

        arvore.adicionar(4);
        // arvore.adicionar(10);
        // arvore.adicionar(2);
        // arvore.adicionar(6);


        // arvore.adicionar(3);
        printTree();

    }

    private static void printTree() {
        BTreePrinter.printNode(arvore.buscarElemento(root));

    }
}

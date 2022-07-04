package UE02_AddAndSearch;

public class Tree {
    private Node root;

    public void add(int number) {
        Node newNode = new Node(number);

        // Baum ist noch leer
        if (root == null)
            root = newNode;
        // Sonst richtige Stelle suchen und dort einfügen
        else {
            // Variante 1: Rekursiv
            //addRecursive(root, newNode);
            // Variante 2: Schleife
            addLoop(root, newNode);
        }
    }

    // Add - Variante Rekursion
    private void addRecursive(Node currentNode, Node newNode) {
        if (currentNode.getNumber() > newNode.getNumber())
        {
            // Ist die linke Position von CurrentNode frei?
            if (currentNode.getLeft() == null)
            {
                currentNode.setLeft(newNode);
            }
            // Linke Position ist schon belegt
            else
            {
                addRecursive(currentNode.getLeft(), newNode);
            }
        }
        else if (currentNode.getNumber() < newNode.getNumber())
        {
            // Ist die rechte Position von currentNode frei?
            if (currentNode.getRight() == null)
            {
                currentNode.setRight(newNode);
            }
            // Rechte Position ist schon belegt
            else
            {
                addRecursive(currentNode.getRight(), newNode);
            }
        }
    }

    // Add - Variante Loop
    private void addLoop(Node startNode, Node newNode) {

        Node currentNode = startNode;
        boolean nodeAdded = false;

        while (nodeAdded = false)
        {
            // Der neue Knoten ist kleiner als der currentNode
            if (newNode.getNumber() < currentNode.getNumber())
            {
                // Gibts ein linkes Kind?
                if (currentNode.getLeft() == null)
                {
                    currentNode.setLeft(newNode);
                    nodeAdded = true;
                }
                else
                    // Weiterspringen zum linken Kind
                    currentNode = currentNode.getLeft();
            }
            // Der neue Knoten ist größer als der currentNode
            else
            {
                // Gibts ein rechtes Kind?
                if (currentNode.getRight() == null)
                {
                    currentNode.setRight(newNode);
                    nodeAdded = true;
                }
                else {
                    // Weiterspringen zum rechten Kind
                    currentNode = currentNode.getRight();
                }
            }
        }
    }

    public Node searchNumber(int number) {
        System.out.print("SearchNumber - ");

        // TODO: Entweder Variante 1 oder 2 einkommentieren
        // Variante 1: Aufruf Rekursiv
        return searchNumberRecursive(root, number);
        // Variante 2: Aufruf Schleife
        //return searchNumberLoop(number);
    }

    // Suche - Variante Rekursion
    private Node searchNumberRecursive(Node currentNode, int number) {
        // Baum leer bzw. gesuchtes Element kommt nicht vor
        if (currentNode == null)
            return null;
        // Wir stehen gerade beim gesuchten Knoten
        else if (currentNode.getNumber() == number)
            return currentNode;
        // Linker Teilbaum
        else if (number < currentNode.getNumber())
            return searchNumberRecursive(currentNode.getLeft(), number);
        // Rechter Teilbaum
        else
            return searchNumberRecursive(currentNode.getRight(), number);
    }

    // Suche - Variante Schleife
    private Node searchNumberLoop(int number) {
        Node currentNode = root;

        while (currentNode != null)
        {
            if (number == currentNode.getNumber())
                return currentNode;
            else if (number < currentNode.getNumber())
                currentNode = currentNode.getLeft();
            else
                currentNode = currentNode.getRight();
        }

        return null;
    }

    /**
     * Funktion zur Ausgabe des gesamten Baums.
     */
    public void printTree() {
        printTree(root, "");
    }

    /**
     * Funktion zur Ausgabe des Baums unterhalb eines Knotens
     *
     * @param currentNode Knoten, dessen Teilbaum ausgegeben werden soll
     * @param prefix      Zur Einr�ckung
     */
    public void printTree(Node currentNode, String prefix) {
        if (currentNode == null) {
            return;
        }
        System.out.println(prefix + currentNode.getNumber());
        printTree(currentNode.getLeft(), prefix + "L ");
        printTree(currentNode.getRight(), prefix + "R ");
    }


}

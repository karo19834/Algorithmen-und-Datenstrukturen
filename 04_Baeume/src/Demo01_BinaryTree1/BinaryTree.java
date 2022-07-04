package Demo01_BinaryTree1;

public class BinaryTree {
    private Node root;

    public void addNode(int number)
    {
        // Knoten erstellen
        Node newNode = new Node();
        newNode.setNumber(number);

        // Fall: Baum ist leer
        if (root == null)
            root = newNode;
        // Fall: Baum ist nicht leer
        else
        {
            Node currentNode = root;
            boolean nodeAdded = false;

            while (nodeAdded == false)
            {
                // Neuer Wert ist kleiner als aktueller Knoten
                if (newNode.getNumber() < currentNode.getNumber()) {
                    // Linkes Kind nicht gesetzt. D.h. dort einfügen
                    if (currentNode.getLeft() == null) {
                        currentNode.setLeft(newNode);
                        nodeAdded = true;
                    }
                    // Fall: Linkes Kind ist gesetzt
                    else
                      currentNode = currentNode.getLeft();
                }
                // Neuer Wert ist größer als aktueller Knoten
                else
                {
                    // Rechtes Kind nicht gesetzt. D.h. dort einfügen
                    if (currentNode.getRight() == null) {
                        currentNode.setRight(newNode);
                        nodeAdded = true;
                    }
                    // Rechtes Kind ist gesetzt
                    else
                        currentNode = currentNode.getRight();
                }
            }
        }
    }

    public Node searchNode(Node currentNode, int number)
    {
        // Fall 4: Wert kommt nicht vor
        if (currentNode == null)
            return null;
        // Fall 1: Man steht gerade am gesuchten Knoten
        else if (currentNode.getNumber() == number)
            return currentNode;
        // Fall 2: Gesuchte Wert ist kleiner als aktueller Knoten
        else if (number < currentNode.getNumber())
            return searchNode(currentNode.getLeft(), number);
        // Fall 3: Gesuchte Wert ist größer als aktueller Knoten
        else
            return searchNode(currentNode.getRight(), number);
    }



}

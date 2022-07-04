package UE3_BookStack_Loesung;

public class BookStack {
    private Node top;

    public Node getTop() {
        return this.top;
    }

    public void push(String bookTitle) {
        // Node erstellen
        Node newNode = new Node(bookTitle);

        // Stack ist nicht leer
        if (top != null)
            newNode.setNext(top);

        // top neu setzen
        top = newNode;
    }

    // Pop: Erstes Element zurückliefern und vom Stack herunternehmen
    public String pop() throws StackEmptyException {
        if (getCount() == 0)
            throw new StackEmptyException();
        // Stack ist leer
        //if (top == null)
        //    return null;

        // Hole ich mir den Wert vom obersten Knoten
        String firstBookTitle = top.getBookTitle();

        // Zwischenspeichern des zweiten Buchs
        Node secondNode = top.getNext();

        // Top neu setzen (auf zweites Buch)
        top = secondNode;
        // top = top.getNext();  // wäre auch möglich

        // Ersten Buchtitel zurückliefern
        return firstBookTitle;
    }

    public int getCount() {
        int counter = 0;
        Node currentNode = top;

        while (currentNode != null) {
            currentNode = currentNode.getNext();
            counter++;
        }

        return counter;
    }
}

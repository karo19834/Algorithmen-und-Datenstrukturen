package UE2_WagonLinkedList;

public class WagonLinkedList {
    // *** Membervariablen ***
    // TODO

    // *** Methoden ***

    public Node getFirst() {
        // TODO
        return null;
    }

    public void setFirst(Node first) {
        // TODO
    }

    public Node getLast() {
        // TODO
        return null;
    }

    public void setLast(Node last) {
        // TODO
    }

    void insertWagonAtFirstPos(String wagonId) {
        // TODO
    }

    void removeWagonFromLastPos() {
        // TODO
    }

    void printList() {
        System.out.print("* List: ");

        if (this.getFirst() == null) {
            System.out.print("<empty>");
        } else {
            Node currentNode = this.getFirst();
            while (currentNode != null) {
                System.out.print(currentNode.getWagonId() + ", ");
                currentNode = currentNode.getNext();
            }
        }

        System.out.println();
    }
}

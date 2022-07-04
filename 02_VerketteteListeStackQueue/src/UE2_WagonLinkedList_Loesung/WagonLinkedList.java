package UE2_WagonLinkedList_Loesung;

public class WagonLinkedList {
    // *** Membervariablen ***
    Node first;
    Node last;

    // *** Methoden ***

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    void insertWagonAtFirstPos(String wagonId) {
        Node newNode = new Node();
        newNode.setWagonId(wagonId);

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.setNext(first);
            first.setPrev(newNode);
            first = newNode;
        }
    }

    void removeWagonFromLastPos() {
        // Fall: Liste ist leer
        if (last == null)
            return;
        // Fall: Liste besteht aus genau einem Wagon
        else if (first == last) {
            first = null;
            last = null;
        }
        // Fall: Liste hat 2 oder mehr Wagons
        else {
            Node predecessorNode = last.getPrev();
            last.setPrev(null);
            predecessorNode.setNext(null);
            last = predecessorNode;
        }
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

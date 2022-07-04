package UE1_TodoLinkedList_Unterricht;

public class TodoLinkedList {
    // *** Membervariablen ***
    private Node first;
    private Node last;

    // *** Get-Methoden (Set-Methoden nicht notwendig) ***

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    // *** Operationen ***

    public void appendTodoText(String todoText) {
        // Neuen Knoten schaffen
        Node newNode = new Node();
        newNode.setTodoText(todoText);

        // Fall 1: Liste leer
        if (first == null)
        {
            first = newNode;
            last = newNode;
        }
        // Fall 2: Zumindest ein Element in der Liste
        else
        {
            last.setNext(newNode);
            last = newNode;
        }
    }

    public void deleteLastTodoText() {
        // Fall 1: Liste ist leer
        if (first == null)
            return;  // Keine Aktion notwendig
        // Fall 2: Liste besteht aus einem Knoten
        else if (first == last)
        {
            first = null;
            last = null;
        }
        // Fall 3: Liste besteht aus mehreren Knoten
        else
        {
            Node prevNode = first;

            // Bis zum vorletzten Knoten weiterhüpfen
            while (prevNode.getNext() != last)
                prevNode = prevNode.getNext();

            prevNode.setNext(null);
            last = prevNode;
        }
    }

    public String getTodoTextAtIndex(int index) {
        // TODO: Implementierung vervollständigen
        return null;
    }
}

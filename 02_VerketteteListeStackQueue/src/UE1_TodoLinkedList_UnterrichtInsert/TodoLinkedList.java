package UE1_TodoLinkedList_UnterrichtInsert;

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

    // Operation EINFÜGEN
    public void insertTodoText(String todoText)
    {
        // FIXE VORAUSSETZUNG:
        // ALD lernen -> Einkaufen -> Müll rausbringen
        // Neue Node zwischen Einkaufen und Müll rausbringen einfügen

        Node newNode = new Node();
        newNode.setTodoText(todoText);

        Node currentNode = first;  // currentNode zeigt auf ALD lernen
        currentNode = currentNode.getNext();  // currentNode zeigt auf Einkaufen

        currentNode.setNext(newNode);  // Einkaufen zeigt auf Auto waschen
        newNode.setNext(last);  // Next von Auto waschen zeigt auf Müll rausbringen
    }

    public void appendTodoText(String todoText) {
        // TODO: Implementierung vervollständigen
    }

    public void deleteLastTodoText() {
        // TODO: Implementierung vervollständigen
    }

    public String getTodoTextAtIndex(int index) {
        // TODO: Implementierung vervollständigen
        return null;
    }
}

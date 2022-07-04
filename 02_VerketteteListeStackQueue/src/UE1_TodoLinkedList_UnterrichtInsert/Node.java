package UE1_TodoLinkedList_UnterrichtInsert;

public class Node {
    // *** Membervariablen ***
    private String todoText;  // Wert
    private Node next;  // Referenz

    public String getTodoText() {
        return todoText;
    }

    public void setTodoText(String todoText) {
        this.todoText = todoText;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

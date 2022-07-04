package UE2_WagonLinkedList_Loesung;

public class Node {
    // *** Membervariablen ***
    String wagonId;
    Node next;
    Node prev;

    // *** Getter- & Setter-Methoden ***
    public String getWagonId() {
        return wagonId;
    }

    public void setWagonId(String wagonId) {
        this.wagonId = wagonId;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}

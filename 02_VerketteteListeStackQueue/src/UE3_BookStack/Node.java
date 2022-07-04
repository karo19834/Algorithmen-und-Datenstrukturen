package UE3_BookStack;

public class Node
{
    // *** Membervariablen ***
    private final String bookTitle;
    private Node next;

    // *** Konstruktor ***

    public Node(String bookTitle)
    {
        this.bookTitle = bookTitle;
    }

    // *** Getter- und Setter-Methoden ***

    public String getBookTitle()
    {
        return this.bookTitle;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

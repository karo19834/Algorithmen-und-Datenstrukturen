package UE7_MovieLinkedList_Loesung;

public class Node {
    // *** Membervariablen ***
    final String movieTitle;
    Node next;
    Node prev;

    // *** Methoden ***
    public Node(String movie) {
        this.movieTitle = movie;
    }

    public String getMovieTitle()
    {
        return this.movieTitle;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return this.next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getPrev() {
        return this.prev;
    }
}

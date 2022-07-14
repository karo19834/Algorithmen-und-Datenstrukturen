package polonaise;

public class DanceDoubleLinkedList
{
    private Node first;
    private Node last;

    public Node getFirst()
    {
        return first;
    }

    public Node getLast()
    {
        return last;
    }

    // Methode, um eine(n) neue(n) TaenzerIn an erster/vorderster Position
    // der Polonaise einzufügen
    public void insertDancerAtFirstPos(String name)
    {
        // Double Linked List
        // prev, next
        Node dancer = new Node(name); // neuer Node anlegen
        // [a, b, c] f

        if (first == null){
            first = dancer;
            last = dancer;
        }else {
            dancer.setNext(first); // f -> [ <- a, b, c]
            first.setPrev(dancer);
            first = dancer;
        }
    }
}

package polonaise_Unterricht;

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
        // Knoten schaffen, der eingefügt werden kann
        Node newNode = new Node(name);

        // Fall: Liste ist noch leer
        if (first == null)
        {
            first = newNode;
            last = newNode;
        }
        // Fall: Liste ist nicht leer
        else
        {
            newNode.setNext(first);
            first.setPrev(newNode);
            first = newNode;
        }
    }
}

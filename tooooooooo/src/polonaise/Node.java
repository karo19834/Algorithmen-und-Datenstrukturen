package polonaise;

public class Node
{
    private final String name;
    private Node next;
    private Node prev;

    public Node(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public Node getNext()
    {
        return next;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }

    public Node getPrev()
    {
        return prev;
    }

    public void setPrev(Node prev)
    {
        this.prev = prev;
    }
}

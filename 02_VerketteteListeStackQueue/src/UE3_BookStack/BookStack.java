package UE3_BookStack;

public class BookStack
{
    // *** Membervariablen ***
    private Node top;

    // *** Getter- und Setter-Methoden ***

    public Node getTop()
    {
        return this.top;
    }


    // *** Operationen ***

    public void push(String bookTitle)
    {
        // Knoten anlegen
        Node newNode = new Node(bookTitle);

        // Knoten an erste Stelle setzen
        newNode.setNext(top);
        top = newNode;
    }

    public String pop() throws StackEmptyException
    {
        // Fall: Stack ist leer
        if (top == null)
            throw new StackEmptyException();
        // Fall: Stack ist nicht leer
        else
        {
            String returnString = top.getBookTitle();  // Zwischenspeichern Wert
            top = top.getNext();
            return returnString;
        }
    }

    public int getCount()
    {
        // TODO: Implementierung
        return 0;
    }
}

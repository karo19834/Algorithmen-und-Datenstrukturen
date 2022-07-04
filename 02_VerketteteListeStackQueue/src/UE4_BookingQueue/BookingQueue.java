package UE4_BookingQueue;

public class BookingQueue
{
    // *** Membervariablen ***
    private Node front;
    private Node rear;

    // *** Getter- und Setter-Methoden ***

    public Node getFront()
    {
        return front;
    }


    // *** Operationen ***

    public void enqueue(Booking newBooking)
    {
        // Knoten anlegen
        Node newNode = new Node(newBooking);

        // Fall: Queue ist leer
        if (front == null)
        {
            front = newNode;
            rear = newNode;
        }
        // Fall: Queue ist nicht leer
        else
        {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    public Booking dequeue() throws QueueEmptyException
    {
        // Fall: Queue ist leer
        if (front == null)
            throw new QueueEmptyException();
        // Fall: Queue besteht aus einem Knoten
        else if (front == rear)
        {
            Booking returnBooking = front.getBooking();
            front = null;
            rear = null;
            return returnBooking;
        }
        // Fall: Queue besteht aus mehreren Knoten
        else
        {
            Booking returnBooking = front.getBooking();
            front = front.getNext();  // Zweiter Knoten wird zum ersten Knoten
            return returnBooking;
        }
    }

    public int getCount()
    {
        int counter = 0;
        Node currentNode = front;

        // QUEUE IST LEER
        // front = NULL
        // currentNode = NULL
        // NULL.getNext --> Exception/Fehler (NULL bietet keine Operationen)

        // QUEUE BESTEHT AUS EINEM ELEMENT
        // front = A
        // A.next (A.next ist NULL) --> das funktioniert

        while (currentNode != null)
        {
            counter++;
            currentNode = currentNode.getNext();
        }

        return counter;
    }
}

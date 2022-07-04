package UE7_MovieLinkedList_Loesung;

public class MovieLinkedList {
    // *** Membervariablen ***
    Node first;
    Node last;

    // *** Methoden ***
    public Node getFirst() {
        return this.first;
    }

    public Node getLast() {
        return this.last;
    }

    public Node getMovieAtIndex(int index) {
        // Verkettete Liste ist leer
        if (first == null)
            return null;
        else {
            Node current = first;
            int counter = 0;

            while (counter < index) {
                if (current.getNext() == null)
                    return null;

                current = current.getNext();
                counter++;
            }

            return current;
        }
    }

    public void insertMovieTitleAtIndex(String movieTitle, int index) {
        Node newNode = new Node(movieTitle);

        // Liste ist leer
        if (first == null) {
            first = newNode;
            last = newNode;
        }
        // List ist nicht leer
        else {
            // Erste Stelle
            if (index == 0) {
                newNode.setNext(first);
                first.setPrev(newNode);
                first = newNode;
            } else {
                // Vorgänger suchen
                Node predecessorNode = getMovieAtIndex(index - 1);

                // Vorgänger nicht gefunden
                if (predecessorNode == null) {
                    // Index ist nicht korrekt. Deshalb an letzter Stelle einfügen.
                    predecessorNode = last;
                }

                Node followingNode = predecessorNode.getNext();

                predecessorNode.setNext(newNode);
                newNode.setPrev(predecessorNode);

                if (followingNode != null) {
                    newNode.setNext(followingNode);
                    followingNode.setPrev(newNode);
                }

                if (predecessorNode == last)
                    last = newNode;
            }
        }
    }

    public void deleteMovieAtIndex(int index) {

        // Liste ist leer
        if (first == null)
            return;
            // Liste ist nicht leer
        else {
            // First löschen
            if (index == 0) {
                Node followingNode = getMovieAtIndex(index + 1);
                if (followingNode != null) {
                    followingNode.setPrev(null);
                    first.setNext(null);
                }

                if (first == last)
                    last = null;

                first = followingNode;
            } else {
                Node deleteNode = getMovieAtIndex(index);

                if (deleteNode == null)
                    return;

                Node predecessorNode = deleteNode.getPrev();
                Node followingNode = deleteNode.getNext();

                predecessorNode.setNext(followingNode);
                deleteNode.setPrev(null);
                deleteNode.setNext(null);
                if (followingNode != null)
                    followingNode.setPrev(predecessorNode);

                if (deleteNode == last)
                    last = predecessorNode;
            }
        }
    }

    public void printList() {
        Node currentNode = this.getFirst();

        System.out.print("*** Start: ");
        if (currentNode == null) {
            System.out.print("<empty>");
        } else {
            while (currentNode != null) {
                System.out.print(currentNode.getMovieTitle() + ", ");
                currentNode = currentNode.getNext();
            }
        }
        System.out.println();
    }

}

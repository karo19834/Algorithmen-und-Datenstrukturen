package UE02_LibraryHash_Unterricht;

import java.io.BufferedReader;
import java.io.FileReader;

public class LibraryHash
{
    private String[] books;

    // Konstruktor
    public LibraryHash(int size)
    {
        books = new String[size];
    }

    // Bücher aus einer Textdatei einlesen
    public void addBooksFromFile()
    {
        String line;
        BufferedReader br = null;

        try
        {
            br = new BufferedReader(new FileReader("books.txt"));

            while ((line = br.readLine()) != null)   {
                add(line);
            }

            br.close();
        } catch (Exception | HashFullException e)
        {
            e.printStackTrace();
        }
    }

    // Ein Buch zur Hashtable hinzufügen
    public void add(String bookTitle) throws HashFullException
    {
        int hashValue = 0;

        for (int i = 0; i < books.length; i++)
        {
            // Platz berechnen (lineare Sondierung)
            hashValue = (Math.abs(bookTitle.hashCode() + i)) % books.length;

            // Ist mein berechneter Platz frei?
            if (books[hashValue] == null) {
                books[hashValue] = bookTitle;
                return;
            }
        }
    }

    // Ein Buch aus der Hashtable entfernen
    public Boolean remove(String bookTitle)
    {
        // Keine Tombstones berücksichtigt in diesem Beispiel

        int hashValue = 0;

        for (int i = 0; i < books.length; i++)
        {
            // Position per Hash berechnen
            hashValue = Math.abs(bookTitle.hashCode() + i) % books.length;

            // Gibts Buch überhaupt?
            if (books[hashValue] == null)
                return false;
            // Ist das gefundene Buch mein gesuchtes?
            else if (books[hashValue].equals(bookTitle))
            {
                books[hashValue] = null;
                return true;
            }
        }

        return false;
    }

    // Abfrage, ob ein bestimmtes Buch in der Hashtable vorhanden ist
    public Boolean isBookInStock(String bookTitle)
    {
        int hashValue = 0;

        for (int i = 0; i < books.length; i++)
        {
            // Position errechnen
            hashValue = Math.abs(bookTitle.hashCode() + i) % books.length;

            // Ist an der errechneten Position das gesuchte Buch?
            if (books[hashValue] == null)
                return false;
            else if (books[hashValue].equals(bookTitle))
                return true;
        }
        return false;
    }

}

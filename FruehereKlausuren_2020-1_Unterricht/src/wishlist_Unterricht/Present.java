package wishlist_Unterricht;

/**
 * Geschenk (Present) für die Wunschliste
 */
public class Present {
    public String description;  // Beschreibung des Geschenks
    public int desire;          // wie begehrt das Geschenk ist

    public Present(String description, int desire) {
        this.description = description;
        this.desire = desire;
    }
}

package Demo01_CitizenHash2022;

public class CitizenHash {
    private Citizen[] citizens;

    public CitizenHash(int size) {
        citizens = new Citizen[size];
    }

    public void add(Citizen newCitizen)
    {
        int pos = newCitizen.getSocialsecurityno() % citizens.length;
        citizens[pos] = newCitizen;
        // Beispiel: Abspeichern auf Position 341
    }

    public Citizen search(int socialsecurityno)
    {
        int pos = socialsecurityno % citizens.length;
        // Beispiel-Ergebnis: 341
        return citizens[pos];
    }

    public void remove(int socialsecurityno)
    {
        int pos = socialsecurityno % citizens.length;
        citizens[pos] = null;
    }



}

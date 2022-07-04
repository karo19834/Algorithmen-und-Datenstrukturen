package Demo01_CitizenHash2022;

public class Citizen {
    private int socialsecurityno;
    private String firstname;
    private String lastname;

    public Citizen(int socialsecurityno, String firstname, String lastname) {
        this.socialsecurityno = socialsecurityno;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getSocialsecurityno() {
        return socialsecurityno;
    }

    public void setSocialsecurityno(int socialsecurityno) {
        this.socialsecurityno = socialsecurityno;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}

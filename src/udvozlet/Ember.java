package udvozlet;


/**
 *
 * @author Fere
 */
public class Ember {
    private String nev;

    public Ember(String nev) {
        this.nev = nev;
    }
    
    public String Koszont(){
        return "Köszöntelek " +nev + "!";
    }
    
    
}

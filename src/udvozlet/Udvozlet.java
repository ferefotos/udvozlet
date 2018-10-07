package udvozlet;


/**
 *
 * @author Fere
 */
public class Udvozlet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ember no = new Ember("Éva");
        Ember ferfi = new Ember("Ádám");
        System.out.println(no.Koszont());
        System.out.println(ferfi.Koszont());
    }
    
}

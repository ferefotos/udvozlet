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
        Ember no = new Ember("Lujza");
        Ember ferfi = new Ember("Lajos");
        System.out.println(no.Koszont());
        System.out.println(ferfi.Koszont());
    }
    
}

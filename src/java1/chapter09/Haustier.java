package java1.chapter09;

/**
 * @author Benjamin Elfen
 *
 */
public class Haustier {
	private String name;
    private int anzahlBeine;

    /**
     * @param name is the name of the pet
     * @param anzahlBeine is the number of legs of the pet
     */
    protected Haustier(String name, int anzahlBeine) {
        super();                                        // optional
        this.name = name;
        this.anzahlBeine = anzahlBeine;
    }

    public String getName() {
    	return this.name;
    }
    
    public int getAnzahlBeine() {
    	return this.anzahlBeine;
    }
    
    public String toString() {
    	return "Dieses Tier hat " + getAnzahlBeine() + " Beine und heißt " + getName() + ".";
    }
}

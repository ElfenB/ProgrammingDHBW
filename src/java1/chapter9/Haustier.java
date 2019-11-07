package java1.chapter9;

public class Haustier {
	private String name;
    private int anzahlBeine;

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
    
    // TODO main-Methode mit einfachem Test
}

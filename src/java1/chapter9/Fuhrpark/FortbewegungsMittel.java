package java1.chapter9.Fuhrpark;

public class FortbewegungsMittel {
	private final int maximaleInsassenzahl;
	
	public FortbewegungsMittel(int maximaleInsassenzahl) {
		this.maximaleInsassenzahl = maximaleInsassenzahl;
	}
	
	public int getMaximaleInsassenAnzahl() {
		return this.maximaleInsassenzahl;
	}
	
	public String toString() {
		return "Dieses Fortbewegungsmittel hat " + this.getMaximaleInsassenAnzahl() + " verfügbare Plätze.";
	}
	
}

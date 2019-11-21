package java1.chapter09.Fuhrpark;

public class Landfahrzeuge extends FortbewegungsMittel {
	private int reifenAnzahl;
	public Landfahrzeuge(int maximaleInsassenzahl, int reifenAnzahl) {
		super(maximaleInsassenzahl);
		this.reifenAnzahl = reifenAnzahl;
	}
	
	public int getReifenAnzahl() {
		return this.reifenAnzahl;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Es sind " + this.getReifenAnzahl() + " Reifen verbaut.";
	}
	
}

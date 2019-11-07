package java1.chapter9.Fuhrpark;

public class Luftfahrzeuge extends FortbewegungsMittel {
	private int anzahlTurbinen;
	
	public Luftfahrzeuge(int maximaleInsassenzahl, int anzahlTurbinen) {
		super(maximaleInsassenzahl);
		this.anzahlTurbinen = anzahlTurbinen;
	}
	
	public int getAnzahlTurbinen() {
		return this.anzahlTurbinen;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Es sind " + this.getAnzahlTurbinen() + " Turbinen verbaut.";
	}
}

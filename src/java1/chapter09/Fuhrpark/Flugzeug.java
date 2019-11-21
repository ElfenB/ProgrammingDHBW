package java1.chapter09.Fuhrpark;

public class Flugzeug extends Luftfahrzeuge {
	private int anzahlSexyBordpersonal;
	
	public Flugzeug(int maximaleInsassenzahl, int anzahlTurbinen, int anzahlSexyBordpersonal) {
		super(maximaleInsassenzahl, anzahlTurbinen);
		this.anzahlSexyBordpersonal = anzahlSexyBordpersonal;
	}
	
	public int getAnzahlSexyBordpersonal() {
		return this.anzahlSexyBordpersonal;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Es werden " + this.getAnzahlSexyBordpersonal() + " Stewardessen benötigt.";
	}
}

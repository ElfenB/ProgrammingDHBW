package java1.chapter7;


public class Auto {
	public static int autoAnzahl;
	public String kennzeichen;
	public String modell;
	public int insassenAnzahl;
	public int tankInhalt;
	
	public Auto(String kennzeichen, String modell) {
		this.kennzeichen = kennzeichen;
		this.modell = modell;
	}

	public int einsteigen(int personen) {
		insassenAnzahl += personen;
		return insassenAnzahl;
	}
	
	public int aussteigen(int personen) {
		insassenAnzahl -= personen;
		return insassenAnzahl;
	}
	
	
	public int tanken(int liter) {
		tankInhalt += liter;
		return tankInhalt;
	}
	
	public int verbrauchen(int liter) {
		tankInhalt -= liter;
		return tankInhalt;
	}
	
}

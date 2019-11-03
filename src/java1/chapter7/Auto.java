package java1.chapter7;


public class Auto {
	// static variable for counting sum of cars
	public static int autoAnzahl;
	// Strings for number plate & model
	public String kennzeichen;
	public String modell;
	// integers for number of people in the car and fuel in the tank
	public int insassenAnzahl;
	public int tankInhalt;
	
	// constructor for adding new car
	public Auto(String kennzeichen, String modell) {
		// assigning values to variables
		this.kennzeichen = kennzeichen;
		this.modell = modell;
		// count up the amount of cars
		autoAnzahl++;
	}

	// methods for actions with the car
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

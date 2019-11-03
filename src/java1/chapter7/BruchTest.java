package java1.chapter7;

/**
 * @author Benjamin Elfen
 * 
 * Test class for Bruch calculator
 * Prints ok if method works and FEHLER if not
 *
 */
public class BruchTest {

	public static void main(String[] args) {
		// Fractions for Testing
		Bruch bruch1 = new Bruch(1, 2);
		Bruch bruch2 = new Bruch(3, 4);
		Bruch bruch3 = new Bruch(1, 2);
		
		// heading
		System.out.println("<== Testklasse für Bruchrechnungsklasse ==>");
		
// NEGATION
		System.out.print("Negieren: ");
		if (bruch1.negiere().toDouble() == -0.5) {
			System.out.print("ok");
		} else {
			System.out.print("FEHLER");
		}
// ADDITION
		System.out.println();
		System.out.print("Additon: ");
		if (bruch1.addiere(bruch2).toDouble() == 5.0/4) {
			System.out.print("ok");
		} else {
			System.out.print("FEHLER");
		}
// SUBSTRAKTION
		System.out.println();
		System.out.print("Substraktion: ");
		if (bruch1.substrahiere(bruch2).toDouble() == -1.0/4) {
			System.out.print("ok");
		} else {
			System.out.print("FEHLER");
		}
// KEHRWERT
		System.out.println();
		System.out.print("Kehrwert: ");
		if (bruch1.kehrwert().toDouble() == 2) {
			System.out.print("ok");
		} else {
			System.out.print("FEHLER");
		}
// ToDouble
		System.out.println();
		System.out.print("ToDouble: ");
		if (bruch1.toDouble() == 0.5) {
			System.out.print("ok");
		} else {
			System.out.print("FEHLER");
		}
// MULTIPLIKATION
		System.out.println();
		System.out.print("Multiplikation: ");
		if (bruch1.multiplizieren(bruch2).toDouble() == 3.0/8) {
			System.out.print("ok");
		} else {
			System.out.print("FEHLER");
		}
// DIVISION
		System.out.println();
		System.out.print("Division: ");
		if (bruch1.dividieren(bruch2).toDouble() == 2.0/3) {
			System.out.print("ok");
		} else {
			System.out.print("FEHLER");
		}
// POTENZIEREN
		System.out.println();
		System.out.print("Potenzieren: ");
		if ((bruch1.potenzieren(3).toDouble() == 1.0/8) & (bruch1.potenzieren(-3).toDouble() == 8.0) & (bruch3.potenzieren(0).toDouble() == 1.0)) {
			System.out.print("ok");
		} else {
			System.out.print("FEHLER");
		}
// VERGLEICH
		System.out.println();
		System.out.print("Vergleichen: ");
		if (bruch1.istGleich(bruch3) & !(bruch1.istGleich(bruch2))) {
			System.out.print("ok");
		} else {
			System.out.print("FEHLER");
		}
	}

}

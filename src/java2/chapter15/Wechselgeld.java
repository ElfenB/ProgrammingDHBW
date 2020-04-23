/**
 * 
 */
package java2.chapter15;

import java.util.Arrays;

/**
 * @author Benjamin Elfen
 *
 */
public class Wechselgeld {
	private static int[] muenzbetrag = new int [] { 200, 100, 50, 20, 10, 5, 2, 1 };

	/**
	 * @param betrag Geldbetrag angegeben in Euro.Cent
	 * @return Anzahl der benötigten Münzen an den passenden Stellen in Bezug zum Muenzbetrag Array
	 */
	public static int[] giveChange(double betrag) {
		// Rückgabefeld mit gleicher Länge wie das Muenzbetrag Array
		int[] output = new int[muenzbetrag.length];
		// Betrag in Integerwert umwandeln ohne Komma
		betrag *= 100;
		int betragINT = (int) betrag;
		
		int i = 0;
		while (betragINT > 0) {
			// verbose output for debugging/testing
//			System.out.println("i:" + i + ", betragINT:" + betragINT + ", muenzbetrag[i]:" + muenzbetrag[i]); 
			// Wenn der Restbetrag durch den Münzwert teilbar ist ...
			if (betragINT / muenzbetrag[i] > 0) {
				// wird das Ausgabe Array an der Stelle erhöht ...
				output[i]++;
				// und der Betrag der Münze abgezogen
				betragINT -= muenzbetrag[i];
			} else {
				// Zur nächsten Münzgröße übergehen
				i++;
			}
		}
		// Output
		return output;
	}
	
	
	
	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		// Ausgabe der Münzwerte
		System.out.println(Arrays.toString(muenzbetrag));
		// Testbetrag
		System.out.println(Arrays.toString(giveChange(4.69)));
	}

}

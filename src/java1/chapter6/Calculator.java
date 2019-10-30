package java1.chapter6;
import java.util.Scanner;

/**
 * @author Benjamin Elfen
 * 
 * This program is a calculator in the console. It can calculate many different things such as 
 * averages, absolutes, ...
 *
 */

public class Calculator {

	/**
	 * @param a is the number that's checked
	 * @return
	 */
	public static boolean parity(int a) {
//		return (a % 2 == 0 ? true : false);
		return a % 2 == 0;
	}
	
	/**
	 * @param b is number that has to be rounded
	 * @return
	 */
	public static double abs(double b) {
		if (b >= 0) {
			return b;
		} else {
			return Math.abs(b);
		}
	}
	
	/**
	 * @param b is the input int
	 * @return
	 * This is an overflow function to abs(double) and is meant for int
	 */
	public static int abs(int b) {
		if (b >= 0) {
			return b;
		} else {
			return Math.abs(b);
		}
	}
	
	// the following methods calculate different average values
	public static double arithmeticAverage(int a, int b) {
		return (a + b) / 2;
	}
	
	public static double geometricAverage(int a, int b) {
		return Math.sqrt(a * b);
	}
	
	public static double harmonicAverage(int a, int b) {
		return 2.0 / ((1.0 / a) + (1.0 / b));
	}
	
	/**
	 * @param c is the input int
	 * @return
	 */
	public static int divisorSum(int c) {
		int sumOfDivisors = 0;
		for (int i = 1; i <= c; i++) {
			// if true -> division possible
			if (c % i == 0) {
				// sum up divisors
				sumOfDivisors += i;
			}
		}
		return sumOfDivisors;
	}
	
	// a perfect number is half of its divisor sum
	public static boolean isPerfect(int d) {
		if (divisorSum(d) / d == 2) {
			return true;
		} else {
			return false;
		}
	}
	
	// checks if input is a prime
	public static boolean isPrim(int e) {
		if (divisorSum(e) == (e + 1)) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * @param f base
	 * @param g exponent
	 * @return result
	 */
	// can calculate f^g
	public static double powerRecursive(double f, int g) {
		if (g > 0) {
			return f * powerRecursive(f, g - 1);
		} else if (g < 0) {
			return f * powerRecursive(f, g + 1);
		} else {
			return 1.0;
		}
	}
	
	// can calculate h^i
	public static double powerIterative(double h, int i) {
		double result = 0.0;
		if (i == 0) {
			return 1;
		} else {
			result = h;
			for (int j = 1; j < i; j++) {
				result *= h;
			}
			return result;
		}
	}
	
	// TODO include menu method to display menu again when switch is empty (Enter to exit function)
	/////////////////////// MAIN
	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		// initialise scanner "scan"
		Scanner scan = new Scanner(System.in);
		
		// input
		// TODO add new actions here (next: 6)
		System.out.println("Bitte Aktion auswählen:");
		System.out.println("1. Paritätstest");
		System.out.println("2. Betrag");
		System.out.println("3. Mittelwert zweier Zahlen");
		System.out.println("4. Teilersumme");
		System.out.println("5. Primzahltest");
		System.out.println("6. Potenzberechnung");
		switch (scan.nextInt()) {
		// parity
		case 1:	
			System.out.println("Bitte ganzzahlige Zahl für Paritätstest eingeben.");
			// second input for calculations
			int parityInput = scan.nextInt();
			if (parity(parityInput)) {
				System.out.println("Die eingegebene Zahl " + parityInput + " ist gerade.");
			} else {
				System.out.println("Die eingegebene Zahl " + parityInput + " ist ungerade.");
			}
			break;
		// absolute number
		case 2: 
			System.out.println("Bitte Zahl eingeben, um den Betrag zu berechnen.");
			// second input for calculations
			double absInput = scan.nextDouble();
			System.out.println("Der Betrag der eingegeben Zahl " + absInput + " ist " + abs(absInput) + ".");
			break;
		// averages
		case 3: 
			// second input for calculations
			int a, b;
			System.out.println("Bitte Zahl 1 eingeben:");
			a = scan.nextInt();
			System.out.println("Bitte Zahl 2 eingeben:");
			b = scan.nextInt();
			System.out.println("Bitte wählen:");
			System.out.println("1. Arithmetisches Mittel");
			System.out.println("2. Geometrisches Mittel");
			System.out.println("3. Harmonisches Mittel");
			// select wanted average calculation
			switch (scan.nextInt()) {
			case 1:
				System.out.println("Das arithmetisches Mittel der Zahlen " + a + " und " + b + " ist " + arithmeticAverage(a, b) + ".");
				break;
			case 2:
				System.out.println("Das geometrisches Mittel der Zahlen " + a + " und " + b + " ist " + geometricAverage(a, b) + ".");
				break;
			case 3:
				System.out.println("Das harmonisches Mittel der Zahlen " + a + " und " + b + " ist " + harmonicAverage(a, b) + ".");
				break;
			default:
				break;
			}
			break;
		case 4: 
			System.out.println("Bitte natürliche Zahl eingeben:");
			int divisorInput = scan.nextInt();
			System.out.println("Die Teilersumme der Zahl " + divisorInput + " ist " + divisorSum(divisorInput) + ".");
			if (isPerfect(divisorInput)) {
				System.out.println("Die Zahl " + divisorInput + " ist vollkommen (die Hälfte ihrer Teilersumme).");
			}
			break;
		case 5: 
			System.out.println("Bitte natürliche Zahl für den Primzahltest eingeben:");
			int primInput = scan.nextInt();
			if (isPrim(primInput)) {
				System.out.println("Die Zahl " + primInput + " ist eine Primzahl.");
			} else {
				System.out.println("Die Zahl " + primInput + " ist KEINE Primzahl.");
			}
			break;
		case 6: 
			System.out.println("Bitte Basis eingeben:");
			int powerInputBase = scan.nextInt();
			System.out.println("Bitte natürlichen Exponent eingeben:");
			int powerInputExponent = scan.nextInt();
			System.out.println("Bitte gewünschte Berechnungsmethode auswählen:");
			System.out.println("1. Rekursiv");
			System.out.println("2. Iterativ");
			double powerResult = 0.0;
			int scannedMethod = scan.nextInt();
			if (scannedMethod == 1) {
				powerResult = powerRecursive(powerInputBase, powerInputExponent);
			} else if (scannedMethod == 2) {
				powerResult = powerIterative(powerInputBase, powerInputExponent);
			}
			System.out.println("Das Ergebnis von " + powerInputBase + " hoch " + powerInputExponent + " ist: " + powerResult);
		default:
			break;
		}
		// close scanner
		scan.close();
	}

}

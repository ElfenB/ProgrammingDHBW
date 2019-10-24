package Chapter6;
import java.util.Scanner;

public class Calculator {

	public static boolean parity(int a) {
		return (a % 2 == 0 ? true : false);
	}
	
	public static double abs(double b) {
		if (b >= 0) {
			return b;
		} else {
			return Math.abs(b);
		}
	}
	
	public static int abs(int b) {
		if (b >= 0) {
			return b;
		} else {
			return Math.abs(b);
		}
	}
	
	public static double arithmeticAverage(int a, int b) {
		return (a + b) / 2;
	}
	
	public static double geometricAverage(int a, int b) {
		return Math.sqrt(a * b);
	}
	
	public static double harmonicAverage(int a, int b) {
		return 2.0 / ((1.0 / a) + (1.0 / b));
	}
	
	public static void main(String[] args) {
		int actionNumber;
		Scanner scan = new Scanner(System.in);
		
		// input
		System.out.println("Bitte Aktion auswählen:");
		System.out.println("1. Paritätstest");
		System.out.println("2. Betrag");
		System.out.println("3. Mittelwert zweier Zahlen");
		actionNumber = scan.nextInt();
		switch (actionNumber) {
		case 1:	
			System.out.println("Bitte ganzzahlige Zahl für Paritätstest eingeben.");
			int parityInput = scan.nextInt();
			if (parity(parityInput)) {
				System.out.println("Die eingegebene Zahl " + parityInput + " ist gerade.");
			} else {
				System.out.println("Die eingegebene Zahl " + parityInput + " ist ungerade.");
			}
			break;
		case 2: 
			System.out.println("Bitte Zahl eingeben, um den Betrag zu berechnen.");
			double absInput = scan.nextDouble();
			System.out.println("Der Betrag der eingegeben Zahl " + absInput + " ist " + abs(absInput) + ".");
			break;
		case 3:
			int a, b;
			System.out.println("Bitte Zahl 1 eingeben:");
			a = scan.nextInt();
			System.out.println("Bitte Zahl 2 eingeben:");
			b = scan.nextInt();
			System.out.println("Bitte wählen:");
			System.out.println("1. Arithmetisches Mittel");
			System.out.println("2. Geometrisches Mittel");
			System.out.println("3. Harmonisches Mittel");
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
		default:
			break;
		}
		
		// output
		
		scan.close();
	}

}

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

	public static void mainMenu() {
		// TODO add new actions here (next: 7)
		System.out.println("============= Taschenrechner =============");
		System.out.println("Bitte Aktion auswählen:");
		System.out.println("1: Paritätstest");
		System.out.println("2: Betrag");
		System.out.println("3: Mittelwert zweier Zahlen");
		System.out.println("4: Teilersumme");
		System.out.println("5: Primzahltest");
		System.out.println("6: Potenzberechnung");
		System.out.println("7: Quersumme");
		System.out.println("0: Programm beenden");
		System.out.println("==========================================");
	}
	
	public static void parityInstructions(Scanner scan) {
		System.out.println("Bitte ganzzahlige Zahl für Paritätstest eingeben.");
		// second input for calculations
		int parityInput = scan.nextInt();
		if (parity(parityInput)) {
			System.out.println("Die eingegebene Zahl " + parityInput + " ist gerade.");
		} else {
			System.out.println("Die eingegebene Zahl " + parityInput + " ist ungerade.");
		}
	}
	
	private static void absoluteInstructions(Scanner scan) {
		System.out.println("Bitte Zahl eingeben, um den Betrag zu berechnen.");
		// second input for calculations
		double absInput = scan.nextDouble();
		System.out.println("Der Betrag der eingegeben Zahl " + absInput + " ist " + abs(absInput) + ".");
	}
	
	private static void averagesInstructions(Scanner scan) {
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
	}
	
	private static void divisorSumInstructions(Scanner scan) {
		System.out.println("Bitte natürliche Zahl eingeben:");
		int divisorInput = scan.nextInt();
		System.out.println("Die Teilersumme der Zahl " + divisorInput + " ist " + divisorSum(divisorInput) + ".");
		if (isPerfect(divisorInput)) {
			System.out.println("Die Zahl " + divisorInput + " ist vollkommen (die Hälfte ihrer Teilersumme).");
		}
	}
	
	private static void primeInstructions(Scanner scan) {
		System.out.println("Bitte natürliche Zahl für den Primzahltest eingeben:");
		int primInput = scan.nextInt();
		if (isPrim(primInput)) {
			System.out.println("Die Zahl " + primInput + " ist eine Primzahl.");
		} else {
			System.out.println("Die Zahl " + primInput + " ist KEINE Primzahl.");
		}
	}
	
	private static void powerInstructions(Scanner scan) {
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
	}
	
	public static void digitSumInstructions(Scanner scan) {
		System.out.println("Bitte Zahl eingeben, um die Quersumme zu berechnen:");
		int digitSumInput = scan.nextInt();
		System.out.println("Die Quersumme von " + digitSumInput + " ist " + digitSum(digitSumInput));
	}
	
	// variable for while loop in main to steer input better
	public static boolean finished = false;
	
	// termination message
	public static void terminateProgram() {
		System.out.println("");
		System.out.println("-----------------------------------------");
		System.out.println("//\\\\ ><Das Programm wurde beendet.>< //\\\\");
		System.out.println("-----------------------------------------");
		finished = true;
	}
	
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
	 * @return rounded number
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
	 * @return rounded number
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
	// a and b are the two numbers that get averaged
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
	 * @return divisor sum
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
	/**
	 * @param d number to test on perfectness
	 * @return yes or no to perfectness
	 */
	public static boolean isPerfect(int d) {
		if (divisorSum(d) / d == 2) {
			return true;
		} else {
			return false;
		}
	}
	
	// checks if input is a prime
	/**
	 * @param e number to test on prime
	 * @return yes or no to prime
	 */
	public static boolean isPrim(int e) {
		if (divisorSum(e) == (e + 1)) {
			return true;
		} else {
			return false;
		}
	}
	
	// can calculate f^g
	/**
	 * @param f base
	 * @param g exponent
	 * @return result
	 */
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
	/**
	 * @param h base
	 * @param i exponent
	 * @return result
	 */
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
	
	public static int digitSum(int value) {
		int result = 0;
        
        while (value > 0) {
        	result += value % 10;
        	value = value / 10;
		}
        return result;
	}
	
	// TODO include menu method to display menu again when switch is empty (Enter to exit function)
	/////////////////////// MAIN
	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		// brings up main menu
		mainMenu();
		finished = false;
		
		// initialise scanner "scan"
		Scanner scan = new Scanner(System.in);
		
		// boolean gets true in terminateProgram() method and is only for ending the while loop
		while (!finished) {
			// input
			// changed from nextInt to nextLine to give out main menu again and again
			switch (scan.nextLine()) {
			// parity
			case "0":
				terminateProgram();
				break;
			case "1":
				parityInstructions(scan);
				terminateProgram();
				break;
			// absolute number
			case "2":
				absoluteInstructions(scan);
				terminateProgram();
				break;
			// averages
			case "3":
				averagesInstructions(scan);
				terminateProgram();
				break;
			// sum of divisors
			case "4":
				divisorSumInstructions(scan);
				terminateProgram();
				break;
			// prime tester
			case "5":
				primeInstructions(scan);
				terminateProgram();
				break;
			// power calculator
			case "6":
				powerInstructions(scan);
				terminateProgram();
				break;
			case "7":
				digitSumInstructions(scan);
				terminateProgram();
				break;
			default:
				mainMenu();
				break;
			}
		}
		// close scanner
		scan.close();
	}

}

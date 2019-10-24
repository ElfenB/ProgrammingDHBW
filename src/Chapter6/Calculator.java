package Chapter6;
import java.util.Scanner;

public class Calculator {

	public static boolean parity(int a) {
		return (a % 2 == 0 ? true : false);
	}
	
	public static void main(String[] args) {
		int actionNumber;
		Scanner scan = new Scanner(System.in);
		
		// input
		System.out.println("Bitte Aktion auswählen:");
		System.out.println("1. Paritätstest");
		actionNumber = scan.nextInt();
		switch (actionNumber) {
		case 1:	
			System.out.println("Bitte ganzzahlige Zahl für Paritätstest eingeben.");
			int input = scan.nextInt();
			if (parity(input)) {
				System.out.println("Die eingegebene Zahl " + input + " ist gerade.");
			} else {
				System.out.println("Die eingegebene Zahl " + input + " ist ungerade.");
			}
			
			break;

		default:
			break;
		}
		
		// output
		
		scan.close();
	}

}

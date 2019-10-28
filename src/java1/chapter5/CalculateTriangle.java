package java1.chapter5;

import java.util.Scanner;

/**
 * @author Benjamin Elfen
 * 
 * This program takes the lenghts of 3 sides and evaluates different characteristics of it
 *
 */
public class CalculateTriangle {
	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// type of triangle
		String stateOfObject = "";
		
		// input
		System.out.println("Bitte die Seitenlängen des Dreiecks eingeben, um mit der Bestimmung fortzufahren.");
		System.out.print("Länge der Seite a: ");
		double a = scan.nextDouble();
		System.out.print("Länge der Seite b: ");
		double b = scan.nextDouble();
		System.out.print("Länge der Seite c: ");
		double c = scan.nextDouble();
		
		// calculations
		// one side bigger than sum of the other 2
		if ((a + b) < c || (b + c) < a || (a + c) < b) {
			stateOfObject = "ungültig";
		// all same
		} else if (a == b & b == c) {
			stateOfObject = "gleichseitig (und gleichschenklig)";
		// two sides are the same
		} else if (a == b || b == c || a == c) {
			stateOfObject = "gleichschenklig";
		// Pythagoras
		} else if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2) || (Math.pow(b, 2) + Math.pow(c, 2)) == Math.pow(a, 2) || (Math.pow(a, 2) + Math.pow(c, 2)) == Math.pow(b, 2)) {
			stateOfObject = "rechtwinklig";
		} else {
			stateOfObject = "gültig, aber nicht speziell";
		}
		
		
		// output
		System.out.println("Die eingegebenen Seitenlängen lassen darauf schließen, dass das Dreieck " + stateOfObject + " ist.");
		
		scan.close();
	}
}

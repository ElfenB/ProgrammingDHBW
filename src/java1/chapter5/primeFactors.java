package java1.chapter5;

import java.util.Scanner;

/**
 * @author Benjamin Elfen
 *
 */
public class primeFactors {
	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte Zahl eingeben, die in ihre Primfaktoren zerlegt werden soll.");
		// get input
		int prime = scan.nextInt();
		// output description
		System.out.println("Primfaktoren der Zahl \"" + prime + "\" sind:");
		// lowest possible prime factor
		int i = 2;
		
		// 2 is lowest prime factor
		while (prime >= 2) {
			// if division possible
			if (prime % i == 0) {
				// output of prime factors
				System.out.println(i);
				// division
				prime /= i;
				// back on start prime factor
				i = 2;
			} else {
				// if last one did not work increase
				i++;
			}
		}
		System.out.println("Primfaktorzerlegung abgeschlossen.");
		// close scanner
		scan.close();
	}
}

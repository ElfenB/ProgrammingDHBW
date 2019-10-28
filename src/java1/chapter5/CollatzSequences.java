package java1.chapter5;

import java.util.Scanner;

/**
 * @author Benjamin Elfen
 * 
 * This program uses the Collatz sequences and plays around with numbers
 *
 */
public class CollatzSequences {
	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bitte Startzahl für die Collatz-Folge eingeben:");
		// input
		int input = scan.nextInt();
		// input save
		int startwert = input;
		int i = 1, highestNumber = 0;
		// first output
		System.out.println("Zahlen der Schleife sind: ");
		
		// loop with Collatz formula
		while (input != 1) {
			if (input % 2 == 0) {
				input /= 2;
			} else {
				input = 3 * input + 1;
			}
			// add up i for getting runs
			i++;
			// getting highest sequence value
			if (input > highestNumber) {
				highestNumber = input;
			}
			// output of each values
			System.out.print(input + " ");
		}
		//output
		System.out.println("");
		System.out.println("Die Durchlaufanzahl der Collatz-Folge mit dem Startwert \"" + startwert + "\" inklusive der Startzahl selbst beträgt " + i + ".");
		System.out.println("Die höchste erreichte Zahl war die " + highestNumber + ".");
		
		scan.close();
	}
}

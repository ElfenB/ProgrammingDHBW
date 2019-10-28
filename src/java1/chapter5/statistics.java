package java1.chapter5;

import java.util.Scanner;

/**
 * @author Benjamin Elfen
 * 
 * Program takes input values and shows highest, lowest value and average
 *
 */
public class statistics {
	public static void main(String[] args) {
		// Declaration and Initialization
		// givenFigure starts at 0 - otherwise loop wouldn't start
		int givenFigure = 1, highestFigure = 0, lowestFigure = 0, i = 0;
		double average = 0.0;
		// Some Booleans for safety
		boolean firstRun = true, errorOccured = false;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie Zahlen ein. Mit der 0 kann die Eingabe beendet und die Auswertung abgerufen werden.");
		// Input can be finished with a 0
		while (givenFigure != 0) {
			// assuring only numbers are put in 
			try {
				givenFigure = scan.nextInt();
				
			// error part
			} catch (Exception e) {
				System.out.println("Bitte nur Zahlen eingeben!");
				errorOccured = true;
				break;
			}
			// starting the process with some starting values
			if (firstRun) {
				highestFigure = givenFigure;
				lowestFigure = givenFigure;
				firstRun = false;
				// if 0 is inserted the first time
				if (givenFigure == 0) {
					// switching off any output
					errorOccured = true;
				}
			}
			// saving highs and lows in variables
			if (givenFigure == 0) {
				break;
			} else if (givenFigure > highestFigure) {
				highestFigure = givenFigure;
				
			} else if (givenFigure < lowestFigure) {
				lowestFigure = givenFigure;
				
			}
			// counting i up for dividing average
			i++;
			// average is a big sum
			average += givenFigure;
		}
		if (!errorOccured) {
			// calculating average value
			average /= i;
			// closing scanner
			scan.close();
			// output
			System.out.println("Die Eingabe der Zahlenfolge wurde mit der 0 beendet.");
			System.out.println("Die niedrigste Zahl war die " + lowestFigure + ", die höchste die " + highestFigure + " und im Durchschnitt wurden Zahlen der Größe " + average + " eingegeben.");
		}
	}
}

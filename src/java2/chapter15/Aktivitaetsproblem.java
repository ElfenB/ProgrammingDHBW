/**
 * 
 */
package java2.chapter15;

import java.util.Arrays;

/**
 * @author Benjamin Elfen
 *
 */
public class Aktivitaetsproblem {

	private static boolean[] choose(int[][] termine) {
		// output array = size of input array but boolean instead of int
		boolean[] output = new boolean[termine.length];
		
		// sorts array without mixing up dimensions - no idea how but it works - requires Java8+
		Arrays.sort(termine, (a, b) -> Double.compare(a[0], b[0]));

		output[0] = true;	// erstes Event wird besucht
		for (int i = 1; i < termine.length; i++) {
			// following line is for debugging/verbose
//			System.out.println(termine[i-1][1] + "<" + termine[i][0]);
			// wenn das enddatum des vorher stattfindenden events vor dem startdatum dieses events liegt dann kann es stattfinden
			int j = output.length - 1;
			while (!output[j]) {	// das event finden dass als letztes stattgefunden hat
				j--;
			}
			if (termine[j][1] < termine[i][0]) {	// das enddatum des zuletzt stattgefundenen events ermitteln und mit dem startdatum des neuen vergleichen
				output[i] = true;	// wenn das startdatum größer ist dann kann es wahrgenommen werden
			}
		}
		// output
		return output;
	}
	
	/**
	 * @param theArray Array to be print in console
	 * 
	 * This method prints a two dimensional array into the console (vertically)
	 * 
	 */
	private static void printTwoDimensionalArray(int[][] theArray) {
		// output String
		String theValuesToPrint = "";
		// makes it easier
		String newLine = "\n";
		// runs over array to get the values
		for (int i = 0; i < theArray.length; i++) {
			for (int j = 0; j < theArray[i].length; j++) {
				// add the values to the String
				theValuesToPrint += (theArray[i][j]);
				// only print comma in the middle - not at the end
				if (j < theArray[i].length - 1) {
					theValuesToPrint += ", ";
				}
			}
			// insert newLine
			theValuesToPrint += newLine;
		}
		// print output String
		System.out.println(theValuesToPrint);
	}
	
	/**
	 * @param args not used
	 * 
	 * tests for choose method
	 * 
	 */
	public static void main(String[] args) {
		// create arrays
		int[][] termine = new int[10][2];
		int[] starttermine = new int[] { 43, 11, 28, 52, 10, 34, 21, 46, 2, 51 };
		int[] endtermine = new int[] { 52, 24, 35, 58, 11, 46, 31, 51, 10, 52 };
		
		// start und endtermine in termine array einpflegen
		for (int i = 0; i < termine.length; i++) {
			termine[i][0] = starttermine[i];
			termine[i][1] = endtermine[i];
		}
		
		// testing
		printTwoDimensionalArray(termine);
		System.out.println(Arrays.toString(choose(termine)));
		printTwoDimensionalArray(termine);
	}

}

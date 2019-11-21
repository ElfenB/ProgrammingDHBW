package java1.chapter05;

import java.util.Scanner;

/**
 * @author Benjamin Elfen
 * 
 * This program searches the longest word in the input text
 *
 */

// TODO ignore comma, dot. and so on (special characters)

public class FindLongestWord {
	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String scannedWord = "";
		int highestLength = 0;
		String longestWords = "";
		int wordLength = 0;
		boolean multipleWords = false;
		
		// input
		System.out.println("Bitte Text eingeben, um das längste Wort/die längsten Wörter finden zu können.");
		String input = scan.nextLine();
		
		// TODO weniger abgefuckte Lösung finden als das Folgende?
		// delete spaces at beginning and end
		input.trim();
		// B1G TR1CK !!! Add space on input to run for-loop one time longer to cover the last word, too
		input += " ";
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != ' ') {
				// go through input String and put the single words in scannedWords
				scannedWord += input.charAt(i);
				// increase word length
				wordLength++;
			} else {
				if (wordLength > highestLength) {
					// if the scanned word is longer than the current stored longest word  it's the new one
					longestWords = scannedWord;
					// set new highest length
					highestLength = wordLength;
					// relevant for output line
					multipleWords = false;
				} else if (wordLength == highestLength) {
					// add new word behind current if same length
					longestWords += ", " + scannedWord;
					// relevant for output line
					multipleWords = true;
				} else {
					
				}
				// reset values for next scanned word
				wordLength = 0;
				scannedWord = "";
			}
		}
		
		// output
		System.out.println("");
		// use the boolean to create friendly user-experience
		if (multipleWords) {
			System.out.println("Die längsten Worte in diesem Text waren:");
		} else {
			System.out.println("Das längste Wort in diesem Text war:");
		}
		System.out.println(longestWords + " mit einer Länge von " + highestLength + ".");
		
		scan.close();
	}
}

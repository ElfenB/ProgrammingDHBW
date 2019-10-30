package java1.chapter6;

import java.util.Scanner;

import java1.chapter6.Calculator;

public class TextUtilities {
	
	public static String reverseText(String input) {
        String output = "";

        // HINT: CharAt
        
        // Minus 1 weil es bei 0 anfängt
        for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
        return output;
	}
	
	public static void reverseTextInstructions(Scanner scan) {
		System.out.println("Bitte Text zum Umkehren eingeben:");
		String input = scan.nextLine();
		System.out.println("Der eingegebene Text \"" + input + "\" ist umgedreht: \"" + reverseText(input) + "\".");
	}
	
	public static boolean isPalindrom(String input) {
		Boolean palindrom = true;
		
		// loop's high is word length (-1 due it's starting with 0)
		for (int i = 0; i < input.length() - 1; i++) {
			// checks if letters of given word are same at beginning and end
			if (!(input.charAt(i) == input.charAt(input.length() - 1 - i))) {
				palindrom = false;
			}
		}
		return palindrom;		
	}
	
	public static void palindromInstructions(Scanner scan) {
		
		System.out.println("Bitte zu-testendes Wort eingeben:");
		String input = scan.nextLine();
		
		// Output lines with check if word is palindrom or not
		if (isPalindrom(input)) {
			System.out.println("Das von Ihnen eingegebene Wort \"" + input + "\" ist ein Palindrom.");
		} else {
			System.out.println("Das von Ihnen eingegebene Wort \"" + input + "\" ist KEIN Palindrom.");
		}
	}
	
	public static int wordCount(String input) {
        int numberOfWords = 0;
        // delete starting and ending spaces
        input = input.trim();
        // scan the sentence for spaces
        for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) == ' ') {
				// for each space add 1 word
				numberOfWords++;
			}
		}
        // add the one word that's usually after the last space
        numberOfWords += 1;
        return numberOfWords;
	}
	
	public static void wordCountInstructions(Scanner scan) {
		System.out.println("Bitte Text eingeben, um die Wörter zu zählen:");
		String input = scan.nextLine();
		System.out.println("Die Anzahl der Worte in \"" + input + "\" ist " + wordCount(input));
	}
	
	public static String caesarChiffre(String input, int chiffrekey) {
		String output = "";
		char temporary;
		
		for (int i = 0; i < input.length(); i++) {
			
			// taking the word and ripping it into chars
			temporary = input.charAt(i);
			// locals
			int charNumber = 0;
			boolean specialChar = false;
			// dictionary: numbers instead of chars
			switch (temporary) {
			case 'a':
				charNumber = 1;
				break;
			case 'b':
				charNumber = 2;
				break;
			case 'c':
				charNumber = 3;
				break;
			case 'd':
				charNumber = 4;
				break;
			case 'e':
				charNumber = 5;
				break;
			case 'f':
				charNumber = 6;
				break;
			case 'g':
				charNumber = 7;
				break;
			case 'h':
				charNumber = 8;
				break;
			case 'i':
				charNumber = 9;
				break;
			case 'j':
				charNumber = 10;
				break;
			case 'k':
				charNumber = 11;
				break;
			case 'l':
				charNumber = 12;
				break;
			case 'm':
				charNumber = 13;
				break;
			case 'n':
				charNumber = 14;
				break;
			case 'o':
				charNumber = 15;
				break;
			case 'p':
				charNumber = 16;
				break;
			case 'q':
				charNumber = 17;
				break;
			case 'r':
				charNumber = 18;
				break;
			case 's':
				charNumber = 19;
				break;
			case 't':
				charNumber = 20;
				break;
			case 'u':
				charNumber = 21;
				break;
			case 'v':
				charNumber = 22;
				break;
			case 'w':
				charNumber = 23;
				break;
			case 'x':
				charNumber = 24;
				break;
			case 'y':
				charNumber = 25;
				break;
			case 'z':
				charNumber = 26;
				break;
			default:
				specialChar = true;
				break;
			}
			if (!specialChar) {
				// add chiffre
				charNumber += chiffrekey;
				// manage overflow
				charNumber = charNumber % 26;
			}
			// dictionary: chars instead of numbers
			switch (charNumber) {
			case 1:
				temporary = 'a';
				break;
			case 2:
				temporary = 'b';
				break;
			case 3:
				temporary = 'c';
				break;
			case 4:
				temporary = 'd';
				break;
			case 5:
				temporary = 'e';
				break;
			case 6:
				temporary = 'f';
				break;
			case 7:
				temporary = 'g';
				break;
			case 8:
				temporary = 'h';
				break;
			case 9:
				temporary = 'i';
				break;
			case 10:
				temporary = 'j';
				break;
			case 11:
				temporary = 'k';
				break;
			case 12:
				temporary = 'l';
				break;
			case 13:
				temporary = 'm';
				break;
			case 14:
				temporary = 'n';
				break;
			case 15:
				temporary = 'o';
				break;
			case 16:
				temporary = 'p';
				break;
			case 17:
				temporary = 'q';
				break;
			case 18:
				temporary = 'r';
				break;
			case 19:
				temporary = 's';
				break;
			case 20:
				temporary = 't';
				break;
			case 21:
				temporary = 'u';
				break;
			case 22:
				temporary = 'v';
				break;
			case 23:
				temporary = 'w';
				break;
			case 24:
				temporary = 'x';
				break;
			case 25:
				temporary = 'y';
				break;
			case 26:
				temporary = 'z';
				break;
			default:
				break;
			}
			// add chiffred char to output string
			output += temporary;
			specialChar = false;
		}
		//output
		return output;
	}
	
	public static void caesarChiffreInstructions(Scanner scan) {
		System.out.println("Bitte Text zum Verschlüsseln eingeben:");
		String input = scan.nextLine();
		System.out.println("Bitte die gewünschte Chiffredistanz auswählen:");
		int chiffreKey = scan.nextInt();
		System.out.println("Der eingegebene Text \"" + input + "\" wurde verschlüsselt zu: \"" + caesarChiffre(input, chiffreKey) + "\".");
	}
	
	public static void showLongestWords(String input) {
		String scannedWord = "";
		int highestLength = 0;
		String longestWords = "";
		int wordLength = 0;
		boolean multipleWords = false;
		
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
	}
	
	private static void showLongestWordInstructions(Scanner scan) {
		// input
		System.out.println("Bitte Text eingeben, um das längste Wort/die längsten Wörter finden zu können.");
		String input = scan.nextLine();
		showLongestWords(input);
	}
	
	/**
	 * This generates the beautiful menu that's displayed on startup
	 */
	public static void mainMenu() {
		System.out.println("============= Text-Werkzeuge =============");
		System.out.println("Bitte Aktion auswählen:");
		System.out.println("1: Text umkehren");
		System.out.println("2: Palindrom-Test");
		System.out.println("3: Wörter zählen");
		System.out.println("4: Caesar-Chiffre");
		System.out.println("0: Programm beenden");
		System.out.println("==========================================");
	}
	
	private static void switchLibrary(Scanner scan) {
		switch (scan.nextLine()) {
		case "0":
			Calculator.terminateProgram();
			finished = true;
			break;
		case "1":
			reverseTextInstructions(scan);
			Calculator.terminateProgram();
			finished = true;
			break;
		case "2":
			palindromInstructions(scan);
			Calculator.terminateProgram();
			finished = true;
			break;
		case "3":
			wordCountInstructions(scan);
			Calculator.terminateProgram();
			finished = true;
			break;
		case "4":
			caesarChiffreInstructions(scan);
			Calculator.terminateProgram();
			finished = true;
			break;
		case "5":
			showLongestWordInstructions(scan);
			Calculator.terminateProgram();
			finished = true;
			break;
//		case "6":
//			
//			Calculator.terminateProgram();
//			finished = true;
//			break;
			
		default:
			mainMenu();
			break;
		}
	}

	
	public static boolean finished = false;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		mainMenu();
		
		while (!finished) {
			switchLibrary(scan);
		}
		scan.close();
	}


}

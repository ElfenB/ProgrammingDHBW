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
	
	public static void mainMenu() {
		System.out.println("============= Text-Werkzeuge =============");
		System.out.println("Bitte Aktion auswählen:");
		System.out.println("1: Text umkehren");
		System.out.println("2: Palindrom-Test");
		System.out.println("3: Wörter zählen");
		System.out.println("0: Programm beenden");
		System.out.println("==========================================");
	}
	
	private static void switchLibrary(Scanner scan) {
		switch (scan.nextLine()) {
		case "1":
			reverseTextInstructions(scan);
			Calculator.terminateProgram();
			break;
		case "2":
			palindromInstructions(scan);
			Calculator.terminateProgram();
			break;
		case "3":
			wordCountInstructions(scan);
			Calculator.terminateProgram();
			break;
//		case "4":
//			
//			Calculator.terminateProgram();
//			break;
//		case "5":
//			
//			Calculator.terminateProgram();
//			break;
			
		default:
			Calculator.terminateProgram();
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

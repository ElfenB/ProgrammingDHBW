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
	
	public static void mainMenu() {
		System.out.println("============= Text-Werkzeuge =============");
		System.out.println("Bitte Aktion auswählen:");
		System.out.println("1: Text umkehren");
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
			
			Calculator.terminateProgram();
			break;
//		case "3":
//			
//			Calculator.terminateProgram();
//			break;
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

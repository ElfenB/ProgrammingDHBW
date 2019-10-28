package java1.chapter5;

import java.util.Scanner;

/**
 * @author Benjamin Elfen
 * 
 * This program can take the put in word and encode/decode it with Caesar Chiffre.
 *
 */
public class CaesarChiffre2 {
	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input, output = "";
		char temporary;
		int chiffreKey;
		
		System.out.println("Bitte Text zum Verschlüsseln eingeben:");
		input = scan.nextLine();
		System.out.println("Bitte die gewünschte Chiffredistanz auswählen:");
		chiffreKey = scan.nextInt();
		
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
				charNumber += chiffreKey;
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
		System.out.println(output);

		scan.close();
	}
}

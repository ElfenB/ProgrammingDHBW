package java1.chapter05;

import java.util.Scanner;

/**
 * @author Benjamin Elfen
 * 
 * Program finds out if a given word is a palindrom (same word when read forwards or backwards)
 *
 */
public class Palindrom {
	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Boolean isPalindrom = true;
		
		// scans user input
		String palindrom = scan.nextLine();
		// loop's high is word length (-1 due it's starting with 0)
		for (int i = 0; i < palindrom.length() - 1; i++) {
			// checks if letters of given word are same at beginning and end
			if (!(palindrom.charAt(i) == palindrom.charAt(palindrom.length() - 1 - i))) {
				isPalindrom = false;
			}
		}
		
		// Output lines with check if word is palindrom or not
		if (isPalindrom) {
			System.out.println("Das von Ihnen eingegebene Wort \"" + palindrom + "\" ist ein Palindrom.");
		} else {
			System.out.println("Das von Ihnen eingegebene Wort \"" + palindrom + "\" ist KEIN Palindrom.");
		}
		
		scan.close();
	}
}

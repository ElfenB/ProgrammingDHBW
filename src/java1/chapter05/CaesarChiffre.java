package java1.chapter05;

import java.util.Scanner;

public class CaesarChiffre {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input, output = "";
		char temporary;
		int chiffreKey;
		
		System.out.println("Bitte Text zum Verschlüsseln eingeben:");
		input = scan.nextLine();
		System.out.println("Bitte die gewünschte Chiffre auswählen:");
		chiffreKey = scan.nextInt();
		
		for (int i = 0; i < input.length(); i++) {
			
			temporary = input.charAt(i);
			temporary += chiffreKey;
			output += temporary;
		}
		
		System.out.println(output);
		
		scan.close();
	}
}

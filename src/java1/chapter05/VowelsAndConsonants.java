package java1.chapter05;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        String input = "analsex";
        char character;
        int vowelCount = 0, consonantCount = 0, mutatedvowel = 0;

        // TODO Count the vowels and consonants of the given input
        for (int i = input.length() - 1; i >= 0; i--) {
			character = input.charAt(i);
        	switch (character) {
			case 'a': case 'e': case 'i': case 'o': case 'u': case 'A': case 'E': case 'I': case 'O': case 'U':
				vowelCount++;
				break;
			
			case 'ä': case 'ö': case 'ü':
				mutatedvowel++;
				break;
	
			default:
				consonantCount++;
				break;
			}
		}
        

        System.out.println('"' + input + '"' + " enthält " + vowelCount + " Vokale, " + mutatedvowel + " Umlaute und " + consonantCount + " Konsonanten.");
    }
}

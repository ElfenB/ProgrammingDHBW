package java1.chapter5;

/**
 * @author Benjamin Elfen
 * 
 * This program counts the words of a sentence by looking for spaces
 *
 */
public class WordCount {
    /**
     * @param args not used
     */
    public static void main(String[] args) {
        String input = "Wie viele Worte hat dieser Satz denn eigentlich?";
        int numberOfWords = 0;

        // scan the sentence for spaces
        for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) == ' ') {
				// for each space add 1 word
				numberOfWords++;
			}
		}

        // add the one word that's usually after the last space
        numberOfWords += 1;
        System.out.println("Die Anzahl der Worte in \"" + input + "\" ist " + numberOfWords);
    }
}
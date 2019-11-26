package java1.chapter11;
public class CharacterDistribution {
    /**
     * @param text is the input
     * @return array 0-255 where every number is the correlating ASCII char (e.g. a = 97)
     */
    public static int[] getDistribution(String text) {
    	// transforming all uppercase letters into lowercase (optional)
    	String input = text.toLowerCase();
    	// remove spaces in the beginning and at end
    	input.trim();
    	// length 256 is chosen because of the first 256 ASCII symbols
    	int[] result = new int[256];

    	// temporary variable to transform char to int to put into array
    	int temp = 0;
    	for (int i = 0; i < input.length(); i++) {
    		// making temporary int the ASCII coding of the char
			temp = input.charAt(i);
			// if-check prevents out of bounds error
			if (temp <= 255) {
			// adding value to the corresponding number in the array
				result[temp]++;
			}
		}
    	return result;
    }

    /**
     * @param distribution is the result of getDristibution method
     * 
     * prints out the result of a word count statistic
     */
    public static void printDistribution(int[] distribution) {
    	// temporary char variable
    	char temp;
    	// output String
    	String result = "";
    	for (int i = 0; i < distribution.length; i++) {
    		// checks if there are chars like this (min 1 to get rid of 0s)
			if (distribution[i] != 0) {
				// cast temporary variable back to char
				temp = (char) i;
				// add char and count onto output String (\n is for line-break)
				result += temp + " - " + distribution[i] + "\n";
			}
		}
    	// output
    	System.out.println(result);
    }

    public static void main(String[] args) {
    	String text = "Testtext";
//    	String text = "Gallia est omnis divisa in partes tres, quarum unam incolunt Belgae, aliam Aquitani, tertiam qui ipsorum lingua Celtae, nostra Galli appellantur.";
//    	String text = "Habe nun, ach! Philosophie, Juristerey und Medicin, Und leider auch Theologie! Durchaus studirt, mit heißem Bemühn. Da steh’ ich nun, ich armer Thor! Und bin so klug als wie zuvor;";
//    	String text = "Many were increasingly of the opinion that they'd all made a big mistake in coming down from the trees in the first place. And some said that even the trees had been a bad move, and that no one should ever have left the oceans.";

    	// get distribution of chars
        int[] distribution = getDistribution(text);
        // output
        printDistribution(distribution);
    }
}
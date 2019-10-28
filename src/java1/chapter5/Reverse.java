package java1.chapter5;

public class Reverse {
    public static void main(String[] args) {
        String input = "Meine Eingabe";
        String output = "";

        // HINT: CharAt
        
        // Minus 1 weil es bei 0 anfängt
        for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
        System.out.println(output);
    }
}

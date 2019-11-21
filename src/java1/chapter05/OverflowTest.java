package java1.chapter05;

/**
 * @author Benjamin Elfen
 * 
 * This program sums up integers until the overflow kicks in
 *
 */
public class OverflowTest {
	public static void main(String[] args) {
		int result = 0, i = 1;
		while (i + result > 0) {
			result += i;
			i++;
		}
		// because we need the LAST added number
		i--;
		System.out.println("Die höchste erreichte Zahl bei der Aufsummierung war die " + result + ".");
		System.out.println("Die letzte aufsummierte Zahl war die " + i + ".");
	}
}

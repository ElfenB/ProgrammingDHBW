/**
 * 
 */
package testPrepping;

/**
 * @author Benjamin Elfen
 *
 */
public class Arrays {
	public static void main(String[] args) {
		boolean[] primes = new boolean[10];
		for (int i = 0; i < primes.length; i++) {
			primes[i] = java1.chapter06.Calculator.isPrim(i);
		}
		
		char[] vorname = new char[] {'B', 'e', 'n'};
		
		System.out.println(java.util.Arrays.toString(primes));
		System.out.println(java.util.Arrays.toString(vorname));
		System.out.println(vorname[0]);
		System.out.println(vorname[1]);
		System.out.println(vorname[2]);
	}
}

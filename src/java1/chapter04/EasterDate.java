package java1.chapter04;

/**
 * @author Benjamin Elfen
 * 
 * program shows Easter Date in the specific year
 *
 */
public class EasterDate {
	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		// insert year here
		int year = 2019;
		
		// the following variables are used for the calculation of Carl Friedrich Gauß
		int k = year / 100;
		int p = (8* k + 13) / 25;
		int q = k / 4;
		int M = (15 + k - p - q) % 30;
		int N = (4 + k - q) % 7;
		int a = year % 19;
		int b = year % 4;
		int c = year & 7;
		int d = (19 * a + M) % 30;
		int e = (2 * b + 4 * c + 6 * d + N) % 7;
		int t = 22 + d + e;
		int tag, monat; 
		if (t < 32) {
			tag = t;
			monat = 3;
		} else {
			tag = t - 31;
			monat = 4;
		}
		
		// output
		System.out.println("Das Osterdatum im Jahr " + year + " ist der " + tag + "." + monat + "." + year);
		
//		k = jahr div 100
//		p = (8k + 13) div 25
//		q = k div 4
//		M = (15 + k - p - q) mod 30
//		N = (4 + k - q) mod 7
//		a = jahr mod 19
//		b = jahr mod 4
//		c = jahr mod 7
//		d = (19a + M) mod 30
//		e = (2b + 4c + 6d + N) mod 7
//		t = 22 + d + e
//		falls t < 32: tag = t, monat = 3
//		sonst: tag = t - 31, monat = 4
	}
}

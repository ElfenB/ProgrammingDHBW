/**
 * 
 */
package java2.chapter14;
import java.util.*;

/**
 * @author Benjamin Elfen
 * 
 * Chapter 14 Number 3
 *
 */
public class SortingRandomNumbers {
	
	public SortingRandomNumbers() {
		
	}
	
	Scanner scan = new Scanner(System.in);
	private int ArraySize = scan.nextInt();
	private int[] data = new int[ArraySize];
	
	Random generator = new Random();
	
	private void buildArray() {
		for (int i = 0; i < ArraySize; i++) {
			data[i] = generator.nextInt(ArraySize);
		}
	}
}

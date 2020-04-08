/**
 * 
 */
package java2.chapter13;

import java.util.Arrays;

/**
 * @author Benjamin Elfen
 * 
 * This is a test program of my own sort algorithm that came entirely out of my head
 *
 */
public class EigenerSortieralgorithmus {
	public static void main(String[] args) {
        int[] data = new int[] {5, 4, 8, 6, 3, 10, 2, 7, 9, 1};

        // TODO sortiere das Feld data aufsteigend
        data = sort(data);

        System.out.println(Arrays.toString(data));
    }
	
	private static int[] sort(int[] input) {
		// new output array
		int[] output = new int[input.length];
		
		// find out biggest and smallest number in array
		int biggest = input[0];
		int smallest = input[0];
		for (int i = 0; i < output.length; i++) {
			if (i > biggest) {
				biggest = i;
			}
			if (i < smallest) {
				smallest = i;
			}
		}
		// this is the secret formula part 1
		int variance = biggest - smallest;
		
		// fill the new array
		for (int i = 0; i < input.length; i++) {
			// this is the secret formula part 2
			int index = Math.abs(input[i] * (biggest - 1) / variance);
			System.out.println(index);						// debugging
			if (output[index] == 0) {
				output[index] = input[i];
			}
		}
		
		return output;
	}
}

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
	
	private static boolean displayArrays = true;
	
	private static Integer[] fillArrayR(Integer[] data) {
		Random generator = new Random();
		for (int i = 0; i < data.length; i++) {
			data[i] = generator.nextInt(data.length);
		}
		if (displayArrays) {
			System.out.println(Arrays.toString(data));
		}
		return data;
	}
	
	private static int getArraySize() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Größe des Arrays angeben:");
		int size = scan.nextInt();
		scan.close();
		if (size > 1000) {
			displayArrays = false;
		}
		return size;
	}
	
	public static boolean check(Integer[] values) {
        for (int index = 1; index < values.length; index++) {
            if (values[index - 1] > (values[index])) {
                return false;
            }
        }
        if (displayArrays) {
        	System.out.println(Arrays.toString(values));
		}
        return true;
    }
	
	public static void main(String[] args) {
		Integer[] data = new Integer[getArraySize()];

		fillArrayR(data);
		
		// Arrays.sort()
		System.out.print("Arrays.sort():  ");
		long start = System.currentTimeMillis();
		Arrays.sort(data);
		System.out.print("time needed: " + (System.currentTimeMillis() - start) + "ms ");
		System.out.print(check(data) ? "✓\n" : "ERROR\n");
		
		// FaultySort
		System.out.print("FaultySort:     ");
		long start4 = System.currentTimeMillis();
		new SortingAlgorithmEvaluator<Integer>().evaluate(new FaultySort<>(), data, false);
		System.out.print("time needed: " + (System.currentTimeMillis() - start4) + "ms ");
		System.out.print(check(data) ? "✓\n" : "ERROR\n");
		
		// Bubblesort
		System.out.print("Bubblesort:     ");
		long start1 = System.currentTimeMillis();
		new SortingAlgorithmEvaluator<Integer>().evaluate(new BubbleSort<>(), data, false);
		System.out.print("time needed: " + (System.currentTimeMillis() - start1) + "ms ");
		System.out.print(check(data) ? "✓\n" : "ERROR\n");
		
		// InsertionSort
		System.out.print("InsertionSort:  ");
		long start2 = System.currentTimeMillis();
		new SortingAlgorithmEvaluator<Integer>().evaluate(new InsertionSort<>(), data, false);
		System.out.print("time needed: " + (System.currentTimeMillis() - start2) + "ms ");
		System.out.print(check(data) ? "✓\n" : "ERROR\n");
		
		// SelectionSort
		System.out.print("SelectionSort:  ");
		long start3 = System.currentTimeMillis();
		new SortingAlgorithmEvaluator<Integer>().evaluate(new SelectionSort<>(), data, false);
		System.out.print("time needed: " + (System.currentTimeMillis() - start3) + "ms ");
		System.out.print(check(data) ? "✓\n" : "ERROR\n");
		
	}
}

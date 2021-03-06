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
		Integer[] data1 = Arrays.copyOf(data, data.length);
		
		// Arrays.sort()
		System.out.print("Arrays.sort():          ");
		long start = System.currentTimeMillis();
		Arrays.sort(data);
		System.out.print("time needed: " + (System.currentTimeMillis() - start) + "ms ");
		System.out.print(check(data) ? "✓\n" : "ERROR\n");
		
		data = Arrays.copyOf(data1, data1.length); // reset Array
		// Arrays.parallelSort()
		System.out.print("Arrays.parallelSort():  ");
		long start5 = System.currentTimeMillis();
		Arrays.parallelSort(data);
		System.out.print("time needed: " + (System.currentTimeMillis() - start5) + "ms ");
		System.out.print(check(data) ? "✓\n" : "ERROR\n");
		
		data = Arrays.copyOf(data1, data1.length); // reset Array
		// FaultySort
		System.out.print("FaultySort:             ");
		long start4 = System.currentTimeMillis();
		new FaultySort<Integer>().sort(data, false);
		System.out.print("time needed: " + (System.currentTimeMillis() - start4) + "ms ");
		System.out.print(check(data) ? "✓\n" : "ERROR\n");
		
		// SLOWER PRIMITIVE ALGORITHMS
		data = Arrays.copyOf(data1, data1.length); // reset Array
		// Bubblesort
		System.out.print("Bubblesort:             ");
		long start1 = System.currentTimeMillis();
		new BubbleSort<Integer>().sort(data, false);
		System.out.print("time needed: " + (System.currentTimeMillis() - start1) + "ms ");
		System.out.print(check(data) ? "✓\n" : "ERROR\n");
		
		data = Arrays.copyOf(data1, data1.length); // reset Array
		// InsertionSort
		System.out.print("InsertionSort:          ");
		long start2 = System.currentTimeMillis();
		new InsertionSort<Integer>().sort(data, false);
		System.out.print("time needed: " + (System.currentTimeMillis() - start2) + "ms ");
		System.out.print(check(data) ? "✓\n" : "ERROR\n");
		
		data = Arrays.copyOf(data1, data1.length); // reset Array
		// SelectionSort
		System.out.print("SelectionSort:          ");
		long start3 = System.currentTimeMillis();
		new SelectionSort<Integer>().sort(data, false);
		System.out.print("time needed: " + (System.currentTimeMillis() - start3) + "ms ");
		System.out.print(check(data) ? "✓\n" : "ERROR\n");
		
		// FASTER ADVANCED ALGORITHMS
		data = Arrays.copyOf(data1, data1.length); // reset Array
		// QuickSort
		System.out.print("QuickSort:              ");
		long start6 = System.currentTimeMillis();
		new QuickSort<Integer>().sort(data, false);
		System.out.print("time needed: " + (System.currentTimeMillis() - start6) + "ms ");
		System.out.print(check(data) ? "✓\n" : "ERROR\n");
		
		data = Arrays.copyOf(data1, data1.length); // reset Array
		// MergeSort
		System.out.print("MergeSort:              ");
		long start7 = System.currentTimeMillis();
		new MergeSort<Integer>().sort(data, false);
		System.out.print("time needed: " + (System.currentTimeMillis() - start7) + "ms ");
		System.out.print(check(data) ? "✓\n" : "ERROR\n");
		
		data = Arrays.copyOf(data1, data1.length); // reset Array
		// HeapSort
		System.out.print("HeapSort:               ");
		long start8 = System.currentTimeMillis();
		new HeapSort<Integer>().sort(data, false);
		System.out.print("time needed: " + (System.currentTimeMillis() - start8) + "ms ");
		System.out.print(check(data) ? "✓\n" : "ERROR\n");
		
	}
}

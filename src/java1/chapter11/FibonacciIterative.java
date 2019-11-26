package java1.chapter11;
public class FibonacciIterative {
    public static long fibonacci(int n) {
    	// array for fibonacci calculation (n is biggest summand)
    	long[] fib = new long[n + 1];
    	// add up values in for-loop
    	for (int i = 1; i < fib.length; i++) {
    		// next bigger fibonacci is always the last one + the next summand
			fib[i] = i + fib[i - 1];
		}
    	// for testing
//    	System.out.println(java.util.Arrays.toString(fib));
    	return fib[fib.length - 1];
    }

    public static void main(String[] args) {
    	// test output
    	System.out.println("Fibonacci-Zahl von 0: " + fibonacci(0));
    	System.out.println("Fibonacci-Zahl von 1: " + fibonacci(1));
    	System.out.println("Fibonacci-Zahl von 3: " + fibonacci(3));
    	System.out.println("Fibonacci-Zahl von 90: " + fibonacci(90));
    	System.out.println("Fibonacci-Zahl von 92: " + fibonacci(92));
    }
}
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
    
    private static long[] fibRecursive = new long[100];
    
    public static long fibonacciRecursive(int n) {
    	// abortion condition1
    	if (n == 1) {
    		fibRecursive[n] = 1;
    	// abortion condition 2
		} else if (n == 0) {
			fibRecursive[n] = 0;
		// add up numbers in the array
		} else {
	        fibRecursive[n] = n + fibonacciRecursive(n - 1);
		}
    	return fibRecursive[n];
    }

    public static void main(String[] args) {
    	// test output
    	System.out.println("Fibonacci-Zahl von 0: " + fibonacci(0));
    	System.out.println("Fibonacci-Zahl von 1: " + fibonacci(1));
    	System.out.println("Fibonacci-Zahl von 3: " + fibonacci(3));
    	System.out.println("Fibonacci-Zahl von 90: " + fibonacci(90));
    	System.out.println("Fibonacci-Zahl von 92: " + fibonacci(92));

    	// test output for recursive calculation
    	System.out.println("Fibonacci-Zahl von 0: " + fibonacciRecursive(0) + " (rekursiv)");
    	System.out.println("Fibonacci-Zahl von 1: " + fibonacciRecursive(1) + " (rekursiv)");
    	System.out.println("Fibonacci-Zahl von 3: " + fibonacciRecursive(3) + " (rekursiv)");
    	System.out.println("Fibonacci-Zahl von 90: " + fibonacciRecursive(90) + " (rekursiv)");
    	System.out.println("Fibonacci-Zahl von 92: " + fibonacciRecursive(92) + " (rekursiv)");
    	
    	if (fibonacci(0) == fibonacciRecursive(0) & 
    		fibonacci(1) == fibonacciRecursive(1) & 
    		fibonacci(3) == fibonacciRecursive(3) & 
    		fibonacci(90) == fibonacciRecursive(90) &
    		fibonacci(92) == fibonacciRecursive(92)) {
			System.out.println("Entweder geht alles oder beides ist gleich falsch.");
		} else {
			System.out.println("Irgendwas läuft hier gehörig falsch.");
		}
    }
}
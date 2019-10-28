package java1.chapter5;

public class FibonacciTest {
	public static long fibonacci(int n) {
	    if (n <= 1) {                               // Abbruchbedingung
	        return n;
	    }
	    return fibonacci(n-1) + fibonacci(n-2);     // rekursive Aufrufe
	}
	
	public static void main(String[] args) {
		double startzeit = System.currentTimeMillis();
		System.out.println(fibonacci(50));
		double endzeit = System.currentTimeMillis();
		System.out.println((endzeit - startzeit) / 1000);
	}

}

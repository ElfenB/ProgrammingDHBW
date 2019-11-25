package java1.chapter11;
import java.util.Scanner;

public class PrimeNumbers {

    /**
     * Generiert die ersten <code>size</code> Primzahlen und gibt sie
     * aufsteigend sortiert als Feld zurück.
     * 
     * @param size Anzahl der zu generierenden Primzahlen
     * @return Feld der Größe <code>size</code> mit den ersten Primzahlen
     */
    public static int[] generatePrimes(int size) {
    	int[] primeNumbers = new int[size];
    	int groesse = 0;
    	int i = 0;
    	while (groesse < size) {
    		if (java1.chapter06.Calculator.isPrim(i)) {
    			primeNumbers[groesse++] = i;
    		}
    		i++;
    	}
        return primeNumbers;
    }

    /**
     * Gibt das angegebene <code>int</code>-Feld auf der Konsole aus.
     * 
     * @param values
     */
    public static void print(int[] values) {
        System.out.println(java.util.Arrays.toString(values));
    }

    public static void main(String[] args) {
        System.out.print("Wie viele Primzahlen sollen generiert werden? ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.close();
        int[] primes = generatePrimes(size);
        System.out.print("Ergebnis:");
        print(primes);
    }
}
package java1.chapter11;
public class VarArgCalculator {

    // TODO Methoden sum und product
	
	private static double sum(double... summands) {
		// starting point for adding up the values
		double sum = 0.0;
		// adds up the given factors
	    for (double summand : summands) {
	        sum += summand;
	    }
	    return sum;
	}
	
	private static double product(double... factors) {
		// starting point has to be 1 for products
		double product = 1.0;
		// multiplies the given factors
		for (double factor : factors) {
			product *= factor;
		}
		return product;
	}
	
    private static void testEquality(double expected, double actual) {
        System.out.print(expected == actual ? " ok" : " ERROR");
    }

    public static void main(String[] args) {
        System.out.print("Summe:");
        testEquality(0, sum());
        testEquality(0, sum(0));
        testEquality(1, sum(1));
        testEquality(3, sum(1, 2));
        testEquality(6, sum(1, 2, 3));
        System.out.println();

        System.out.print("Produkt:");
        testEquality(1, product());
        testEquality(0, product(0));
        testEquality(1, product(1));
        testEquality(2, product(1, 2));
        testEquality(6, product(1, 2, 3));
        System.out.println();
    }
}
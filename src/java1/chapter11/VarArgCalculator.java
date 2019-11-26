package java1.chapter11;

/**
 * @author Benjamin Elfen
 *
 */
public class VarArgCalculator {

	/** sums up given numbers */
	private static double sum(double... summands) {
		// starting point for adding up the values
		double sum = 0.0;
		// adds up the given factors
	    for (double summand : summands) {
	        sum += summand;
	    }
	    return sum;
	}
	
	/** sums up given numbers */
	private static double invertedSum(double... summands) {
		// starting point for adding up the values
		double sum = 0.0;
		// adds up the given factors
		for (double summand : summands) {
			sum += 1 / summand;
		}
		return sum;
	}
	
	/** multiplies given numbers */
	private static double product(double... factors) {
		// starting point has to be 1 for products
		double product = 1.0;
		// multiplies the given factors
		for (double factor : factors) {
			product *= factor;
		}
		return product;
	}
	
	/** returns minimum of given numbers */
	private static double min(double... mins) {
		// in case no value is passed into the array mins the value becomes positive infinity
		if (mins.length < 1) {
			return Double.POSITIVE_INFINITY;
		}
		// give a starting value
		Double currentMin = mins[0];
		for (double min : mins) {
			if (min < currentMin) {
				currentMin = min;
			}
		}
		return currentMin;
	}
	
	/** returns minimum of given numbers */
	private static double max(double... maxs) {
		// in case no value is passed into the array mins the value becomes negative infinity
		if (maxs.length < 1) {
			return Double.NEGATIVE_INFINITY;
		}
		// give a starting value
		Double currentMax = maxs[0];
		for (double max : maxs) {
			if (max > currentMax) {
				currentMax = max;
			}
		}
		return currentMax;
	}
	
	/** returns arithmetic Mean of given numbers */
	private static double arithmeticMean(double... arithmetics) {
		return sum(arithmetics) / arithmetics.length;
	}
	
	/** returns geometric Mean of given numbers */
	private static double geometricMean(double... geometrics) {
		return Math.pow(product(geometrics), (1.0 / geometrics.length));
	}
	
	/** returns harmonic Mean of given numbers */
	private static double harmonicMean(double... harmonics) {
		return harmonics.length / invertedSum(harmonics);
	}
	
	/** for testing purposes */
	private static void testEquality(double expected, double actual) {
        if (Double.isNaN(expected)) {
            System.out.print(Double.isNaN(actual) ? " ok" : " ERROR");
        } else {
            System.out.print(expected == actual ? " ok" : " ERROR");
        }
    }

    /**
     * @param args not used
     */
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
        
        System.out.print("Minimum:");
        testEquality(Double.POSITIVE_INFINITY, min());
        testEquality(0, min(0));
        testEquality(1, min(1));
        testEquality(-1, min(-1, 2));
        testEquality(-3, min(-1, -2, -3));
        System.out.println();

        System.out.print("Maximum:");
        testEquality(Double.NEGATIVE_INFINITY, max());
        testEquality(0, max(0));
        testEquality(1, max(1));
        testEquality(1, max(1, -2));
        testEquality(3, max(1, 2, 3));
        System.out.println();
        
        System.out.print("Arithmetisches Mittel:");
        testEquality(Double.NaN, arithmeticMean());
        testEquality(0, arithmeticMean(0));
        testEquality(1, arithmeticMean(1));
        testEquality(1.5, arithmeticMean(1, 2));
        testEquality(2, arithmeticMean(1, 2, 3));
        System.out.println();

        System.out.print("Geometrisches Mittel:");
        testEquality(Double.NaN, geometricMean());
        testEquality(0, geometricMean(0));
        testEquality(1, geometricMean(1));
        testEquality(Math.sqrt(2), geometricMean(1, 2));
        testEquality(Math.pow(6, 1.0 / 3), geometricMean(1, 2, 3));
        System.out.println();

        System.out.print("Harmonisches Mittel:");
        testEquality(Double.NaN, harmonicMean());
        testEquality(1, harmonicMean(1));
        testEquality(4.0 / 3, harmonicMean(1, 2));
        testEquality(18.0 / 11, harmonicMean(1, 2, 3));
        System.out.println();
    }
}
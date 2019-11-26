package java1.chapter11;

/**
 * @author Benjamin Elfen
 *
 * This class can handle matrix calculation. It is particular designed to calculate 3x3 matrixes
 *
 */
public class MatrixCalculation {
	
	/**
	 * @param first first matrix
	 * @param second second matrix
	 * @return true if first and second matrix have the same dimensions (e.g. 3x3)'
	 * 
	 */
	private static boolean sameDimensions(double[][] first, double[][] second) {
		// runs over first dimension of the matrix and checks if lengths are the same
		for (int i = 0; i < first.length; i++) {
			// if lengths should be different return false
			if (first[i].length != second[i].length) {
				return false;
			}
		}
		// check length of overall matrix
		if (first.length == second.length) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * @param first first matrix
	 * @param second second matrix
	 * @return result double matrix with summed up 1st and 2nd input matrix
	 */
	public static double[][] sum(double[][] first, double[][] second) {
		// check if they have both the same dimensions (e.g. 3x3)
		if (sameDimensions(first, second)) {
			double[][] result = new double[first.length][first[1].length];
			// two for loops to run over all numbers in the matrix
			for (int i = 0; i < first.length; i++) {
				for (int j = 0; j < first.length; j++) {
					// add up the numbers
					result[i][j] = first[i][j] + second[i][j];
				}
			} 
			return result;
		}
		// this is the not save return value if the matrixes do not have the same dimensions
		return new double[0][0];
	}
	
	/**
	 * @param first first matrix
	 * @param scalar scalar double for multiplying
	 * @return result
	 */
	public static double[][] product(double[][] first, double scalar) {
		double[][] result = new double[first.length][first[1].length];
		// run over all numbers in the matrix and multiply with the given scalar
		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < first.length; j++) {
				result[i][j] = first[i][j] * scalar;
			}
		}
		return result;
	}
	
	/**
	 * @param output matrix for printing in console
	 */
	public static void print3(double[][] output) {
		for (int i = 0; i < output.length; i++) {
			// prints out matrix
			System.out.println("( " + output[0][i] + " | " + output[1][0] + " | " + output[2][i] + " )");
		}
		// empty line after the printed result
		System.out.println();
	}
	
	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		// testing
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];
		a[2][0] = 3;
		a[0][0] = 0.5;
		a[1][1] = 2;
		a[0][2] = 1;
		b[0][2] = 4;
		b[2][1] = 1;
		
		print3(sum(a, b));
		print3(a);
		print3(product(a, 2));
	}
}

package java1.chapter11;
public class VectorCalculator {

	/** returns true if vectors have the same dimensions */
	private static boolean sameDimensions(double[] first, double[] second) {
		if (first.length == second.length) {
			return true;
		}
		return false;
	}
	
    /**
     * Berechnet die Summe zweier Vektoren.
     * 
     * @param first
     * @param second
     * @return Vektorsumme
     */
    public static double[] sum(double[] first, double[] second) {
    	if (sameDimensions(first, second)) {
    		double[] result = new double[first.length];
			for (int i = 0; i < first.length; i++) {
				result[i] = first[i] + second[i];
			}
			return result;
		}
    	return new double[0];
    }

    /**
     * Berechnet das Produkt aus einem Skalar und einem Vektor.
     * 
     * @param scalar
     * @param vector
     * @return Produkt
     */
    public static double[] product(double scalar, double[] vector) {
    	double[] result = new double[vector.length];
    	for (int i = 0; i < vector.length; i++) {
			result[i] = scalar * vector[i];
		}
    	return result;
    }

    /**
     * Berechnet das Skalarprodukt zweier Vektoren.
     * 
     * @param first
     * @param second
     * @return Skalarprodukt
     */
    public static double scalarProduct(double[] first, double[] second) {
        if (sameDimensions(first, second)) {
        	double result = 0.0;
			for (int i = 0; i < first.length; i++) {
				result += first[i] * second[i];
			}
			return result;
		}
        return 0.0;
    }

    /**
     * Berechnet den Betrag eines Vektors.
     * 
     * @param vector
     * @return Vektorbetrag
     */
    public static double magnitude(double[] vector) {
    	double preResult = 0.0;
        for (int i = 0; i < vector.length; i++) {
			preResult += vector[i];
		}
        if (preResult > 0) {
        	return Math.sqrt(preResult);
		}
        return 0.0;
    }

    /**
     * Gibt den Vektor in der Konsole aus.
     * 
     * @param vector
     */
    public static void print(double[] vector) {
    	System.out.print("( ");
        for (int index = 0; index < vector.length; index++) {
            System.out.print(vector[index] + " ");
        }
        System.out.print(")");
        System.out.println();
    }

    public static void main(String[] args) {
        double[] a = {1, 2, 3};
        double[] b = {4, 5, 6};
        double[] c = {4, 5};
        print(sum(a, b));
        print(product(2, a));
        System.out.println(scalarProduct(a, b));
        System.out.println(magnitude(a));
        System.out.println(sameDimensions(a, b));
        System.out.println(sameDimensions(a, c));
        print(sum(a, c));
        print(product(3, c));
        System.out.println(scalarProduct(a, c));
    }
}
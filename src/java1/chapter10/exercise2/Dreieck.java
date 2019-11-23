/**
 * 
 */
package java1.chapter10.exercise2;

/**
 * @author Benjamin Elfen
 *
 */
public class Dreieck extends GeometrischeFigur {
	protected double seiteA;
	protected double seiteB;
	protected double seiteC;
	
	public Dreieck(double seiteA, double seiteB, double seiteC) {
		this.seiteA = seiteA;
		this.seiteB = seiteB;
		this.seiteC = seiteC;
	}

	@Override
	public double getFlaeche() {
		double s = (seiteA + seiteB + seiteC) / 2;
		return Math.sqrt(s * (s - seiteA) * (s - seiteB) * (s - seiteC));
	}

	@Override
	public double getUmfang() {
		return seiteA + seiteB + seiteC;
	}

	@Override
	public String getBeschreibung() {
		return "Dreieck (Seitenlängen: " + seiteA + ", " + seiteB + ", " + seiteC + ")";
	}
}

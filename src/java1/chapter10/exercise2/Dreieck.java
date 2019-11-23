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
		return (seiteA * seiteB) / 2;
	}

	@Override
	public double getUmfang() {
		return seiteA + seiteB + seiteC;
	}

	@Override
	public String getBeschreibung() {
		if (seiteA == seiteB & seiteB == seiteC) {
			return "Gleichseitiges Dreieck (Seitenlänge: " + seiteA + ")";
		} else {
			return "Dreieck (Seitenlängen: " + seiteA + ", " + seiteB + ", " + seiteC + ")";
		}
	}
}

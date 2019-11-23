/**
 * 
 */
package java1.chapter10.exercise2;

/**
 * @author Benjamin Elfen
 *
 */
public class Rechteck extends GeometrischeFigur {
	protected double seiteA;
	protected double seiteB;
	
	public Rechteck(double seiteA, double seiteB) {
		this.seiteA = seiteA;
		this.seiteB = seiteB;
	}
	
	@Override
	public double getFlaeche() {
		return seiteA * seiteB;
	}

	@Override
	public double getUmfang() {
		return 2 * seiteA + 2 * seiteB;
	}

	@Override
	public String getBeschreibung() {
		return "Rechteck (Seitenlängen: " + seiteA + " und " + seiteB + ")";
	}
}

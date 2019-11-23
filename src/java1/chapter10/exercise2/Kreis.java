/**
 * 
 */
package java1.chapter10.exercise2;

/**
 * @author Benjamin Elfen
 *
 */
public class Kreis extends GeometrischeFigur {
	protected double radius;

	public Kreis(double radius) {
		this.radius = radius;
	}

	@Override
	public double getFlaeche() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double getUmfang() {
		return Math.PI * radius;
	}

	@Override
	public String getBeschreibung() {
		return "Kreis (Radius: " + radius + ")";
	}
}

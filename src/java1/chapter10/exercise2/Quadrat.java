/**
 * 
 */
package java1.chapter10.exercise2;

/**
 * @author Benjamin Elfen
 *
 */
public class Quadrat extends Rechteck {
	public Quadrat(double seitenlaenge) {
		super(seitenlaenge, seitenlaenge);
	}
	
	@Override
	public String getBeschreibung() {
		return "Quadrat (Seitenlänge: " + seiteA + ")";
	}
}

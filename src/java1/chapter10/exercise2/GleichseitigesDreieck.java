/**
 * 
 */
package java1.chapter10.exercise2;

/**
 * @author Benjamin Elfen
 *
 */
public class GleichseitigesDreieck extends Dreieck {
	public GleichseitigesDreieck(double seitenlaenge) {
		super(seitenlaenge, seitenlaenge, seitenlaenge);
	}
	
	@Override
	public String getBeschreibung() {
		return "Gleichseitiges Dreieck (Seitenlänge: " + seiteA + ")";
	}
}

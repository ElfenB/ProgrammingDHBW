/**
 * 
 */
package java1.chapter10.exercise1;

/**
 * @author Benjamin Elfen
 *
 */
public class Girokonto extends Konto {
	private final int STARTGUTHABEN = 50;
	private final double GUTHABENZINS = 0.005;
	private final double DISPOZINS = 7;
	
	// constructor
	Girokonto(long number) {
		super(number);
		this.einzahlen(STARTGUTHABEN);
	}
	
	public double getGUTHABENZINS() {
		return GUTHABENZINS;
	}
	
	public double getDISPOZINS() {
		return DISPOZINS;
	}
}

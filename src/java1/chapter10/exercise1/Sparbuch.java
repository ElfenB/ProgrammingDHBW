package java1.chapter10.exercise1;

/**
 * @author Benjamin Elfen
 *
 */
public class Sparbuch extends Konto {
	private final double GUTHABENZINS = 0.01;
	
	public Sparbuch(long nummer) {
		super(nummer);
	}
	
	/**
	 * checks if requested amount is higher than saldo (no negative saldo allowed)
	 */
	@Override
	public void auszahlen(double betrag) {
		if (betrag > 0 & this.getSaldo() >= betrag) {
			// must return to super class
            super.auszahlen(betrag);
        }
	}
	
	public double getGUTHABENZINS() {
		return GUTHABENZINS;
	}
}

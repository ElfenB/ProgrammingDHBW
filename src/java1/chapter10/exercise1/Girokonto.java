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
	
	// constructor
	Girokonto(long number) {
		super(number);
		this.einzahlen(STARTGUTHABEN);
	}
}

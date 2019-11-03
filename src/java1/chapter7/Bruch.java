package java1.chapter7;

/**
 * @author Benjamin Elfen
 * 
 * This class helps calculating with fractions
 * <br />
 * <img height="80%" src="http://yuml.me/diagram/scruffy/class/[;Bruch%7C+zaehler:%20long;+nenner:%20long%7C+Bruch(zaehler:%20long%E2%80%9A%20nenner:%20long);+negiere():%20Bruch;+addiere(summand:%20Bruch):%20Bruch;+subtrahiere(subtrahend:%20Bruch):%20Bruch;+kehrwert():%20Bruch;+multipliziere(faktor:%20Bruch):%20Bruch;+dividiere(divisor:%20Bruch):%20Bruch;+potenziere(exponent:%20int):%20Bruch;+istGleich(bruch:%20Bruch):%20boolean;+toDouble():%20double;+toString():%20String]">
 *
 */
public class Bruch {
	// final longs for every fraction
	public final long zaehler;
	public final long nenner;
	
	// constructor
	public Bruch(long zaehler, long nenner) {
		// assign given values to final longs
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	
	
	
}

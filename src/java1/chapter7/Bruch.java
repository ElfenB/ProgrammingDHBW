package java1.chapter7;
import java1.chapter6.Calculator;

/**
 * @author Benjamin Elfen
 * 
 * This class helps calculating with fractions
 * <br />
 * <img src="http://yuml.me/diagram/scruffy/class/[;Bruch%7C+zaehler:%20long;+nenner:%20long%7C+Bruch(zaehler:%20long%E2%80%9A%20nenner:%20long);+negiere():%20Bruch;+addiere(summand:%20Bruch):%20Bruch;+subtrahiere(subtrahend:%20Bruch):%20Bruch;+kehrwert():%20Bruch;+multipliziere(faktor:%20Bruch):%20Bruch;+dividiere(divisor:%20Bruch):%20Bruch;+potenziere(exponent:%20int):%20Bruch;+istGleich(bruch:%20Bruch):%20boolean;+toDouble():%20double;+toString():%20String]">
 *
 */
public class Bruch {
	// final longs for every fraction
	public final long zaehler;
	public final long nenner;
	
	// constructor
	/**
	 * @param zaehler is the value of the upper part of a fraction
	 * @param nenner is the value of the lower part of a fraction
	 */
	public Bruch(long zaehler, long nenner) {
		// assign given values to final longs
		if (nenner < 0) {
			zaehler *= -1;
			nenner *= -1;
		}
		// TODO takes way too long
		int ggTFraction = Calculator.ggT(Math.abs((int) zaehler), Math.abs((int) nenner));
		zaehler /= ggTFraction;
		nenner /= ggTFraction;
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	
	// can invert the fraction (multiply with -1)
	public Bruch negiere() {
		Bruch output = new Bruch(zaehler * -1, nenner);
		return output;
	}
	
	// can give out the value of the fraction (format: zaehler/nenner ; example: 1/2)
	public String toString() {
		return (zaehler + "/" + nenner);
	}
	
	public Bruch addiere(Bruch input) {
		return new Bruch(zaehler * input.nenner + input.zaehler * nenner, nenner * input.nenner);
	}
}

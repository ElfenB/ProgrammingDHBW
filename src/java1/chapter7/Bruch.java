package java1.chapter7;
import java1.chapter6.Calculator;

/**
 * @author Benjamin Elfen
 * 
 * This class helps calculating with fractions
 * <br />
 * <img height="100%" src="http://yuml.me/diagram/scruffy/class/[;Bruch%7C+zaehler:%20long;+nenner:%20long%7C+Bruch(zaehler:%20long%E2%80%9A%20nenner:%20long);+negiere():%20Bruch;+addiere(summand:%20Bruch):%20Bruch;+subtrahiere(subtrahend:%20Bruch):%20Bruch;+kehrwert():%20Bruch;+multipliziere(faktor:%20Bruch):%20Bruch;+dividiere(divisor:%20Bruch):%20Bruch;+potenziere(exponent:%20int):%20Bruch;+istGleich(bruch:%20Bruch):%20boolean;+toDouble():%20double;+toString():%20String]">
 *
 */
public class Bruch {
	// final longs for every fraction
	public final long zaehler;
	public final long nenner;
	
	/**
	 * @param zaehler is the value of the upper part of a fraction
	 * @param nenner is the value of the lower part of a fraction
	 * 
	 * This is the constructor
	 * Assigns values of numerator and denominator to final long variables
	 * Once set up, fraction cannot be changed again
	 * 
	 */
	public Bruch(long zaehler, long nenner) {
		// brings the negation into the nominator (top)
		if (nenner < 0) {
			zaehler *= -1;
			nenner *= -1;
		}
		// uses ggT (gcd) out of the calculator class from chapter6
		// TODO perhaps useful to kill connection to calculator class if class gets delivered
		int ggTFraction = Calculator.ggT(Math.abs((int) zaehler), Math.abs((int) nenner));
		// cancels (kürzen) the fraction with its given ggT (gcd) divisor
		zaehler /= ggTFraction;
		nenner /= ggTFraction;
		// assign given values to final longs
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
	
	// gives back double value of the fraction
	public double toDouble() {
		return (double) zaehler / nenner;
	}
	
	// adds one fraction to another
	public Bruch addiere(Bruch input) {
		return new Bruch(zaehler * input.nenner + input.zaehler * nenner, nenner * input.nenner);
	}
	
	// substracts one fraction from another
	public Bruch substrahiere (Bruch input) {
		return new Bruch(zaehler * input.nenner - input.zaehler * nenner, nenner * input.nenner);
	}
	
	// changes nominator and denominator (top and bottom) of the fraction
	public Bruch kehrwert () {
		return new Bruch(nenner, zaehler);
	}
	
	// multiplies two fractions
	public Bruch multiplizieren(Bruch input) {
		return new Bruch(zaehler * input.zaehler, nenner * input.nenner);
	}
	
	// divides two fractions
	public Bruch dividieren(Bruch input) {
		return new Bruch(zaehler * input.nenner, nenner * input.zaehler);
	}
	
	// exponentiates a fraction with a exponent
	public Bruch potenzieren(int exponent) {
		// for negative exponents (otherwise takes too long)
		if (exponent < 0) {
			exponent *= -1;
			return new Bruch((long) Math.pow(nenner, exponent), (long) Math.pow(zaehler, exponent));
		} else {
			return new Bruch((long) Math.pow(zaehler, exponent), (long) Math.pow(nenner, exponent));
		}
	}
	
	// compares two fractions
	public boolean istGleich(Bruch input) {
		if (zaehler == input.zaehler & nenner == input.nenner) {
			return true;
		} else {
			return false;
		}
	}
}

package java1.chapter8;

/**
 * @author Benjamin Elfen
 * 
 * This class helps calculating with vectors
 *
 */
public class Vektor {
	// three final doubles for vector
	private final double x;
	private final double y;
	private final double z;
	
	// constructor
	public Vektor(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	// assign variables
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public double getZ() {
		return this.z;
	}
	
	// add another vector
	public Vektor addieren(Vektor input) {
		return new Vektor(this.getX() + input.getX(), this.getY() + input.getY(), this.getZ() + input.getZ());
	}
	
	// substract another vector
	public Vektor substrahieren(Vektor input) {
		return new Vektor(this.getX() - input.getX(), this.getY() - input.getY(), this.getZ() - input.getZ());
	}
	
	// multiply with another vector
	public Vektor multiplizieren(Vektor input) {
		return new Vektor(this.getX() * input.getX(), this.getY() * input.getY(), this.getZ() * input.getZ());
	}
	
	// divide with another vector
	public Vektor dividieren(Vektor input) {
		return new Vektor(this.getX() / input.getX(), this.getY() / input.getY(), this.getZ() / input.getZ());
	}
	
	// scalarproduct
	public double skalarProdukt(Vektor input) {
		return (this.getX() * input.getX() + this.getY() * input.getY() + this.getZ() * input.getZ());
	}
	
	@Override
	public String toString() {
		return this.getX() + "/" + this.getY() + "/" + this.getZ();
	}
}

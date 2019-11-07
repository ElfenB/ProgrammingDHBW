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
	
	public Vektor(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public double getZ() {
		return this.z;
	}
	
	public Vektor addieren(Vektor input) {
		return new Vektor(this.getX() + input.getX(), this.getY() + input.getY(), this.getZ() + input.getZ());
	}
	
	public Vektor substrahieren(Vektor input) {
		return new Vektor(this.getX() - input.getX(), this.getY() - input.getY(), this.getZ() - input.getZ());
	}
	
	public Vektor multiplizieren(Vektor input) {
		return new Vektor(this.getX() * input.getX(), this.getY() * input.getY(), this.getZ() * input.getZ());
	}
	
	public Vektor dividieren(Vektor input) {
		return new Vektor(this.getX() / input.getX(), this.getY() / input.getY(), this.getZ() / input.getZ());
	}
	
	public double skalarProdukt(Vektor input) {
		return (this.getX() * input.getX() + this.getY() * input.getY() + this.getZ() * input.getZ());
	}
	
	public String toString() {
		return this.getX() + "/" + this.getY() + "/" + this.getZ();
	}
	
	
	
}

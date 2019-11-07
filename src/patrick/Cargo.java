package patrick;

public class Cargo {
	
	private double volume, weight;
	private String name;
	
	/**
	 * Constructor for a new Cargo object
	 * @param name name of the object
	 * @param volume volume of the object
	 * @param weight weight of the object
	 */
	public Cargo(String name, double volume, double weight) {
		this.name = name;
		this.volume = volume;
		this.weight = weight;
	}
	
	public boolean equals(Cargo cargo) {
		if (this.name.equals(cargo.name) & this.volume == cargo.volume & this.weight == cargo.weight) {
			return true;
		}
		return false;
	}

	/**
	 * @return volume of the cargo
	 */
	public double getVolume() {
		return volume;
	}

	/**
	 * @return weight if the cargo
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @return name if the cargo
	 */
	public String getName() {
		return name;
	}
	
	public String toString() {
		return this.name + ": Gewicht " + this.weight + " Volumen " + this.volume;
	}
	
//	public void setVolumen(double volumen) {
//		this.volumen = volumen;
//	}
//	public void setGewicht(double gewicht) {
//		this.gewicht = gewicht;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
}

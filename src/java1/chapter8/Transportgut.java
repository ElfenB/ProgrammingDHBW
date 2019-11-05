package java1.chapter8;

public class Transportgut {
	private double weight;
	private double size;
	
	public Transportgut(double weight, double size) {
		this.weight = weight;
		this.size = size;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setWeight(double newWeight) {
		this.weight = newWeight;
	}
	
	public double getSize() {
		return this.size;
	}
	
	public void setSize(double newSize) {
		this.size = newSize;
	}
	
	public String toString() {
		return "Weight: " + this.getWeight() + ", Size: " + this.getSize();
	}
}

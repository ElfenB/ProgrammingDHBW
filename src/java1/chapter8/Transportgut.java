package java1.chapter8;

public class Transportgut {
	private int weight;
	private int size;
	
	public Transportgut(int weight, int size) {
		this.weight = weight;
		this.size = size;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public void setWeight(int newWeight) {
		this.weight = newWeight;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void setSize(int newSize) {
		this.size = newSize;
	}
}

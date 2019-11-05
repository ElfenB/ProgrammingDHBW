package java1.chapter8;

public class Container {
	
	// weight in kilograms
	public int weight;
	// size in liters
	public int size;
	public int ID;
	public static int numberOfContainers;
	
	public Container(int weight, int size) {
		this.size = size;
		this.weight = weight;
		numberOfContainers++;
		this.ID = numberOfContainers;
		
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void setSize(int newSize) {
		this.size = newSize;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public void setWeight(int newWeight) {
		this.weight = newWeight;
	}
}

package java1.chapter8;

public class Container {
	
	/** maxWeight in kilograms */
	private final int maxLoad;
	/** loaded amount in kilograms */
	private int load;
	/** size in liters */
	private final int space;
	/** occuped size in liters*/
	private int fullSpace;
	private int ID;
	private static int numberOfContainers;
	
	public Container(int load, int space) {
		this.space = space;
		this.maxLoad = load;
		numberOfContainers++;
		this.ID = numberOfContainers;
	}
	
	public int getSpace() {
		return this.space;
	}
	
	public int getFreeSpace() {
		return this.getSpace() - this.fullSpace;
	}
	
	public int getMaxLoad() {
		return this.maxLoad;
	}
	
	public int getLoad() {
		return this.load;
	}
	
	public int getFreeLoad() {
		return this.getMaxLoad() - this.getLoad();
	}
	
	public int getID() {
		return this.ID;
	}
	
	public static int getNumberOfContainers() {
		return numberOfContainers;
	}
	
	public String toString() {
		return "ID: " + this.getID() + ", MaxLoad: " + this.getMaxLoad() + ", FreeLoad: " + this.getFreeLoad() + ", Space: " + this.getSpace() + ", FreeSpace: " + this.getFreeSpace();
	}
	
	public boolean beladen(Transportgut newTransportgut) {
		if ((newTransportgut.getSize() <= this.getFreeSpace()) & (newTransportgut.getWeight() <= this.getFreeLoad())) {
			this.load += newTransportgut.getWeight();
			this.fullSpace += newTransportgut.getSize();
			return true;
		} else {
			return false;
		}
	}
	
}

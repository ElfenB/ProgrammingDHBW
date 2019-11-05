package java1.chapter8;

public class Container {
	
	/** maxWeight in kilograms */
	private final double maxLoad;
	/** loaded amount in kilograms */
	private double load;
	/** size in liters */
	private final double space;
	/** occuped size in liters*/
	private double fullSpace;
	private int ID;
	private static int numberOfContainers;
	private int numberOfTransportgüter;
	
	public Container(double load, double space) {
		this.space = space;
		this.maxLoad = load;
		numberOfContainers++;
		this.ID = numberOfContainers;
	}
	
	public double getSpace() {
		return this.space;
	}
	
	public double getFreeSpace() {
		return this.getSpace() - this.fullSpace;
	}
	
	public double getMaxLoad() {
		return this.maxLoad;
	}
	
	public double getLoad() {
		return this.load;
	}
	
	public double getFreeLoad() {
		return this.getMaxLoad() - this.getLoad();
	}
	
	public int getID() {
		return this.ID;
	}
	
	public static int getNumberOfContainers() {
		return numberOfContainers;
	}
	
	public int getNumberOfTransportgüter() {
		return this.numberOfTransportgüter;
	}
	
	public String toString() {
		return "ID: " + this.getID() + ", MaxLoad: " + this.getMaxLoad() + ", FreeLoad: " + this.getFreeLoad() + ", Space: " + this.getSpace() + ", FreeSpace: " + this.getFreeSpace();
	}
	
	public boolean beladen(Transportgut newTransportgut, boolean WithOutput) {
		if (WithOutput) {
			System.out.println(this.toString());
			System.out.println("Package: " + newTransportgut);
			this.beladen(newTransportgut, false);
			System.out.println(this.toString());
			return beladen(newTransportgut, false);
		} else {
			if ((newTransportgut.getSize() <= this.getFreeSpace()) & (newTransportgut.getWeight() <= this.getFreeLoad())) {
				this.load += newTransportgut.getWeight();
				this.fullSpace += newTransportgut.getSize();
				this.numberOfTransportgüter++;
				return true;
			} else {
//				throw new NullPointerException("demo");
				return false;
			}
		}
	}
	
}

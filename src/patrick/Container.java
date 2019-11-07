package patrick;

public class Container {

	/** liter */
	private final double maxVolume;
	/** kg */
	private final double maxLoad;
	private final long containerId;
	private static long containerCount = 0;
	private double load = 0.0;
    private double volumeLoad = 0.0;
    private Cargo[] contentList = new Cargo [20000];
    private int items = 0;
    
    // Fun variables
	private static String newline = System.getProperty("line.separator");
	
	/**
	 * Constructor with capacity of a standardized 20 feet container 
	 */
	public Container() {
		this.maxVolume = 38.44 * 1000;		
		this.maxLoad = 28480.0;
		this.containerId = ++containerCount;
	}
	
	/**
	 * Constructor for a container with variable capacity
	 * @param maxVolume maximal Volume the container should have
	 * @param maxLoad load limit of the container
	 */
	public Container(double maxVolume, double maxLoad) {
		this.maxVolume = maxVolume;
		this.maxLoad = maxLoad;
		this.containerId = ++containerCount;
	}
	
	/**
	 * Calculates the remaining load one can store in the container
	 * @return remaining load
	 */
	private double remainingLoad() {
		return (this.maxLoad - this.load);
	}
	
	/**
	 * Calculates the remaining volume one can store in the container
	 * @return remaining volume
	 */
	private double remainingVolume() {
		return (this.maxVolume - this.volumeLoad);
	}
	
	/**
	 * Loads cargo into a container
	 * @param cargo the cargo one wants to be loaded into the container
	 */
	public void load(Cargo cargo) {
		double weight = cargo.getWeight();
		double volume = cargo.getVolume();
		
		if (!cargoAlreadyLoaded(cargo)) {
			if ((weight <= remainingLoad()) && (volume <= remainingVolume())) {
				this.load += weight;
				this.volumeLoad += volume;
				this.contentList[this.items] = cargo;
				this.items++;
				System.out.println(cargo.getName() + " wurde in Container #" + this.containerId + " eingeladen."); 
			} else {
				System.out.println(cargo.getName() + " passt nicht mehr in Container #" + this.containerId + ".");
			}
		} else {
//			System.out.println(cargo.getName() + " ist schon im Container #" + this.containerId + ".");
			String image = 
					"     ,     ," + newline +
					"    (\\____/)" + newline +
					"     (_oo_)" + newline +
					"       (O) " + cargo.getName() + " ist schon im Container #" + this.containerId + "." + newline +
					"     __||__    \\)" + newline +
					"  []/______\\[] /" + newline +
					"  / \\______/ \\/" + newline +
					" /    /__\\" + newline +
					"(\\   /____\\" + newline;
			System.out.println(image);
		}
	}
	
	/**
	 * Unloads cargo from a container
	 * @param cargo the cargo one wants to be unloaded
	 */
	public void unload(Cargo cargo) {
		double weight = cargo.getWeight();
		double volume = cargo.getVolume();
		
		if (cargoAlreadyLoaded(cargo)) {			// check if the cargo to unload has been in there in the first place
			this.load -= weight;
			this.volumeLoad -= volume;
			removeCargoFromArray(cargo);
			System.out.println(cargo.getName() + " wurde aus Container #" + this.containerId + " ausgeladen.");
		} else {
//			System.out.println(cargo.getName() + " ist nicht (mehr) im Container");
			String image = 
					"     ,     ," + newline +
					"    (\\____/)" + newline +
					"     (_oo_)" + newline +
					"       (O) " + cargo.getName() + " ist nicht (mehr) im Container" + newline +
					"     __||__    \\)" + newline +
					"  []/______\\[] /" + newline +
					"  / \\______/ \\/" + newline +
					" /    /__\\" + newline +
					"(\\   /____\\" + newline;
			System.out.println(image);
		}
	}
	
	/**
	 * Checks, if an item is already in  a container
	 * @param cargo the cargo item which is compared to the list
	 * @return Is the given item in this container?
	 */
	private boolean cargoAlreadyLoaded(Cargo cargo) {
		boolean itemFound = false;
		for (int i = 0; i < contentList.length; i++) {
			if (contentList[i] != null) {			// check if the container is still empty
				if (contentList[i].equals(cargo)) {
					itemFound = true;
				}
			}
		}
		return itemFound;
	}
	
	/**
	 * Removes a cargo item from the content List
	 * @param cargo the cargo item which is to be removed from the list
	 */
	private void removeCargoFromArray(Cargo cargo) {
		for (int i = 0; i < contentList.length; i++) {
			if (contentList[i] != null) {			// check if the container is still empty
				if (contentList[i].equals(cargo)) {
					for (int k = i; k < contentList.length - 1; k++) {
						contentList[k] = contentList[k+1];	
					}
					contentList[contentList.length - 1] = null;
				}
			}
		}
	}
	
	public String getContentList() {
		String list = "<==== Inhaltsverzeichnis von Container #" + this.containerId + " ====>" +  newline;
		
		for (int i = 0; i < contentList.length; i++) {
			if (contentList[i] != null) {
				list += ("[" + (i+1) + "] -> " + contentList[i] + newline);
			}
		}
		list += newline + "> " + toString();
		list += newline + 
				"                             ___" + newline + 
				"                     /======/" + newline + 
				"            ____    //      \\___       ,/" + newline +
				"             | \\\\  //           :,   ./" + newline +
				"     |_______|__|_//            ;:; /" + newline +
				"    _L_____________\\o           ;;;/" + newline +
				"____(CCCCCCCCCCCCCC)____________-/_______________________" + newline;
		return list;
	}
	
	/**
	 * Outputs the current state of the container
	 */
	public String toString() {
		return "Der Container #" + this.containerId + " hat momentan " + this.load + "kg Ware auf " + this.volumeLoad + " Liter geladen.";
	}
}

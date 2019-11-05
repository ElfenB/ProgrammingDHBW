package java1.chapter8;

public class ContainerTestPlausibel {
	public static void main(String[] args) {
		/** maxWeight in kg */
		int containerZuladung40feet = 26480; 	// 40 feet container (26,48 tons)
		/** maxCapacity in liter */
		int containerGroesse = (int) (67.7 * 1000); 	// m³ in liter (dm³)
		
		Container Haushalt = new Container(containerZuladung40feet, containerGroesse);
		Transportgut Wandschrank = new Transportgut(200, 6.4);
		Transportgut BigToy = new Transportgut(28000, 80000);
		
//		Haushalt.beladen(Wandschrank, true);
//		System.out.println();
//		Haushalt.beladen(BigToy, true);
		
		int i = 0;
		while (Haushalt.beladen(Wandschrank, false)) {
			Haushalt.beladen(Wandschrank, true);
			i++;
		}
		System.out.println("Wandschränke geladen: " + i);
	}
	
	
}

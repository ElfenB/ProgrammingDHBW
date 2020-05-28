package java2.chapter19;

import java.util.*;

public class Lottery {

    /**
     * Liefert eine Menge der angegebenen Größe mit Zufallszahlen aus dem Bereich 1 bis 49.
     * 
     * @param size
     * @return Zufallszahlen
     */
    public static Set<Integer> draw(int size) {
    	SortedSet<Integer> outputSet = new TreeSet<>();		// sortiert Lotto Zahlen
//    	Set<Integer> outputSet = new HashSet<>();			// lässt sie unsortiert
    	
    	while (outputSet.size() < size) {			// solange die gewünschte Anzahl an Zahlen nicht erreicht ist wird eine weitere hinzugefügt
			outputSet.add(new java.util.Random().nextInt(49) + 1);
		}
    	
    	return outputSet;
    }

    
    public static void main(String[] args) {
        for (int size = 1; size < 10; size++) {
            System.out.println(size + " aus 49: " + draw(size));		// Zahlen ausgeben
        }
    }
}

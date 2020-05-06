/**
 * 
 */
package java2.chapter15;

import java.util.Arrays;

/**
 * @author Benjamin Elfen
 *
 */
public class HausVomNikolaus {

	private static int[] punkte = new int[5];
	private static int[] striche = new int[8];
	private static int cursor = 0;
	
	private static final int[][] wegenetz = new int[][] {
//		   0
//		   /\
//		  /  \
//		1 ———— 2
//		 | \/ |
//		 | /\ |
//		3 ———— 4
		
		{ 1, 2 }, // 0
		{ 0, 2, 3, 4 }, // 1 
		{ 0, 1, 3, 4 }, // 2
		{ 1, 2, 4 }, // 3
		{ 1, 2, 3 } // 4
	};
	
	private static final int[][] punkteToWege = new int[][] {
//		  0/\1
//		  /  \
//		 2———— 
//		3|4\/5|6 	// links oben nach rechts unten = 4
//		 | /\ |
//		  ————7
		// 0, 1, 2, 3, 4
		{ -1, 0, 1, -1, -1 }, // 0 	// der Weg von 0 nach 1 ist 0, der Weg von 0 nach 2 ist 1 (bezieht sich auf wegenetz)
		{ 0, -1, 2, 3, 4 },   // 1	// 1 -> 0 = 0, ...
		{ 1, 2, -1, 5, 6 },   // 2
		{ -1, 3, 5, -1, 7 },  // 3
		{ -1, 4, 6, 7, -1 }   // 4
	};
	
	private static void arraysZuruecksetzen() {
		for (int i = 0; i < punkte.length; i++) {
			punkte[i] = 0;
		}
		for (int i = 0; i < striche.length; i++) {
			striche[i] = 0;
		}
	}
	
	/**
	 * @param start der Startpunkt (z.B. unten links)
	 * @param verbose regelt die Ausgabe der Zwischenbauten und Variablenausgaben
	 */
	private static void zugMachen(int start, boolean verbose) {
		if (verbose) printOutHouse();
		
		// TODO Logik (es fehlt noch ein Zähler der Anzahl von Möglichkeiten)
		
		int target = wegenetz[start][cursor];
		
		if (striche[punkteToWege[start][target]] == 0) {
			if (verbose) System.out.println("start" + start + " target" + target + " " + punkteToWege[start][target] + "=0");
			striche[punkteToWege[start][target]]++;
			cursor = 0;
			zugMachen(target, verbose);
		} else if (striche[punkteToWege[start][target]] == 1) {
			if (ergebnisErreicht()) return;
			if (verbose) System.out.println("start" + start + " target" + target + " " + punkteToWege[start][target] + "=1");
			cursor++;
			zugMachen(start, verbose);
		}
		
		
	}
	
	/**
	 * @return sagt aus ob das Haus fertig gebaut ist
	 */
	private static boolean ergebnisErreicht() {
		for (int i = 0; i < striche.length; i++) {
			if (striche[i] == 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Well, it prints out the house - relying on striche[]
	 */
	private static void printOutHouse() {
		System.out.println(Arrays.toString(striche));
		String output = "";
		// Fährt über die Ausgabe linienweise, 6 ist hardcoded für 6 Linien (Höhe)
		for (int i = 0; i < 6; i++) {
			switch (i) {
			case 0: // Erste Linie der Ausgabe
				if (striche[0] == 1) {
					output += "  /";
				} else if (striche[0] == 0) {
					output += "   ";
				}
				if (striche[1] == 1) {
					output += "\\  ";
				} else if (striche[1] == 0) {
					output += "   ";
				}
				output += "\n"; // neue Zeile
				
				break;
			case 1:
				if (striche[0] == 1) {
					output += " / ";
				} else if (striche[0] == 0) {
					output += "   ";
				}
				if (striche[1] == 1) {
					output += " \\ ";
				} else if (striche[1] == 0) {
					output += "   ";
				}
				output += "\n"; // neue Zeile
				
				break;
			case 2:
				if (striche[2] == 1) {
					output += " ————";
				} else if (striche[2] == 0) {
					output += "   ";
				}
				output += "\n"; // neue Zeile
				
				break;
			case 3:
				if (striche[3] == 1) {
					output += "| ";
				} else if (striche[3] == 0) {
					output += "  ";
				}
				if (striche[4] == 1) {
					output += "\\";
				} else if (striche[4] == 0) {
					output += " ";
				}
				if (striche[5] == 1) {
					output += "/ ";
				} else if (striche[5] == 0) {
					output += "  ";
				}
				if (striche[6] == 1) {
					output += "|";
				} else if (striche[6] == 0) {
					output += " ";
				}
				output += "\n"; // neue Zeile
				
				break;
			case 4:
				if (striche[3] == 1) {
					output += "| ";
				} else if (striche[3] == 0) {
					output += "  ";
				}
				if (striche[5] == 1) {
					output += "/";
				} else if (striche[5] == 0) {
					output += " ";
				}
				if (striche[4] == 1) {
					output += "\\ ";
				} else if (striche[4] == 0) {
					output += "  ";
				}
				if (striche[6] == 1) {
					output += "|";
				} else if (striche[6] == 0) {
					output += " ";
				}
				output += "\n"; // neue Zeile
				
				break;
			case 5:
				if (striche[7] == 1) {
					output += " ————";
				} else if (striche[7] == 0) {
					output += "";
				}
				output += "\n"; // neue Zeile
				
				break;

			default:
				System.out.println("default");
				break;
			}
			
		}
		
		System.out.print(output);
		System.out.print("");
//		   4
//		   /\
//		  /  \
//		3 ———— 2
//		 | \/ |
//		 | /\ |
//		0 ———— 1  Nummerierung sind die Punktidentifier im Array (punkte[0] == unten links)
		// ACHTUNG: HIER WURDE DIE ALTE NUMMERIERUNG VERWENDET
		
		
	}
	
	
	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		arraysZuruecksetzen();
		
		// Startpunkt festlegen
		int startpunkt = 3;		// unten links
		
		
		zugMachen(startpunkt, true);
		
		
		
		
		
	}

}

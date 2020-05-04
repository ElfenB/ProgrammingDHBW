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
	private static int target = 0;
	
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
		{ 0, 1 }, // der Weg von 0 nach 1 ist 0, der Weg von 0 nach 2 ist 1 (bezieht sich auf wegenetz)
		{ 0, 2, 3, 4 }, // 1 -> 0 = 0, ...
		{ 1, 2, 5, 6 }, 
		{ 3, 5, 7 }, 
		{ 4, 6, 7 }
	};
	
	private static int startpunkt = 3;
	
	private static void arraysZuruecksetzen() {
		for (int i = 0; i < punkte.length; i++) {
			punkte[i] = 0;
		}
		for (int i = 0; i < striche.length; i++) {
			striche[i] = 0;
		}
	}
	
	private static void zugMachen(int start, boolean verbose) {
		if (verbose) {
			printOutHouse();
		}
		
		// TODO Logik
		if (striche[punkteToWege[start][target]] < 1) {
			striche[punkteToWege[start][target]]++;
			
		}
		zugMachen(target, verbose);
		
//		for (int i = 0; i < wegenetz[start].length; i++) {
//			if (striche[punkteToWege[start][i]] < 1) {
//				striche[i]++;
//				target = i++;
//			}
//		}
		
		
	}
	
	private static boolean ergebnisErreicht() {
		
		for (int i = 0; i < striche.length; i++) {
			if (striche[i] == 0) {
				return false;
//			} else if (striche[i] > 1) {
//				throw new IllegalArgumentException("Der Strich wurde schon besucht");
			}
		}
		
		return true;
	}
	
	private static void printOutHouse() {
		System.out.println(Arrays.toString(striche));
		String output = "";
		// Fährt über die Ausgabe linienweise 6 ist hardcoded für 6 Linien
		for (int i = 0; i < 6; i++) {
			switch (i) {
			case 0: // Erste Linie der Ausgabe
				if (striche[1] == 1) {
					output += "  /";
				} else if (striche[1] == 0) {
					output += "   ";
				}
				if (striche[2] == 1) {
					output += "\\  ";
				} else if (striche[2] == 0) {
					output += "   ";
				}
				output += "\n"; // neue Zeile
				
				break;
			case 1:
				if (striche[1] == 1) {
					output += " / ";
				} else if (striche[1] == 0) {
					output += "   ";
				}
				if (striche[2] == 1) {
					output += " \\ ";
				} else if (striche[2] == 0) {
					output += "   ";
				}
				output += "\n"; // neue Zeile
				
				break;
			case 2:
				if (striche[6] == 1) {
					output += " ————";
				} else if (striche[1] == 0) {
					output += "   ";
				}
				output += "\n"; // neue Zeile
				
				break;
			case 3:
				if (striche[0] == 1) {
					output += "| ";
				} else if (striche[1] == 0) {
					output += "  ";
				}
				if (striche[7] == 1) {
					output += "\\";
				} else if (striche[2] == 0) {
					output += " ";
				}
				if (striche[5] == 1) {
					output += "/ ";
				} else if (striche[2] == 0) {
					output += "  ";
				}
				if (striche[3] == 1) {
					output += "|";
				} else if (striche[2] == 0) {
					output += " ";
				}
				output += "\n"; // neue Zeile
				
				break;
			case 4:
				if (striche[0] == 1) {
					output += "| ";
				} else if (striche[1] == 0) {
					output += "  ";
				}
				if (striche[7] == 1) {
					output += "/";
				} else if (striche[2] == 0) {
					output += " ";
				}
				if (striche[5] == 1) {
					output += "\\ ";
				} else if (striche[2] == 0) {
					output += "  ";
				}
				if (striche[3] == 1) {
					output += "|";
				} else if (striche[2] == 0) {
					output += " ";
				}
				output += "\n"; // neue Zeile
				
				break;
			case 5:
				if (striche[4] == 1) {
					output += " ————";
				} else if (striche[2] == 0) {
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
		startpunkt = 3;		// unten links
		
//		   0
//		   /\
//		  /  \
//		1 ———— 2
//		 | \/ |
//		 | /\ |
//		3 ———— 4
		
		
		zugMachen(startpunkt, true);
		
		printOutHouse();
		
		for (int i = 0; i < wegenetz.length; i++) {
			System.out.println(Arrays.toString(wegenetz[i]));
		}
		
		
		
		
		
		
	}

}

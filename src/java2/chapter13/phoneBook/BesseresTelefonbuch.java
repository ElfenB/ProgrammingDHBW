/**
 * 
 */
package java2.chapter13.phoneBook;

import java.util.Arrays;

/**
 * @author Benjamin Elfen
 * 
 * This is V1.1 of the Telefonbuch class (demonstration of binary search)
 *
 */
public class BesseresTelefonbuch {
	private int entries = 0;
	private Telefonbucheintrag[] BesseresTelefonbuch = new Telefonbucheintrag[100];
		
	//adds new entries to phone book
	public String add(Telefonbucheintrag eintrag) {
		
		// TODO add methode schreiben
//		if (entries == BesseresTelefonbuch.length) {
//            throw new IllegalStateException("Telefonbuch ist schon voll.");
//        }
//		
//		int i = 0;
//		while (eintrag.getName().compareTo(BesseresTelefonbuch[i].getName()) == -1) {
//			i++;
//		}
//		if (eintrag.getName().compareTo(BesseresTelefonbuch[i].getName()) == 0) {
//			return "Eintrag schon vorhanden";
//		}
//		if (eintrag.getName().compareTo(BesseresTelefonbuch[i].getName()) == 1) {
//			int j = i;
//			while (BesseresTelefonbuch[j].getName() != null & j != BesseresTelefonbuch.length) {
//				BesseresTelefonbuch[j + 1] = BesseresTelefonbuch[j];
//				j++;
//			}
//		}
//		
//		BesseresTelefonbuch[entries++] = eintrag;
//		return "Eintragung erfolgreich";
		
	}
	
	// gives ability to perform a linear search
	public Telefonbucheintrag search(String name) {
		for (int i = 0; i < this.getNumberOfEntries() - 1; i++) {
			if (BesseresTelefonbuch[i].getName() == name) {
				return BesseresTelefonbuch[i];
			}
		}
		return new Telefonbucheintrag(name, "nicht im Telefonbuch gefunden");
	}
	
	public int getNumberOfEntries() {
		return entries;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(this.BesseresTelefonbuch);
	}
}

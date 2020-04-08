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
	public void add(Telefonbucheintrag eintrag) {
		
		// TODO add methode schreiben
		if (entries == BesseresTelefonbuch.length) {
            throw new IllegalStateException("Telefonbuch ist schon voll.");
        }
		if (BesseresTelefonbuch[0] == null) {
			BesseresTelefonbuch[0] = eintrag;
			System.out.println("null");
//			break;
		}
		
		int i = 0;
		while (i < entries + 1) {
			if (eintrag.getName().compareTo(BesseresTelefonbuch[i].getName()) <= -1) {
				System.out.println("-1");
				for (int j = entries + 1; j > i; j--) {
					BesseresTelefonbuch[j] = BesseresTelefonbuch[j - 1];
				}
				BesseresTelefonbuch[i] = eintrag;
//				i = entries + 1;
				break;
			} else if (eintrag.getName().compareTo(BesseresTelefonbuch[i].getName()) == 0) {
				System.out.println("0");
//				throw new IllegalStateException("Eintrag schon vorhanden.");
//				i = entries + 1;
				break;
			} else if (eintrag.getName().compareTo(BesseresTelefonbuch[i].getName()) >= 1) {
				System.out.println("1");
				BesseresTelefonbuch[++entries] = eintrag;
//				i = entries + 1;
				break;
			}
				
			i++;
		}
		
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

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
		if (entries == BesseresTelefonbuch.length) {
            throw new IllegalStateException("Telefonbuch ist schon voll.");
        }
		BesseresTelefonbuch[entries++] = eintrag;
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

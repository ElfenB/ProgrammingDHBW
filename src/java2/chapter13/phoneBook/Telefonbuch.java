package java2.chapter13.phoneBook;

import java.util.Arrays;

/**
 * @author Benjamin Elfen
 * 
 * This Phone Book V1.0 can handle simple entries that can be searched linear (demonstration of linear search)
 *
 */
public class Telefonbuch {
	private int entries = 0;
	private Telefonbucheintrag[] Telefonbuch = new Telefonbucheintrag[100];
		
	//adds new entries to phone book
	public void add(Telefonbucheintrag eintrag) {
		if (entries == Telefonbuch.length) {
            throw new IllegalStateException("Telefonbuch ist schon voll.");
        }
		Telefonbuch[entries++] = eintrag;
	}
	
	// gives ability to perform a linear search
	public Telefonbucheintrag search(String name) {
		for (int i = 0; i < this.getNumberOfEntries() - 1; i++) {
			if (Telefonbuch[i].getName() == name) {
				return Telefonbuch[i];
			}
		}
		return new Telefonbucheintrag(name, "nicht im Telefonbuch gefunden");
	}
	
	public int getNumberOfEntries() {
		return entries;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(this.Telefonbuch);
	}
	
}

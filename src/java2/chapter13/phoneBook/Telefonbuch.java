package java2.chapter13.phoneBook;

/**
 * @author Benjamin Elfen
 *
 */
public class Telefonbuch {
	private int entries = 0;
	private Telefonbucheintrag[] Telefonbuch = new Telefonbucheintrag[100];
	
	public void add(Telefonbucheintrag eintrag) {
		if (entries == Telefonbuch.length) {
            throw new IllegalStateException("Telefonbuch ist schon voll.");
        }
		Telefonbuch[entries++] = eintrag;
	}
	
	public Telefonbucheintrag search(String name) {
		for (int i = 0; i < Telefonbuch.length; i++) {
			if (Telefonbuch[i].getName() == name) {
				return Telefonbuch[i];
			}
		}
		return new Telefonbucheintrag(name, " nicht im Telefonbuch gefunden");
	}
	
	public int getNumberOfEntries() {
		return entries;
	}
	
}

/**
 * 
 */
package java2.chapter13.phoneBook;

/**
 * @author Benjamin Elfen
 *
 * This Class is the base for creating entries to a phone book
 *
 */
public class Telefonbucheintrag {
	private String Name;
	private String Telefonnummer;
	
	// public Constructor
	public Telefonbucheintrag (String Name, String Telefonnummer) {
		this.Name = Name;
		this.Telefonnummer = Telefonnummer;
	}
	
	// Getter & Setter
	public String getName() {
		return this.Name;
	}
	public String getTelefonnummer() {
		return this.Telefonnummer;
	}
	public void setName(String NewName) {
		this.Name = NewName;
	}
	public void setTelefonnummer(String NewTelefonnummer) {
		this.Telefonnummer = NewTelefonnummer;
	}
	
	@Override
	public String toString() {
		return this.Name + ": " + this.Telefonnummer;
	}

}

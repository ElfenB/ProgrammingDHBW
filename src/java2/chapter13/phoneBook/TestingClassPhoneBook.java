/**
 * 
 */
package java2.chapter13.phoneBook;

/**
 * @author Benjamin Elfen
 * 
 * This class is for testing the Telefonbuch class
 *
 */
public class TestingClassPhoneBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Testing
		Telefonbuch GelbeSeiten = new Telefonbuch();
		
		GelbeSeiten.add(new Telefonbucheintrag("Kunibert", "015243665487"));
		GelbeSeiten.add(new Telefonbucheintrag("Gerd", "080034646"));
		
		System.out.println(GelbeSeiten);
		
		System.out.println(GelbeSeiten.search("Kunibert"));
		System.out.println(GelbeSeiten.search("Gert"));
	}

}

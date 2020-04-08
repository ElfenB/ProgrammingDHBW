/**
 * 
 */
package java2.chapter13.phoneBook;

/**
 * @author Benjamin Elfen
 *
 */
public class TestingBesseresTelefonbuch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BesseresTelefonbuch GelbeSeiten = new BesseresTelefonbuch();
		System.out.println(GelbeSeiten.add(new Telefonbucheintrag("a", "654654654654")));
		System.out.println(GelbeSeiten);
		System.out.println(GelbeSeiten.add(new Telefonbucheintrag("b", "654654654654")));
		System.out.println(GelbeSeiten);
		System.out.println(GelbeSeiten.add(new Telefonbucheintrag("c", "654654654654")));
		System.out.println(GelbeSeiten);
		System.out.println(GelbeSeiten.add(new Telefonbucheintrag("a", "654654654654")));;
		System.out.println(GelbeSeiten);
		System.out.println(GelbeSeiten.add(new Telefonbucheintrag("f", "654654654654")));
		System.out.println(GelbeSeiten);
		System.out.println(GelbeSeiten.add(new Telefonbucheintrag("g", "654654654654")));
		System.out.println(GelbeSeiten);
		System.out.println(GelbeSeiten.add(new Telefonbucheintrag("e", "654654654654")));
		System.out.println(GelbeSeiten);
		System.out.println(GelbeSeiten.add(new Telefonbucheintrag("d", "654654654654")));
		System.out.println(GelbeSeiten);
	}

}

package java1.chapter09;

/**
 * @author Benjamin Elfen
 *
 */
public class HaustierTest {

	public static void main(String[] args) {
		Haustier Hund = new Haustier("Bernd", 4);
		System.out.println(Hund);
		
		VierbeinerHaustier Katze = new VierbeinerHaustier("Charlie");
		System.out.println(Katze);
		
		ZweibeinerHaustier Kanarienvogel = new ZweibeinerHaustier("Cookie");
		System.out.println(Kanarienvogel);
	}
}

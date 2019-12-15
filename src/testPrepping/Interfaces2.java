/**
 * 
 */
package testPrepping;

/**
 * @author Benjamin Elfen
 *
 */
public class Interfaces2 implements Interface1 {

	private int strengGeheim;
	
	@Override
	public boolean workedOut() {
		return false;
	}

	@Override
	public String spotted() {
		return null;
	}
	
	public Interfaces2(int asdf) {
		strengGeheim = asdf;
	}
	
	public int getStrengGeheim() {
		return strengGeheim;
	}

	public static void main(String[] args) {
		Interfaces2 two = new Interfaces2(3);
		System.out.println(two.getStrengGeheim());
		
		String[] three = new String[3];
		for (int i = 0; i < three.length; i++) {
			three[i] = "" + i;
			System.out.println(java.util.Arrays.toString(three));
		}
	}
	
}

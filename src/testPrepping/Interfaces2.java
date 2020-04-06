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
		String[] test = new String[] {"t", "e", "s", "t"};
		
		String[] three = new String[3];
		for (int i = 0; i < three.length; i++) {
			three[i] = "" + i;
			System.out.println(java.util.Arrays.toString(three));
		}
		System.out.println(java.util.Arrays.toString(test));
		
		int[][] feld = new int[10][10];
		for (int i = 0; i < feld.length; i++) {
			for (int j = 0; j < feld[i].length; j++) {
				feld[i][j] = i + j;
			}
		}
		for (int i = 0; i < feld.length; i++) {
			System.out.println(java.util.Arrays.toString(feld[i]));
		}
		
		int[][] tri = new int[][] {{1}, {2, 3}, {4, 5, 6}};
		for (int i = 0; i < tri.length; i++) {
			System.out.println(java.util.Arrays.toString(tri[i]));
		}
	}
	
}

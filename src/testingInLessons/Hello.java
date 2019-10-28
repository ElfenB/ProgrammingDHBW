package testingInLessons;

/**
 * <style>
 * center{color: red;font-family:Courier;}
 * #inhalt{display:flex;background:blue;padding-bottom:54;}
 * #links{flex:1;background:red;}
 * #mitte{flex:3;background:purple;}
 * #rechts{flex:1;background:yellow;s}
 * </style>
 * 
 * <div id="inhalt"> <div id="links">
 * <p>
 * links
 * </p>
 * </div> <div id="mitte">
 * <p>
 * mitte
 * </p>
 * </div> <div id="rechts">
 * <p>
 * rechts
 * </p>
 * </div> </div>
 * 
 * Dies ist ein <center>Text</center>
 * 
 * @author Benjamin Elfen
 *
 */
public class Hello {
	
	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		int x = 20; // Initialisation of x
		boolean boolean1 = true;
		boolean boolean2 = false;
		String blabla = "hallo leute";
		System.out.println("Hello world!"); // Prints out "Hello world!" into console window
		System.out.println(-0x10);
		System.out.println(0b11110);
		System.out.println(015);
		System.out.printf("%.101f", -1e-100);
		System.out.println("\n\u0250");
		System.out.println("\'");
		System.out.println("\"\"");
		System.out.println("x = " + x);
		if (boolean2 == boolean1) {
			System.out.println(boolean1);
		}else {
			System.out.println(boolean2);
		}
		System.out.println(blabla);
	}
	

}

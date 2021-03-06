package testingInLessons;

import java.util.Arrays;

/**
 * <style>center{color: red;font-family: Courier;}#inhalt{display:flex;background:blue;padding-bottom:54;}#links{flex:1;background:red;}#mitte{flex:3;background:purple;}#rechts{flex:1;background:yellow;s}</style>
 * 
 * <div id="inhalt">
 * <div id="links"><p>links</p></div>
 * <div id="mitte"><p>mitte</p></div>
 * <div id="rechts"><p>rechts</p></div>
 * </div>
 * 
 * Dies ist ein <center>Text</center>
 * 
 * @author Benjamin Elfen
 *
 */
public class Hello2 {

	public static void main(String[] args) {
		// Prints out "Hello world!" into console window
		System.out.println("Hello world!");
		System.out.println(-0x10);
		System.out.println(0b11110);
		System.out.println(0215);
		
		System.out.println(new String[100].length);
		String[] test = new String[100];
		System.out.println(test.length);
		test[99] = "";
		
		String string2 = "a";
		String string3 = "d";
		
		System.out.println(string2.compareTo(string3));
		
		System.out.println(Arrays.toString(new int[5]));
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 200000000; i++) {
			i++;
		}
		System.out.println(start);
		System.out.println(System.currentTimeMillis());
	}

}

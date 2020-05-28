/**
 * 
 */
package testPrepping;

import java.util.*;

/**
 * @author Benjamin Elfen
 *
 */
public class QuestionsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sum = "";
		Deque<Character> stackB = new LinkedList<>();
		stackB.addFirst('ä');
		stackB.addFirst('ö');
		stackB.addFirst('ü');
		stackB.addFirst('Ä');
		stackB.addFirst('Ö');
		stackB.addFirst('Ü');

		for (char x : stackB) {
			sum += x;
		}
		
		System.out.println(sum);
		
		int sum1 = 0;
		Map<String, Boolean> mapD = new HashMap<>();
		mapD.put("7", false);
		mapD.put("8", false);
		mapD.put("9", false);
		mapD.put("10", false);
		mapD.put("B", true);
		mapD.put("D", true);
		mapD.put("K", true);
		
		for (boolean bild : mapD.values()) {
			sum1 = bild ? ++sum1 : sum1;	// super sweet
		}
		
		System.out.println(sum1);
		
	}

}

/**
 * 
 */
package testPrepping;

import java.util.Deque;
import java.util.LinkedList;

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
	}

}

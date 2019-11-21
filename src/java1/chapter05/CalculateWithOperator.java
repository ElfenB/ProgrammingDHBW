package java1.chapter05;

import java.util.Scanner;

/**
 * @author Benjamin Elfen
 *
 */
public class CalculateWithOperator {

	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int first = 0, second = 0;
		String operator;
		double resultOfCalculation = 0.0;
		
		// input
		System.out.print("Bitte erste Zahl eingeben: ");
		first = scan.nextInt();		
		System.out.print("Bitte zweite Zahl eingeben: ");
		second = scan.nextInt();
		System.out.print("Bitte gewünschten Rechenoperator eingeben: ");
		// reads operator as String
		operator = scan.next();
		
		// calculation
		switch (operator) {
		case "+":
			resultOfCalculation = first + second;
			break;
		case "-":
			resultOfCalculation = first - second;
			break;
		case "*":
			resultOfCalculation = first * second;
			break;
		case "/":
			// has to cast one of the variables to get precise double value
			resultOfCalculation = (double) first / second;
			break;
		default:
			resultOfCalculation = 0.0;
			break;
		}
		
		// output
		System.out.println(resultOfCalculation);
		
		scan.close();
	}

}

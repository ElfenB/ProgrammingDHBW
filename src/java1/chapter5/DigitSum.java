package java1.chapter5;

public class DigitSum {
    public static void main(String[] args) {
        int value = 4711, digitSum = 0;
        System.out.print("Die Quersumme von " + value + " ist ");

        // TODO Determine the digit sum of the given value
        // HINT: Modulo 10 -> 4711 % 10 = 1
        
        while (value > 0) {
        	digitSum += value % 10;
        	value = value / 10;
		}
        System.out.println(digitSum);
    }
}

package java1.chapter5;

public class SumOfOdds {
    public static void main(String[] args) {
        int max = 11;
        int sum = 0;

        for (int i = 0; i <= max; i++) {
			if (i % 2 != 0) {
				sum += i;
				System.out.println(sum);
			}
		}

        System.out.println("Die Summe der ungeraden Zahlen von 1 bis " + max + " ist " + sum);
    }
}

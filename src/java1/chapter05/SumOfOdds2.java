package java1.chapter05;

public class SumOfOdds2 {
    public static void main(String[] args) {
        int max = 11;
        int sum = 0;
        int i = 0;

        while (i <= max) {
        	if (i % 2 != 0) {
				sum += i;
				System.out.println(sum);
			}
        	i++;
        }
        
//        for (int i = 0; i <= max; i++) {
//			if (i % 2 != 0) {
//				sum += i;
//				System.out.println(sum);
//			}
//		}

        System.out.println("Die Summe der ungeraden Zahlen von 1 bis " + max + " ist " + sum);
    }
}

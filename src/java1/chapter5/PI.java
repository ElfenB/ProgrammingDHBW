package java1.chapter5;

public class PI {

	public static void main(String[] args) {
		double pi = 0.0;
		for (int i = 0; i < 100000; i++) {
						
			if (i % 2 == 0) {
//				pi += 1.0 / i;
				pi += 1.0 / (2 * i + 1);
			} else {
//				pi *= -1.0;
				pi -= 1.0 / (2 * i + 1);
			}
			
			System.out.println(pi * 4);
		}
	}
}

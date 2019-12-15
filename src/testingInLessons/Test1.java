package testingInLessons;

public class Test1 {
	public Test1() {
		
	}
	private static String test3;
	public static void main(String[] args) {
		var test = 3;
		var nochEinTest = 4;
		var ausgabe = "Hallo ";
		
		System.out.println(ausgabe + (test + nochEinTest));
		
		System.out.println(java1.chapter06.Calculator.abs(-213));
		
		System.out.println('\u0000');
		char test1 = '\u0000';
		for (int i = 0; i <= 99; i++) {
			System.out.print(test1++);
			System.out.print(" " + i + "\n");
		}
		System.out.println('\u0B68');
		System.out.println('\u0FD5');
		System.out.println('\u101A');
		System.out.println(9);
		java.math.BigDecimal blabla = new java.math.BigDecimal(3);
		System.out.println(blabla);
		System.out.println(test3);
		Test1 blublu = new Test1();
		System.out.println(blublu);
	}
	
	public void testing3() {
		
	}
}

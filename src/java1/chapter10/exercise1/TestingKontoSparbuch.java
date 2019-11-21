package java1.chapter10.exercise1;

public class TestingKontoSparbuch {

	public static void main(String[] args) {
		Konto Gerda = new Konto(123456);
		Sparbuch Herbert = new Sparbuch(654321);
		Girokonto Gustav = new Girokonto(456789);
		
		// Testing Konto
		System.out.println(Gerda);
		Gerda.auszahlen(100);
		System.out.println(Gerda);
		
		// Testing Sparbuch
		System.out.println(Herbert);
		Herbert.auszahlen(100);
		System.out.println(Herbert);
		Herbert.einzahlen(50);
		System.out.println(Herbert);
		Herbert.auszahlen(100);
		System.out.println(Herbert);
		Herbert.einzahlen(50);
		System.out.println(Herbert);
		Herbert.auszahlen(100);
		System.out.println(Herbert);
		Herbert.einzahlen(200);
		System.out.println(Herbert);
		Herbert.auszahlen(100);
		System.out.println(Herbert);
		
		// Testing Girokonto
		System.out.println(Gustav);
		Gustav.einzahlen(30);
		System.out.println(Gustav);
		Gustav.auszahlen(100);
		System.out.println(Gustav);
	}

}

package java1.chapter10.exercise1;

public class TestingKontoSparbuch {

	public static void main(String[] args) {
		Konto Gerda = new Konto(123456);
		Sparbuch Herbert = new Sparbuch(654321);
		
		System.out.println(Gerda);
		Gerda.auszahlen(100);
		System.out.println(Gerda);
		
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
	}

}

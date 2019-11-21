package java1.chapter10;

public class TestingKontoSparbuch {

	public static void main(String[] args) {
		Konto Gerda = new Konto(123456);
//		Sparbuch Herbert = new Sparbuch(654321);
		
		System.out.println(Gerda);
		Gerda.auszahlen(100);
		System.out.println(Gerda);
	}

}

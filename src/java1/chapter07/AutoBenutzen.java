package java1.chapter07;

public class AutoBenutzen {

	public static void main(String[] args) {
		Auto auto = new Auto("BIN-BE-46", "e46 330ci");
		auto.tanken(3);
		auto.einsteigen(1);
		System.out.println(auto.insassenAnzahl);
		System.out.println(auto.tankInhalt);
		System.out.println(Auto.autoAnzahl);
	}
	
}

package java1.chapter7;

public class BruchBenutzen {
	public static void main(String[] args) {
		Bruch bruch1 = new Bruch(1, 2);
		System.out.println("Zähler: " + bruch1.zaehler);
		System.out.println("Nenner: " + bruch1.nenner);
		System.out.println("<======================>");
		System.out.println("Negieren");
		System.out.println(bruch1.negiere().toString());
		System.out.println("<======================>");
		Bruch bruch2 = new Bruch(3, 4);
		System.out.println("Addition von: " + bruch1.toString() + " und " + bruch2.toString() + " ist " + (bruch1.addiere(bruch2).toString()));
		System.out.println("Substraktion von: " + bruch1.toString() + " und " + bruch2.toString() + " ist " + (bruch1.substrahiere(bruch2).toString()));
		System.out.println("Kehrwert von: " + bruch1 + " ist " + bruch1.kehrwert().toString());
	}
}

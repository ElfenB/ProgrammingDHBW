package java1.chapter8;

public class VektorenTest {

	public static void main(String[] args) {
		Vektor vektor1 = new Vektor(1, 2, 3);
		Vektor vektor2 = new Vektor(2, 3, 4);
		
		System.out.println(vektor1);
		System.out.println("+");
		System.out.println(vektor2);
		System.out.println("=");
		System.out.println(vektor1.addieren(vektor2));
		

	}

}

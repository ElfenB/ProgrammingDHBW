package testingInLessons;

public class Array {
	public static void main(String[] args) {
		int[] zahlen = new int[6];
		for (int i = 0; i < zahlen.length; i++) {
			zahlen[i] = i;
		}
		
		zahlen[3] = 8;
		zahlen[4] = 8;
		zahlen[2] = 9;
		
		System.out.println(java.util.Arrays.toString(zahlen));
		java.util.Arrays.sort(zahlen, 0, zahlen.length);
		System.out.println(java.util.Arrays.toString(zahlen));
		
//		for (int i = 0; i < zahlen.length; i++) {
//			System.out.println(zahlen[i]);
//		}
		
		String[] personen = new String[4];
		personen[3] = "Gerda";
		personen[1] = "Herbert";
		personen[2] = "Wuffi";
		personen[0] = "Werner";
		
		System.out.println(java.util.Arrays.toString(personen));
		java.util.Arrays.sort(personen);
		System.out.println(java.util.Arrays.toString(personen));
		
//		for (int i = 0; i < personen.length; i++) {
//			System.out.println(personen[i]);
//		}
		
		
//		"♠♣♥♦"
		
	}
}

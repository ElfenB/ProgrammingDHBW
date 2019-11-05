package java1.chapter8;

public class ContainerTest {

	public static void main(String[] args) {
		Container container1 = new Container(20, 30);
		
		System.out.print("Container1 ist " + container1.getSpace() + " Liter groß");
		System.out.print(" und " + container1.getMaxLoad() + " Kilogramm schwer.");
		System.out.println();
		System.out.println("Es gibt " + Container.getNumberOfContainers() + " Container.");
		System.out.println();
		
		System.out.println("container1: " + container1);
		Transportgut waschmaschine1 = new Transportgut(10, 12);
		System.out.println("Beladen mit waschmaschine1");
		System.out.println("waschmaschine1: " + waschmaschine1);
		container1.beladen(waschmaschine1, false);
		
		System.out.println();
		System.out.println("container1: " + container1);
		Transportgut waschmaschine2 = new Transportgut(32, 42);
		if (container1.beladen(waschmaschine2, false)) {
			container1.beladen(waschmaschine2, false);
			System.out.println("Beladen mit waschmaschine2");
		}
//		try {
//			container1.beladen(waschmaschine2);
//			System.out.println("Beladen mit waschmaschine2");
//		} catch (Exception e) {
//			System.out.println("Konnte nicht beladen werden");
//		}
		System.out.println("container1: " + container1);
		System.out.println("Anzahl eingeladener Güter in \"container1\": " + container1.getNumberOfTransportgüter());
		
	}

}

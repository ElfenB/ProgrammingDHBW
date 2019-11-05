package java1.chapter8;

public class ContainerTest {

	public static void main(String[] args) {
		Container container1 = new Container(20, 30);
		
		System.out.print("Container1 ist " + container1.getSpace() + " Liter groß");
		System.out.print(" und " + container1.getMaxLoad() + " Kilogramm schwer.");
		System.out.println();
		System.out.println("Es gibt " + Container.getNumberOfContainers() + " Container.");
		
		Transportgut waschmaschine1 = new Transportgut(10, 12);
		container1.beladen(waschmaschine1);
		
		System.out.println();
		System.out.println("container1: " + container1);
	}

}

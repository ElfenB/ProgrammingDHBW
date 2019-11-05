package java1.chapter8;

public class ContainerTest {

	public static void main(String[] args) {
		Container container1 = new Container(20, 30);
		
		System.out.print("Container1 ist " + container1.size + " Liter groß");
		System.out.print(" und " + container1.weight + " Kilogramm schwer.");
		System.out.println();
		System.out.println("Es gibt " + Container.numberOfContainers + " Container.");
	}

}

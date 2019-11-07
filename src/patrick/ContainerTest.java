package patrick;

public class ContainerTest {

	public static void main(String[] args) {
		
		Container container = new Container();
		
		container.load(new Cargo("Test", 20, 20.0));
		container.load(new Cargo("Waschmaschine", 1.5, 50.0));
		container.load(new Cargo("Waschmaschine", 1.5, 50.0));
		container.load(new Cargo("Bohrmaschine", 50, 50.0));
		
		System.out.println(container);
		
		container.unload(new Cargo("Waschmaschine", 1.5, 50.0));
		container.unload(new Cargo("Waschmaschine", 1.5, 50.0));
		
		
		System.out.println();
		System.out.println(container.getContentList());
		
//		System.out.println(container);
	}

}

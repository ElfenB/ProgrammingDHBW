package java1.chapter8;

public class BookTest {

	public static void main(String[] args) {
		// data for book1
		String author = "Ich";
		String author2 = "Du";
		String title = "Autobiografie";
		long isbn13 = 9783424152678l;
		boolean hardcover = true;
		
		// create new books
		Book book1 = new Book(author, title, isbn13, hardcover);
		
		// tests
		System.out.print("getAuthor: ");
		if (book1.getAuthor() == author) {
			System.out.print("ok");
		} else {
			System.out.print("FEHLER");
		}
		
		System.out.println();
		System.out.print("setAuthor: ");
		book1.setAuthor(author2);
		if (book1.getAuthor() == author2) {
			System.out.print("ok");
		} else {
			System.out.print("FEHLER");
		}
		
		System.out.println();
		System.out.print("Gegentest getAuthor: ");
		if (book1.getAuthor() == author) {
			System.out.print("FEHLER");
		} else {
			System.out.print("ok");
		}
		
		Book book2 = new Book(author2, "Penis", 9783424152679l, false);
		book2.setAvailable(false);
		System.out.println();
		System.out.println(Book.getNumberOfBooks() + " Bücher sind im Inventar");
		
	}

}

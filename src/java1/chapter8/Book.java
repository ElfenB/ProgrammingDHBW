package java1.chapter8;

public class Book {
	private static int numberOfBooks;   // total number of instantiated books
    private String author;              // book author
    private String title;               // book title
    private long isbn13;                // ISBN-13 of the book
    private boolean hardcover;          // is it a hardcover book?
    private boolean available;          // is the book available?
    private int shelfNumber;            // shelf number of the book
    
    public Book(String author, String title, long isbn13, boolean hardcover, boolean available, int shelfNumber) {
    	numberOfBooks++;
    	this.author = author;
    	this.title = title;
    	this.isbn13 = isbn13;
    	this.hardcover = hardcover;
    }
    
    // getter and setter methods
    public String getAuthor() {
    	return this.author;
    }
    
    public void setAuthor(String newAuthor) {
    	this.author = newAuthor;
    }
    
    public String getTitle() {
    	return this.title;
    }
    
    public void setTitle(String newTitle) {
    	this.title = newTitle;
    }
    
    public long getISBN13() {
    	return this.isbn13;
    }
    
    public void setISBN13(long newISBN13) {
    	this.isbn13 = newISBN13;
    }
    
    public boolean getHardcover() {
    	return this.hardcover;
    }
    
    public void setHardcover(boolean newHardcover) {
    	this.hardcover = newHardcover;
    }
    
    public boolean getAvailable() {
    	return this.available;
    }
    
    public void setAvailable(boolean newAvailable) {
    	this.available = newAvailable;
    }
    
    public int getShelfnumber() {
    	return this.shelfNumber;
    }
    
    public void setShelfnumber(int newShelfnumber) {
    	this.shelfNumber = newShelfnumber;
    }
    
    
    
}

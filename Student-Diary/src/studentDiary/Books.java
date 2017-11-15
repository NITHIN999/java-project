package studentDiary;


import java.io.Serializable;
import java.util.Scanner;

public class Books implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    Scanner s = new Scanner(System.in);

	String bookName;
    String author;
    
    public Books() {
        bookName = "";
        author = "";
    }
    
    public Books(String bookName, String author) {
        this.bookName = bookName;
        this.author  = author;
    }
    
    public void addBook() {
        System.out.println("Enter Book name");
        bookName = s.next();
        System.out.println("Enter author");
        author = s.nextLine();
    }
    
    public String toString() {
        return "Book Name:" + bookName + "\nAuthor:" + author;
    }
    
    public String getBookName() {
        return bookName;
    }
    
    public String getAuthor() {
        return author;
    }
    
}

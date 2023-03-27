package library;

import java.util.ArrayList;
import java.util.List;

public class Library {

	List<Patron> patrons;
	List<Book> books;
	
	Library() {
		this.books = new ArrayList<Book>();
		this.patrons = new ArrayList<Patron>();
	}
	
	Library(List<Book> books) {
		this.books = books;
		this.patrons = new ArrayList<Patron>();
	}
	
	Library(List<Patron> patrons) {
		this.patrons = patrons;
		this.books = new ArrayList<Book>();

	}
	
	Library(List<Book> books, List<Patron> patrons) {
		this.patrons = patrons;
		this.books = books;
	}
	
	void newBook(Book book) {}
	
	void newPatron(Patron patron) {}
	
	void newBooks(List<Book> books) {}
	
	void newPatrons(List<Patron> patrons) {}
	
	void outputPatrons() {}
	
	void outputBooks() {}
	
	void checkOutBooks(String patronID, int[] bookIDs) {}
}


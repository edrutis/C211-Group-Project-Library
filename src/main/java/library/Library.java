/*
	Author: Emily Reynolds
	Last Updated: 20230423

*/ 

package library;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Library {

	HashMap<Integer, Patron> patrons;
	HashMap<String, Book> books;
	
	Library() {
		this.books = new HashMap<String, Book>();
		this.patrons = new HashMap<Integer, Patron>();
	}
	

	
	Library(HashMap<String, Book> books, HashMap<Integer, Patron> patrons) {
		this.patrons = patrons;
		this.books = books;
	}
	
	void newBook(Book book) {
		this.books.put(book.getID(), book);
	}
	
	boolean newPatron(Patron patron) {
            try
            {
                this.patrons.put(patron.getPatronId(), patron);
            }
            catch (Exception e)
            {
                return false;
            }
            return true;
	}
	
	void newBooks(List<Book> books) {
		for (Book book: books) {
			this.books.put(book.getID(), book);
		}
	}
	
	void newPatrons(List<Patron> patrons) {
		for (Patron patron: patrons) {
			this.patrons.put(patron.getPatronId(), patron);
		}
	}
	
	String outputPatrons() {
		System.out.println(this.patrons);
                return this.patrons.toString();
	}
	
	String outputBooks() {
		System.out.println(this.books);
                return this.books.toString();
	}
	
	boolean checkOutBooks(int patronID, ArrayList<String> bookIDs) {
            try
            {
                Patron tempPatron = this.patrons.get(patronID);
		for (String book: bookIDs) {
			tempPatron.checkOutBook(this.books.get(book));
			this.books.remove(book);
		}
		this.patrons.put(patronID, tempPatron);
            }
            catch (Exception e)
            {
                return false;
            }
            return true;
		
	}

	boolean returnBooks(int patronID) {
            try
            {
                this.newBooks(this.patrons.get(patronID).returnAllBooks());
            }
            catch (Exception e)
            {
                return false;
            }
            return true;
		
	}

}


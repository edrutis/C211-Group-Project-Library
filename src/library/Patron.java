// author Sam Allen
// C211 Spring 2023
// Project Phase 2
// Last updated by Emily Reynolds
// Last update 20230430
// specs documentation url //

// https://www.cs.iusb.edu/~dvrajito/teach/c211/phase2.html

package library;

import java.util.ArrayList;

public class Patron 
{
	// instance attributes // 
	
	// patron ID should be a constant
	// value over a patron's lifetime
	// and rarely changed
	int patronId;
	
	// patron details that might 
	// change or be updated over time
	int phoneNumber, zipCode, balance;
	String firstName, lastName, streetAddress;
	
	// a list of other patrons that this
	// patron may be responsible for, 
	// like children or other dependents
	Patron[] family;

	//Currently Checked out books will be placed in this array
	ArrayList<Book> checkedOutBooks;
	// constructors // 
	
	// 1. 
	// default
	Patron()
	{
		patronId = 0;
		phoneNumber = 0;
		zipCode = 0;
		firstName = "";
		lastName = "";
		streetAddress = "";
	}
	
	// 2. 
	// parametric 
	Patron(int x, int y, int z, String a, String b, String c)
	{
		patronId = x;
		phoneNumber = y;
		zipCode = z;
		firstName = a;
		lastName = b;
		streetAddress = c;
	}
	
	// class methods // 
	
	// 1. 
	// update patron details 
	void updatePatronDetails(int y, int z, String a, String b, String c)
	{
		phoneNumber = y;
		zipCode = z;
		firstName = a;
		lastName = b;
		streetAddress = c;
	}
	
	// 2. 
	// separate method to update patronId 
	// to reduce likelihood that patronId
	// be changed unintentionally
	// should be rarely used
	void udpatePatronId(int x)
	{
		patronId = x;
	}
	
	// 3. 
	// add patron to family list
	void addFamily()
	{
		
	}
	
	// 4. 
	// remove patron from family list
	void removeFamily()
	{
		
	}
	
	// 5. 
	// update patron's balance
	// by given amount
	// used for late fees, etc
	void updateBalance()
	{
		
	}

	int getPatronId() {
		return this.patronId;
	}

	void checkOutBook(Book toCheckOut){
		this.checkedOutBooks.add(toCheckOut);
	}

	ArrayList<Book> returnAllBooks() {
		ArrayList<Book> toReturn = new ArrayList<Book>();
		toReturn.addAll(this.checkedOutBooks);
		checkedOutBooks.clear();
		return toReturn;
	}
}
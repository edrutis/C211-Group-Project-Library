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
	protected int patronId;
	
	// patron details that might 
	// change or be updated over time
	protected int phoneNumber, zipCode, balance;
	protected String firstName, lastName, streetAddress;
	
	// a list of other patrons that this
	// patron may be responsible for, 
	// like children or other dependents
	protected ArrayList<Patron> family;

	// Currently Checked out books will be placed in this array
	protected ArrayList<Book> checkedOutBooks;
	
	// constructors // 
	
	// 1. 
	// default
	Patron()
	{
		setPatronId(0);
		setPhoneNumber(0);
		setZipCode(0);
		setFirstName("");
		setLastName("");
		setStreetAddress("");
	}
	
	// 2. 
	// parametric 
	Patron(int x, int y, int z, String a, String b, String c)
	{
		setPatronId(x);
		setPhoneNumber(y);
		setZipCode(z);
		setFirstName(a);
		setLastName(b);
		setStreetAddress(c);
	}
	
	// class methods // 
	
	// 1. 
	// update patron details 
	// return true if successful
	boolean updatePatronDetails(int y, int z, String a, String b, String c)
	{
		try
		{
			setPhoneNumber(y);
			setZipCode(z);
			setFirstName(a);
			setLastName(b);
			setStreetAddress(c);
		}
		catch (Exception e)
		{
			return false;
		}
		return true;
		
	}
	
	// 2. 
	// separate method to update patronId 
	// to reduce likelihood that patronId
	// be changed unintentionally
	// should be rarely used
	// return true if successful 
	boolean udpatePatronId(int x)
	{
		try
		{
			setPatronId(x);
		}
		catch (Exception e)
		{
			return false;
		}
		return true;
	}
	
	// 3. 
	// add patron to family list
	// return true if successful
	boolean addFamily()
	{
		try 
		{
			Patron temp = new Patron();
			family.add(temp);
		}
		catch (Exception e)
		{
			return false;
		}
		return true;
	}
	
	// 4. 
	// remove patron from family list
	// return true if successful
	boolean removeFamily(Patron x)
	{
		try 
		{
			family.remove(x);
		}
		catch (Exception e)
		{
			return false;
		}
		return true;
	}
	
	// 5. 
	// update patron's balance
	// by given amount
	// used for late fees, etc
	// return true if successful
	boolean updateBalance(int x)
	{
		try 
		{
			setBalance(getBalance() + x);
		}
		catch (Exception e)
		{
			return false;
		}
		return true;
	}

	// 6. 
	// add book to list or checked out books
	// return true if successful 
	boolean checkOutBook(Book toCheckOut)
	{	
		try
		{
			checkedOutBooks.add(toCheckOut);
		}
		catch (Exception e)
		{
			return false;
		}
		return true;
	}

	// 7. 
	// return all books currently checked out
	// returns empty ArrayList if fails
	ArrayList<Book> returnAllBooks() 
	{
		ArrayList<Book> toReturn = new ArrayList<Book>();
		try
		{
			toReturn.addAll(checkedOutBooks);
			checkedOutBooks.clear();
			return toReturn;
		}
		catch (Exception e)
		{
			return toReturn;
		}
	}
	
	// setters and getters //
	
	void setPatronId(int x)
	{
		patronId = x;
	}
	
	int getPatronId() 
	{	
		return patronId;
	}

	public int getPhoneNumber() 
	{
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}

	public int getZipCode() 
	{
		return zipCode;
	}

	public void setZipCode(int zipCode) 
	{
		this.zipCode = zipCode;
	}

	public int getBalance() 
	{
		return balance;
	}

	public void setBalance(int balance) 
	{
		this.balance = balance;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public String getStreetAddress() 
	{
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) 
	{
		this.streetAddress = streetAddress;
	}

	public ArrayList<Patron> getFamily() 
	{
		return family;
	}

	public void setFamily(ArrayList<Patron> family) 
	{
		this.family = family;
	}

	public ArrayList<Book> getCheckedOutBooks() 
	{
		return checkedOutBooks;
	}

	public void setCheckedOutBooks(ArrayList<Book> checkedOutBooks) 
	{
		this.checkedOutBooks = checkedOutBooks;
	}
}
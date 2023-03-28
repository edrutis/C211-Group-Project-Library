package book;

import java.util.ArrayList;


public class BookList 
{
    public ArrayList<Book> books;
 
    public BookList(String list) 
    {
        books = new ArrayList<>();
    }
  
    //adds book to array
    public void addBook(String author, String title, String id, String availability) 
    {
        books.add(new Book(title, author, id, availability));
    }
    
    //removes book from array by title
    public void removeBook(String title) 
    {
        for (int i=0; i <  books.size();i++) 
        {
            if (books.get(i).title.equals(title))
                books.remove(i);
        }
    }

    //returns availability
    public boolean checkAvailability(String title, boolean Unavailable) 
    {
        for (int i=0; i <books.size();i++)
        {
            if(books.get(i).title==title)
            if (Unavailable ==true);
        }
       return false;
    }
    
    //prints all books
    public void completeBookList()
    {
        for (int i=0; i < books.size();i++)
        System.out.println(books.get(i));
    }
    
}
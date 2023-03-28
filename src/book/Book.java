package book;

public class Book
{
    //instance variables
    public String title;
    public String author;
    public String id;
    public String availability;
    

    //constructors
    public Book(String title,String author, String id,String availability)
    {   this.title=title;
        this.author=author;
        this.id=id;
        this.availability=availability;
    }
   
    //returns all attributes of one book
    @Override
    public String toString()
    {
        return "id: " + id + "\n" +
               "title: " + title + "\n" +
               "author: " + author + "\n" +
               "availability: " + availability + "\n";
    }
    
}

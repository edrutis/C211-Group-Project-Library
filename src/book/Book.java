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
    
    // set methods
    public void setTitle(String title)
    {
        this.title=title;
    }
     public void setAuthor(String author)
    {
       this.author=author;
    }
    public void setID(String id)
    {
        this.id=id;
    }
    public void setAvailability(String availability)
    {
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

package book_deprecated;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        BookList list = new BookList("lib1");
        list.addBook("F. Scott Fitzgerald", "The Great Gatsby", "01", "Unavailable");
        list.addBook("Mark Twain", "Adventures of Huckleberry Finn", "02", "Available");
        list.addBook("George Orwell", "Animal Farm", "03", "Unavailable");
        list.addBook("Jane Austen", "Pride and Prejudice", "04", "Available");
        list.addBook("J. R. R. Tolkien", "The Hobbit", "05", "Unavailable");
        list.completeBookList();
        System.out.println("_____________________________________________");
        list.removeBook("Animal Farm");
        list.completeBookList();
  }
    }
    
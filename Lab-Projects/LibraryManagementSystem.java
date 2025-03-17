package com.mycompany.librarymanagementsystem;
/**
 *
 * @author supan
 */
import java.util.ArrayList;

class Author{
    private String name;
    private String email;
    
    public Author(String name, String email){
        this.name = name;
        this.email = email;
    }
    
    public void displayAuthorInfo(){
        System.out.println("Author Name: "+ name);
        System.out.println("Author Email: "+ email);
    }
}

class Book{
    private String title;
    private String isbn;
    private ArrayList<Author> authors;
    
    public Book(String title, String isbn){
        this.title = title;
        this.isbn = isbn;
        authors = new ArrayList<>();
    }
    
    public void addAuthor(Author author){
        authors.add(author);
    }    
    
    public void displayBookInfo(){
        System.out.println("\nBook Title: " + title);
        System.out.println("ISBN: " + isbn);
        System.out.println("Authors:");
        for(Author author : authors){
            author.displayAuthorInfo();
        }
    }
}

class Library{
    private String libraryName;
    private ArrayList<Book> books;
    
    public Library(String libraryName){
        this.libraryName = libraryName;
        books = new ArrayList<>();
    }
    
    public void addBook(Book book){
        books.add(book);
    }

    public void displayLibraryInfo(){
        System.out.println("\nLibrary Name: "+ libraryName);
        System.out.println("Books in the library: ");
        for(Book book : books){
            book.displayBookInfo();
        }
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {
        
        //Create Authors
        Author auth1 = new Author("Sir Arthur Conan Doyle", "arthurimagine@sherlock.com");
        Author auth2 = new Author("J. K. Rowling","jk@hogwarts.com");
        
        //Create Books
        Book book1 = new Book("Sherlock Holmes", "ISBN001");
        book1.addAuthor(auth1);
        Book book2 = new Book("Harry Potter", "ISBN002");
        book2.addAuthor(auth2);
        
        // Book with multiple authors(N.B: This is completely imaginary, 
        //we respect the great Authors)
        Book book3 = new Book("Imaginary Book", "ISNB003");
        book3.addAuthor(auth1);
        book3.addAuthor(auth2);
        
        //Create Library
        Library library = new Library("New Harrison Library");
        
        //Add books to Library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        
        // Display Library Information
        library.displayLibraryInfo();
    }
}

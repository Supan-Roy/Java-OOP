package com.mycompany.midterm;
/**
 *
 * @author supan
 */
class Shop {
    protected String email;
    
    public Shop(String email) {
        this.email = email;
    }
    
    public void display() {
        System.out.println("Shop Email: " + email);
    }
}

class Agora extends Shop {
    private String location;
    
    public Agora(String email, String location) {
        super(email);
        this.location = location;
    }
    
    public void display() {
        super.display();
        System.out.println("Shop Location: " + location);
    }
}

class Item {
    protected double unitPrice;
    
    public Item(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public void display() {
        System.out.println("Unit Price: " + unitPrice);
    }
}

class Book extends Item {
    private int isbnNumber;
    
    public Book(double unitPrice, int isbnNumber) {
        super(unitPrice);
        this.isbnNumber = isbnNumber;
    }
    
    public void display() {
        super.display();
        System.out.println("ISBN Number: " + isbnNumber);
    }
}

public class Shops {
    public static void main(String[] args) {
        Agora agora = new Agora("contact@agora.com", "Dhaka, Bangladesh");
        Book book = new Book(599.99, 1234567890);
        
        System.out.println("Agora Shop Details:");
        agora.display();
        
        System.out.println("\nBook Details:");
        book.display();
    }
}


package com.mycompany.midterm;
/**
 *
 * @author supan
 */
class Customer {
    private int custid;
    private String name;
    private String category;
    
    // Constructor
    public Customer(int custid, String name) {
        this.custid = custid;
        this.name = name;
        this.category = "Not Assigned"; // Default value
    }
    
    // Method to set category
    public void setCat(String category) {
        this.category = category;
    }
    
    // Method to get category
    public String getCat() {
        return category;
    }
    
    // Display method
    public void display() {
        System.out.println("\nCustomer ID: " + custid);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
    }
    
    // Main method
    public static void main(String[] args) {
        Customer customer1 = new Customer(101, "John Doe");
      
        customer1.display();
        
        customer1.setCat("Premium");
      
        System.out.println("Updated Category: " + customer1.getCat());
        customer1.display();
    }
}

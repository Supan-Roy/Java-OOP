package com.mycompany.empump;

import java.util.Scanner;

public class Customer {
    private String name;
    private String paymentMethod;
    private float payable;
    private int cell;
    
    public void setInfo(String name, String paymentMethod, float payable, int cell){
        this.name = name;
        this.paymentMethod = paymentMethod;
        this.payable = payable;
        this.cell = cell;
    }
    public void display(){
        System.out.println("\nCustomer Name: "+name+"\nPayment Method: "+paymentMethod+"\nTotal Payable: "+payable+"\nContact No.: "+cell);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        
        System.out.print("Preffered Payment Method: ");
        String paymentMethod = sc.nextLine();
        
        System.out.print("Total Payable Amount: ");
        float payable = sc.nextFloat();
        
        System.out.print("Enter Contact No.: ");
        int cell = sc.nextInt();
        
        Customer cust = new Customer();
        cust.setInfo(name, paymentMethod, payable, cell);
        cust.display();
        
        sc.close();
    }
}

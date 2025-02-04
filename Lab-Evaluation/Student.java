package com.mycompany.labevaluation;
/**
 *
 * @author supan
 */
import java.util.Scanner;
public class Student {
    private int studentId;
    private String studentName;
    private double balance;

    public void paymentAccount(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }
    
    public void deposit(double amount){
        if(amount>=0)
        balance+=amount;
    }
    public void displayBalance(double balance){
        this.balance = balance;
        System.out.println("\nBalance: "+balance);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();
        
        sc.nextLine();
        
        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();
        
        System.out.print("Enter Deposit Amount: ");
        double balance = sc.nextDouble();
        
        Student s1 = new Student();
        s1.displayBalance(balance);
        
        sc.close();
    }
}

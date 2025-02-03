package com.mycompany.empump;

import java.util.Scanner;

public class EmployeeUser {
    private String name;
    private int emp_ID;
    private double salary;
    
    public void setInfo(String name, int emp_ID, double salary){
        this.name = name;
        this.emp_ID = emp_ID;
        this.salary = salary;
    }
    public void display(){
        System.out.println("Name is "+name+"\nID: "+emp_ID+"\nSalary: "+salary);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter ID: ");
        int emp_ID = sc.nextInt();
        
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        
        EmployeeUser emp = new EmployeeUser();
        emp.setInfo(name, emp_ID, salary);
        emp.display();
        
        sc.close();
    }
}

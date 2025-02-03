package com.mycompany.empump;

public class Employee {
    private String name;
    private int emp_ID;
    private double salary;
    
    public void setInfo(String name, int emp_ID, double salary){
        this.name = name;
        this.emp_ID = emp_ID;
        this.salary = salary;
        
    }
    public void display(){
        System.out.println("Name is: "+name + "\nID: "+emp_ID+ "\nSalary: "+salary);
    }
    public static void main(String[] args) {
       Employee emp = new Employee();
       emp.setInfo("Supan", 716, 55900);
       emp.display();
    }
}

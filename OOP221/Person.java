package com.mycompany.oop221;
/**
 *
 * @author supan
 */
class Persons {
    String name;
    int age;
    String mobile;
    
    public void setInfo(String name, int age, String mobile){
        this.name = name;
        this.age = age;
        this.mobile = mobile;
    }
    public void displayInfo(){
        System.out.print("Name: "+name);
        System.out.print("Age: "+age);
        System.out.print("Contact No.: "+mobile);
    }
}
public class Person{
    public static void main(String[] args) {
        Persons p1 = new Persons();
        p1.setInfo("Supan", 21, "+880131599XXXX");
        p1.displayInfo();
        
        Persons p2 = new Persons();
        p2.setInfo("Meraj", 22, "+880194501XXXX");
        p2.displayInfo();
    }
}

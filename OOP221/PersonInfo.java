package com.mycompany.oop221;
/**
 *
 * @author supan
 */
class Person{
    String name;
    int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void display(){
        System.out.println("Name: "+name+"\nAge: "+age);
    }
}
public class PersonInfo {
    public static void main(String[] args) {
        
        Person p1 = new Person("Hathi Ram Chaudhary", 44);
        Person p2 = new Person("Imran Ansari", 35);
        
        p1.display();
        p2.display();
    }
}

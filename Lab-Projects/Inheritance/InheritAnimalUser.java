import java.util.Scanner;
/**
 *
 * @author supan
 */
class Animal{
    String name;
    double weight;
    
    Animal(String name, double weight){
        this.name = name;
        this.weight = weight;
    }
    void eat(){
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal{
    String breed;
    
    Dog(String name, double weight, String breed){
        super(name, weight);
        this.breed = breed;
    }
    
    @Override
    void eat(){
        System.out.println(name + " is eating dog food.");
    }
    
    void bark(){
        System.out.println(name + " is barking");
    }
    
    void displayDetails() {
        System.out.println("Dog's Name: " + name);
        System.out.println("Dog's Weight: " + weight);
        System.out.println("Dog's Breed: " + breed);
    }
}
public class InheritAnimalUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //user input for Dog
        System.out.println("Enter dog's name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter dog's weight: ");
        double weight = sc.nextDouble();
        
        sc.nextLine();
        
        System.out.println("Enter dog's breed: ");
        String breed = sc.nextLine();
        
        //Creating a Dog object using user input
        Dog kukur = new Dog(name, weight, breed);
        
        kukur.eat();
        kukur.bark();
        kukur.displayDetails();
        
        sc.close();
    }
}

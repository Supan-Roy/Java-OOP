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
        super(name,weight);
        this.breed = breed;
}
    @Override
    void eat(){
        System.out.println(name + " is eating food");
    }
     //method specific to Dog
    void bark(){
        System.out.println(name + " is barking");
    }
}
public class InheritAnimal {
    public static void main(String[] args) {
        //Object of the Dog class
        Dog d = new Dog("Buddy", 20.5, "Golden Retriever");
        
        //Access inherited method
        d.eat();
        //Access subclass-specific method
        d.bark();
    }
}

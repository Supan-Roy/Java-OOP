abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    @Override
    void makeSound() {
        System.out.println(name + " says Woof!");
    }
}
public class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog("Tommy");
        d1.makeSound(); 
        d1.sleep();    
    }
}

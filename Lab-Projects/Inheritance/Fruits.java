package com.mycompany.ooplab;
/**
 *
 * @author supan
 */
import java.util.Scanner;

class Fruit {
    private String color;
    private int size;
    private String taste;

    public void getInfo(String color, int size, String taste) {
        this.color = color;
        this.size = size;
        this.taste = taste;
    }

    public void display() {
        System.out.println("\nColor: " + color);
        System.out.println("Size: " + size);
        System.out.println("Taste: " + taste);
    }
}

class Mango extends Fruit {
    private String varieties;

    public void setValues(String varieties) {
        this.varieties = varieties;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Varieties: " + varieties);
    }
}

public class Fruits {
    public static void main(String[] args) {
        Mango m1 = new Mango();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter color: ");
        String color = sc.nextLine();
        
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter taste: ");
        String taste = sc.nextLine();

        System.out.print("Enter mango variety: ");
        String varieties = sc.nextLine();

        m1.getInfo(color, size, taste);
        m1.setValues(varieties);
        m1.display();

        sc.close();
    }
}
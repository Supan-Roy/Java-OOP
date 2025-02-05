package com.mycompany.oop221;
/**
 *
 * @author supan
 */
import java.util.Scanner;
public class MathOperations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();
        double absolute = Math.abs(number);
        double floor = Math.floor(number);
        double ceil = Math.ceil(number);
        long round = Math.round(number);
        double sqrt = Math.sqrt(number);
        
        System.out.println("\nAbsolute value: "+absolute);
        System.out.println("Floor value: "+floor);
        System.out.println("Ceil value: "+ceil);
        System.out.println("Round value: "+round);
        System.out.println("Square Root value: "+sqrt);
        
        sc.close();
    }
}

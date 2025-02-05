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
        System.out.println("\nAbsolute value: " + Math.abs(number));
        System.out.println("Floor value: " + Math.floor(number));
        System.out.println("Ceil value: " + Math.ceil(number));
        System.out.println("Round value: " + Math.round(number));
        System.out.println("Square root: " + Math.sqrt(number));
        
        sc.close();
    }
}

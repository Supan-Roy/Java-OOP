package com.mycompany.oop221;
/**
 *
 * @author supan
 */
import java.util.Scanner;
public class MaxMin3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter First Number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter Second Number: ");
        double num2 = sc.nextDouble();
        
        System.out.print("Enter Third Number: ");
        double num3 = sc.nextDouble();
        
        double max = Math.max(Math.max(num1, num2), num3);
        double min = Math.min(Math.min(num1, num2), num3);
        
        System.out.println("\nMaximum Number: "+max);
        System.out.println("Miniimum Number: "+min);
        
        sc.close();
    }
}

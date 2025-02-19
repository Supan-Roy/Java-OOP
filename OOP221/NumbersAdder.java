package com.mycompany.oop221;
/**
 *
 * @author supan
 */
import java.util.Scanner;
public class NumbersAdder {
    public int Integers(int a, int b){
        return a+b;
    }
   public double Doubles(double m, double n, double o){
       return m+n+o;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumbersAdder obj = new NumbersAdder();
        
        System.out.print("Enter first integer: ");
        int ij1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int ij2 = sc.nextInt();
        
        System.out.print("Enter first double: ");
        double d1 = sc.nextDouble();
        System.out.print("Enter second double: ");
        double d2 = sc.nextDouble();
        
        int sum1 = obj.Integers(ij2, ij2);
        double sum2 = obj.Doubles(d2, d2, d2);
        
        System.out.println("\nSum of two integers: "+sum1);
        System.out.println("Sum of two doubles: "+sum2);
        sc.close();
    }
}

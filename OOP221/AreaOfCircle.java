package com.mycompany.oop221;
/**
 *
 * @author supan
 */
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the radius of circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI*Math.pow(radius, 2);
        
        System.out.printf("\nArea of the circle: %.2f",area);
        sc.close();
    }
}

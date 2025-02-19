package com.mycompany.oop221;
/**
 *
 * @author supan
 */
import java.util.Scanner;
public class IntegerAdder {
    public int Add2Int(int x, int y){
        return x+y;
    }
    
    public int Add3Int(int x, int y, int z){
        return x+y+z;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntegerAdder obj = new IntegerAdder();
        
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third integer: ");
        int num3 = sc.nextInt();
        
        int result1 = obj.Add2Int(num1, num2);
        int result2= obj.Add3Int(num1, num2, num3);
        
        System.out.println("\nSum of Two Integers: "+result1);
        System.out.println("Sum of Three Integers: "+result2);
        sc.close();
    }
}

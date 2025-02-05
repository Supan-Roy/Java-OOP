package com.mycompany.oop221;
/**
 *
 * @author supan
 */
import java.util.Scanner;
public class TwoToThePower {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        for(int i=0;i<=n;i++){
            double result = Math.pow(2, i);
            System.out.println("2^"+i+" ="+(int)result);
        }
        sc.close();
    }
}

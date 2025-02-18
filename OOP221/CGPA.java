package com.mycompany.oop221;
/**
 *
 * @author supan
 */
import java.util.Scanner;
public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many Students' CGPA you want to insert? ");
        int n = sc.nextInt();
        
        double[] cgpa = new double[n];
        System.out.println("Enter "+n+" array elements");
        for(int i=0;i<n;i++){
            cgpa[i] = sc.nextDouble();
        }
        double largest = cgpa[0];
        double smallest = cgpa[0];
        
        for(int i=1;i<n;i++){
            if(cgpa[i]>largest){
                largest = cgpa[i];
            }
            else if(cgpa[i]<smallest){
                smallest = cgpa[i];
            }
        }
        System.out.println("Largest CGPA = "+largest);
        System.out.println("Smallest CGPA = "+smallest);
        
        sc.close();
    }
}

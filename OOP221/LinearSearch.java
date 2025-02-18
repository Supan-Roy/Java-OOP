package com.mycompany.oop221;
/**
 *
 * @author supan
 */
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Toal Case = ");
        int cases = sc.nextInt();
        
        System.out.print("How many Numbers you want to insert? ");
        int num = sc.nextInt();
        
        int[] arr = new int[num];
        System.out.println("Enter "+num+ " array elements: ");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
           
        for(int j=1;j<=cases;j++){
            System.out.print("Enter Data You want to search: ");
            int search = sc.nextInt();
            int index=-1;
            
            for(int i=0;i<num;i++){
                if(arr[i]==search){
                    index = i;
                    break;
                }
            }
            if(index!=-1){
                System.out.println(search +"  found at Index "+index);
            }
            else{
                System.out.println(search + " not found in the Array");
            }
        }
        sc.close();
    }
}

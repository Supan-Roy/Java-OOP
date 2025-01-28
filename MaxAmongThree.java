package com.mycompany.oop221;
/**
 *
 * @author supan
 */
import java.util.Scanner;
public class MaxAmongThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Num1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter Num2: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter Num3: ");
        int num3 = scanner.nextInt();

        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("The maximum value is: " + max);

        scanner.close();
    }
}

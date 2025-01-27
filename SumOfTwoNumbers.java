import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Num1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter Num2: ");
        int num2 = scanner.nextInt();

        int sum = num1+num2;
        System.out.println("The sum is: " +sum);
    }
}
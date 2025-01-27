import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.print("The area of the circle is: " + area);
    }
}

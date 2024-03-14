import java.util.Scanner;

public class Squareroot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        if (number < 0) {
            System.out.println("Square root is not defined for negative numbers.");
        } else {
            double squareRoot = calculateSquareRoot(number);
            System.out.println("Square root of " + number + " is " + squareRoot);
        }
        scanner.close();
    }

    public static double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }
}

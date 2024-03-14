import java.util.Scanner;

public class Calculatormenudriven {
    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1, num2;
        do {
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 5) {
                break;
            }

            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Division by zero is not allowed.");
                    } else {
                        System.out.println("Result: " + divide(num1, num2));
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (true);
        scanner.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

}

import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci series of " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

import java.util.Scanner;

public class Sumofseriessecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();
        int sum = calculateSumOfSquares(n);
        System.out.println("Sum of squares from 1^2 to " + n + "^2 is " + sum);
        scanner.close();
    }

    public static int calculateSumOfSquares(int n) {
        if (n < 1) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
}

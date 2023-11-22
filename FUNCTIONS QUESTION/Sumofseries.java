import java.util.Scanner;

public class Sumofseries{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();
        int sum = calculateSum(n);
        System.out.println("Sum of numbers from 1 to " + n + " is " + sum);
        scanner.close();
    }

    public static int calculateSum(int n) {
        if (n < 1) {
            return 0;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

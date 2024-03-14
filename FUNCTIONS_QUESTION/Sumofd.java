import java.util.Scanner;

public class Sumofd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = getumOfDigits(number);
        System.out.println("Sum of digits: " + sum);
        scanner.close();
    }

    public static int getumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}

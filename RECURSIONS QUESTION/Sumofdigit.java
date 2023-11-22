import java.util.Scanner;

public class Sumofdigit {
    static void sumofdigit(int n, int sum) {
        if (n <= 0) {
            System.out.println("SUM OF NUMBER IS: " + sum);
            return;
        }

        sum += n % 10;
        sumofdigit(n / 10, sum);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE DIGIT: ");
        int n = s.nextInt();
        sumofdigit(n, 0);
        s.close();

    }
}

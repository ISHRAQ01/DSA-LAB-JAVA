// import java.util.Scanner;

public class Primenumber {
    static boolean isprime(int n, int i) {
        if (i > n / 2) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return isprime(n, i + 1);
    }

    static void printprime(int n){

        if (n == 1) {
            return;
        }
        printprime(n-1);
        if (isprime(n,2)) {
            System.out.println(n);
        }

    }
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        // System.out.print("Enter the range: ");
        // int n = s.nextInt();
        printprime(6);
        // s.close();
    }
}

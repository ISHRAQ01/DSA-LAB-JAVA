import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total bill amount: ");
        double bill = scanner.nextDouble();
        double discount;

        if (bill < 1000) {
            discount = 0;
        } else if (bill < 5000) {
            discount = 0.05;
        } else if (bill < 10000) {
            discount = 0.10;
        } else if (bill < 20000) {
            discount = 0.15;
        } else {
            discount = 0.25;
        }

        double discountedAmount = bill * discount;
        double finalAmount = bill - discountedAmount;

        System.out.println("Total Bill: " + bill);
        System.out.println("Discount: " + discountedAmount);
        System.out.println("Final Amount: " + finalAmount);
        scanner.close();
    }
}

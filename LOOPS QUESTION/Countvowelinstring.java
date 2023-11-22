import java.util.Scanner;

public class Countvowelinstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int count = 0;
        input = input.toLowerCase(); // Convert the string to lowercase for case-insensitive counting

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        System.out.println("The number of vowels in the string is: " + count);
    }
}


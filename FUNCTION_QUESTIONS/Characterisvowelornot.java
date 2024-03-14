import java.util.Scanner;

public class Characterisvowelornot {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a character: ");
            char ch = scanner.next().charAt(0);
            if (isVowel(ch)) {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is not a vowel.");
            }
            scanner.close();
        }
    
        public static boolean isVowel(char ch) {
            ch = Character.toLowerCase(ch);
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        }
    }

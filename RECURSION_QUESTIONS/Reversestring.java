import java.util.Scanner;

public class Reversestring {
    static String reverse(String s) {
        if (s.length()<1) {
            return s;
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE STRING: ");
        String string = s.nextLine();
        String reversed = reverse(string);
        System.out.println("Reversed string: " + reversed);
        s.close();
    }
}

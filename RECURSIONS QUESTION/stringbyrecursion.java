import java.util.ArrayList;
import java.util.Scanner;
public class stringbyrecursion {
    // Recursive function to generate all subsequences of a string
    static void generateSubsequences(String str, int index, String curr, ArrayList<String> list) {
        // Base case: if the end of the string is reached
        if (index == str.length()) {
            list.add(curr);
            return;
        }

        // Recursive call: include the current character in the subsequence
        generateSubsequences(str, index + 1, curr + str.charAt(index), list);

        // Recursive call: exclude the current character from the subsequence
        generateSubsequences(str, index + 1, curr, list);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE STRING: ");
        String string = s.nextLine();
        generateSubsequences(string, 0, "", list);
        System.out.println(list);
        s.close();
    }
}

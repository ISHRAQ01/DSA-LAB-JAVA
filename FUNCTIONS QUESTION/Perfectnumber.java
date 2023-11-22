import java.util.Scanner;

public class Perfectnumber {
    static void checkperfectnumber() {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO BE CHECKED: ");
        int n = s.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        if (sum == n)
            System.out.println(n + " IS A PERFECT NUMBER");
        else
            System.out.println(n + " IS NOT A PERFECT NUMBER");
        s.close();
    }

    public static void main(String[] args) {
        checkperfectnumber();
    }
}

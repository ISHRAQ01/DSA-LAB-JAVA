import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int first = 0, second = 1, next;
        System.out.println("ENTER THE SEQUENCE NUMBER:");
        int n=s.nextInt();
        for (int i = 0; i < n; i++) {
            if (i <= 1)
                next = i;
            else {
            next = first + second;
            first = second;
            second = next;
            }
            System.out.print(next+"\t");
    }
    s.close();
}
}

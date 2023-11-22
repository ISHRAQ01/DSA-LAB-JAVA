import java.util.Scanner;

public class Trianglepatt {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE RANGE:");
        int rows =s.nextInt();
        for(int i = 0; i <= rows; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}

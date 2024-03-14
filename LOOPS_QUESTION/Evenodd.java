import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER THE NUMBER:");
        int n=sc.nextInt();
        System.out.println(n%2==0?"NUMBER IS EVEN":"NUMBER IS ODD");
        sc.close();

}
}

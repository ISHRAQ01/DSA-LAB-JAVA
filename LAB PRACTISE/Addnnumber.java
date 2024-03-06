import java.util.Scanner;

public class Addnnumber{
    public static void print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.print("\t"+n);
    }
    public static int add(int n){
        if(n==0){
            return 0;
        }
        return n+add(n-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("ENTER THE RANGE: ");
        int n=s.nextInt();
        print(n);
        System.out.println("\nSUM: "+add(n));
        s.close();
    }
}
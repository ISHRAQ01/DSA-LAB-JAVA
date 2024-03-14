import java.util.Scanner;

public class Power {
    static int power(int n,int p){
        if(n==0){
            return 0;
        }
        else if(p==0){
            return 1;
        }
        return n*power(n,p-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER :");
        int n=s.nextInt();
        System.out.println("ENTER THE POWER: ");
        int p=s.nextInt();
        System.out.println(power(n,p));
        s.close();
    }
}


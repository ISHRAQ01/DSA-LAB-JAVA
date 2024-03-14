import java.util.Scanner;

public class Factorialnumber {
    static int factorial(int n){
        if(n<=1)
            return 1;
        return(n*factorial(n-1));
        
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER: ");
        int n=s.nextInt();
        System.out.println("FACTORIAL OF A NUMBER IS: "+factorial(n));
        s.close();
    }
}

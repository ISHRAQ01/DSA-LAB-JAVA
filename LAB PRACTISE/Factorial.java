import java.util.Scanner;

public class Factorial {
    //A PROGRAM FOR FACTORIAL OF A NUMBER
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int n=s.nextInt();
        int fact=1;
        // while(n>0){
        //     fact=n*fact;
        //     n--;
        // }
        for(int i=n;i>0;i--){
            fact=i*fact;
        }
        System.out.println("THE FACTORIAL OF A NUMBER IS: "+fact);
        s.close();
    }
}

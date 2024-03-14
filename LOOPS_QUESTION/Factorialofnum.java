import java.util.Scanner;

public class Factorialofnum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER: ");
        int n=s.nextInt();
        int fact=1;
        while(n>0){
            fact=n*fact;
            n--;       
        }
        System.out.println("FACTORIAL OF A NUMBER IS= "+fact);
        s.close();
}
}

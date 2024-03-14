import java.util.Scanner;

public class Swapp {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE TWO NUMBERS:");
        int a=s.nextInt();
        int b=s.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("NUMBER AFTER SWAP ARE "+"a= "+a+" b= "+b);
        s.close();
    }
    
}

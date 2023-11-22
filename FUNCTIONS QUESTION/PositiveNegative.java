import java.util.Scanner;

public class PositiveNegative {
    static void check(){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO BE CHECKED: ");
        double num=s.nextDouble();
        if(num>0)
            System.out.println("NUMBER "+num+" IS POSITIVE");
        else if(num<0)
            System.out.println("NUMBER "+num+" IS NEGATIVE");
        else
            System.out.println("NUMBER IS ZERO");
        s.close();
    }
    public static void main(String[] args) {
        check();
    }
}

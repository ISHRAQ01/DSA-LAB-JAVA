import java.util.Scanner;

public class Simpleintrest {
        static int get_data(){
            Scanner s=new Scanner(System.in);
            System.out.println("ENTER THE PRINCIPLE AMOUNT: ");
            int p=s.nextInt();
            System.out.println("ENTER THE RATE OF INTREST: ");
            int r=s.nextInt();
            System.out.println("ENTER THE TIME: ");
            int t=s.nextInt();
            int sc=p*r*t;
            s.close();
            return sc;

        }
        static double ai(){
            int a=get_data();
            double s;
            s=a/100;
            return s;
        }
        
    public static void main(String[] args){
        System.out.println("THE SIMPLE INTREST IS= "+ai());
    }
}
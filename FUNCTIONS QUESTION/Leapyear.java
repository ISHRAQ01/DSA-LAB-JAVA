import java.util.Scanner;

public class Leapyear {
    static void leapyear(){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE YEAR: ");
        int year=s.nextInt();
        if(year%4==0 || year%400==0 && year%100!=0){
            System.out.println(year+ " IS A LEAP YEAR");
        }
        else    
            System.out.println(year+ " IS NOT A LEAP YEAR");
        s.close();
    }
    public static void main(String[] args) {
        leapyear();
    }
}

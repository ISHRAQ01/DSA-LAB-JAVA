import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE YEAR:");
        int year=s.nextInt();
        if(year%4==0 || year%400==0){
                if(year%100!=0)
                    System.out.println("THE YEAR "+year+" IS A LEAP YEAR");
        }
        else    
              System.out.println("THE YEAR "+year+" IS A NOT LEAP YEAR");
        s.close();
    }
}
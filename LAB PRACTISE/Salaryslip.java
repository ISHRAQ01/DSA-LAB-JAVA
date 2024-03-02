import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class Salaryslip{
    static void salaryFormat(int sal,Locale l){
        NumberFormat nf=NumberFormat.getCurrencyInstance(l);
        String temp=nf.format(sal);
        System.out.println("THIS IS THE FORMATTED SALARY:" +temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE SELECT YOUR LANGUAGE:");
        System.out.println("ENTER 1 FOR HINDI, 2 FOR ENGLISH, 3 FOR FRENCH");
        int loc = sc.nextInt();
        Locale locale;
        if (loc == 1) {
            locale = Locale.of("hi", "IN");
        } else if (loc == 2) {
            locale =  Locale.of("en", "US");
        } else if (loc == 3) {
            locale =  Locale.of("fr", "FR");
        } else {
            System.out.println("INVALID INPUT, NOW USING ENGLISH AS DEFAULT");
            locale =  Locale.of("en", "US");
        }
        System.out.println("ENTER THE BASIC SALARY: ");
        int n=sc.nextInt();
        salaryFormat(n, locale);
        sc.close();

    }
}


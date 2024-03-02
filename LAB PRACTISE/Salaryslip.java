import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class Salaryslip{
    static void salaryFormat(double sal,Locale l){
        NumberFormat nf=NumberFormat.getCurrencyInstance(l);
        String temp=nf.format(sal);
        System.out.println("THIS IS THE FORMATTED SALARY: " +temp);
    }
    static double hra(double salary){
        return salary*0.3;
    }
    static double da(double salary){
        return salary*0.2;
    }
    static double ta(double salary){
        return salary*0.1;
    }
    static double net_Salary(double salary,double pf){
        return (salary+hra(salary)+da(salary)+ta(salary)-pf);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE SELECT YOUR LANGUAGE:");
        System.out.println("ENTER 1 FOR HINDI, 2 FOR ENGLISH, 3 FOR FRENCH ");
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
        System.out.println("ENTER THE SALARY OF AN EMPLOYEE: ");
        double salary=sc.nextDouble();
        double sal=net_Salary(salary,1500);
        salaryFormat(sal, locale);
        sc.close();

    }
}


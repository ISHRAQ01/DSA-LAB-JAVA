import java.util.Scanner;

public class Employsal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SALALRY OF USER:");
        float a=sc.nextFloat();
        double hra=(a*0.3);
        double ta=a*0.2;
        double da=a*0.1;
        int pf=1500;
        double net_Salary=a+hra+ta+da-pf;
        System.out.println("NET SALARY IS "+net_Salary);
        sc.close();


    }
}

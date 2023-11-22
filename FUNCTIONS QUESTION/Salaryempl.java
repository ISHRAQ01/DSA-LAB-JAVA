import java.util.Scanner;

public class Salaryempl {
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
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE SALARY OF AN EMPLOYEE: ");
        double salary=s.nextDouble();
        System.out.println("THE NET_SALARY OF AN EMPLOYEE : "+net_Salary(salary,1500));
        s.close();
    }
}

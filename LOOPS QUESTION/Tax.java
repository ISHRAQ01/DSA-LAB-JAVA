import java.util.Scanner;

public class Tax  {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE SALARY:");
        double income=s.nextDouble();
        double tax=0;
        if (income <= 10000) {
            tax = 0;
        } else if (income <= 20000) {
            tax = income * 0.10;
        } else if (income <= 30000) {
            tax = income * 0.15;
        } else {
            tax = income * 0.25;
        }
        System.out.println("THE SALARY AFTER TAX IS= "+tax);
        s.close();
}
}

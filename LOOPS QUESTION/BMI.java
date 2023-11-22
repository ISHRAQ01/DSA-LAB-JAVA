import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE HEIGHT(in meter) AND BODY WEIGHT(in kg): ");
        float height=sc.nextFloat();
        float weight=sc.nextFloat();
        float bmi=(weight)/(height*height);
        System.out.println("THE BODY MASS INDEX IS = "+bmi);
        sc.close();
    }
    
}

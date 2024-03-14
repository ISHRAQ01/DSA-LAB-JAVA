import java.util.Scanner;

public class Gradeofstudent {
    static void grade(){
        Scanner s=new Scanner(System.in);   
        System.out.println("ENTER THE PERCENTAGE OF A USER:");
        double n=s.nextDouble();
        System.out.print("GRADE OF A USER IS:= ");
        if(n>=90)
            System.out.println("A");
        else if(n>=70 && n<=89)
            System.out.println("B");
        else if(n>=50 && n<=69)
            System.out.println("C");
        else
            System.out.println("D");
        s.close();
    }
    public static void main(String[] args) {
        grade();
    }
}

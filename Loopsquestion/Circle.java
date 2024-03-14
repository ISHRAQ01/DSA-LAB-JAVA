import java.util.Scanner;
public class Circle {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE RADIUS OF A CIRCLE:");
        int r=s.nextInt();
        System.out.println("AREA OF CIRCLE IS= "+3.14*r*r);
        s.close();
    }
    
}

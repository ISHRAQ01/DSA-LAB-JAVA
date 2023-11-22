import java.util.Scanner;

public class Areaandperameter {
    static void area(){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE LENGHT AND BREADTH OF A RECTANGLE: ");
        float l=s.nextFloat();
        float b=s.nextFloat();
        System.out.println("AREA OF A RECATANGLE IS= "+(l*b));
        s.close();
    }
    static void perameter(){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE LENGHT AND BREADTH OF A RECTANGLE: ");
        float l=s.nextFloat();
        float b=s.nextFloat();
        System.out.println("AREA OF A RECATANGLE IS= "+(l+b));
        s.close();
    }
    public static void main(String[] args) {
        area();
        perameter();
    }
}

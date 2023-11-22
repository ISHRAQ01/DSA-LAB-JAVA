import java.util.Scanner;

public class Checktriangel {
    static void check(){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE THREE SIDE OF A TRIANGLE: ");
        float a=s.nextFloat();
        float b=s.nextFloat();
        float c=s.nextFloat();
        if(a==b && b==c)
            System.out.println("TRIANLGE IS EQUILATERAL TRIANGLE");
        else if(a==b || a==c || b==c)
            System.out.println("TRIANGLE IS A ISOSCELESE TRIANLGE");
        else    
            System.out.println("TRIANGLE IS AN SCALENE");
        s.close();
    }
    public static void main(String[] args) {
        check();
    }
}

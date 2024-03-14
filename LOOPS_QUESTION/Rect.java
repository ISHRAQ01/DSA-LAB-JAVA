import java.util.Scanner;

public class Rect {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE LENGTH AND BREADTH OF RECTANGLE:");
        int l=s.nextInt();
        int b=s.nextInt();
        System.out.println("AREA OF RECTANGLE IS= "+l*b);
        s.close();
    }
    
}

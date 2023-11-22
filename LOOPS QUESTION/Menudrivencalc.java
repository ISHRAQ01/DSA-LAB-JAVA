import java.util.Scanner;

public class Menudrivencalc {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE CHOICE\n1.ADDITION:\n2.SUBTRACTION\n3.MULTIPLICATION:\n4.DIVISION:\n:");
        int choice=s.nextInt();
        System.out.println("ENTER THE TWO NUMBER:");
        int x=s.nextInt();
        int y=s.nextInt();
        switch(choice){
            case 1:
                System.out.println("AFTER ADDITION RESULT IS= "+(x+y));
                break;
            case 2:
                 System.out.println("AFTER SUBTRACTION RESULT IS= "+(x-y));
                break;
            case 3:
                 System.out.println("AFTER MULTIPLICATION RESULT IS= "+(x*y));
                break;
            case 4:
                System.out.println("AFTER DIVISION RESULT IS= "+(x/y));
                break;
            default:
                System.out.println("WRONG CHOICE");
        }
        s.close();
    }
    
}

import java.util.Scanner;

public class Swapvalue {
    static void swap(){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBRE: ");
        int a=s.nextInt();
        System.out.println("ENTER THE SECOND NUMBER: ");
        int b=s.nextInt();
        System.out.println("NUMBER BEFORE SWAP ARE: "+a+","+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("NUMBER AFTER SWAP ARE: "+ a +","+ b );
        s.close();
    }
    static void swap2(){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBRE: ");
        int a=s.nextInt();
        System.out.println("ENTER THE SECOND NUMBER: ");
        int b=s.nextInt();
        System.out.println("NUMBER BEFORE SWAP ARE: "+a+","+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("NUMBER AFTER SWAP ARE: "+ a +","+ b );
        s.close();
    }
    static void swap3(){
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBRE: ");
        int a=s.nextInt();
        System.out.println("ENTER THE SECOND NUMBER: ");
        int b=s.nextInt();
        System.out.println("NUMBER BEFORE SWAP ARE: "+a+","+b);
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("NUMBER AFTER SWAP ARE: "+ a +","+ b );
        s.close();
    }

    public static void main(String[] args) {
        swap();//by using addtion,subtraction
        swap2();//by using bitwise operator
        swap3();//by using mutiply and divide
    }
}

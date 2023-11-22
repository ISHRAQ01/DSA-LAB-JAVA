import java.util.Scanner;

public class New {
    public static void main(String[] args){
        //even odd
        //greatest among 3
        //variable swap
        //area of rectangle
        //area of circle
        //1//
        // Scanner sc=new Scanner(System.in);
        // System.out.println("ENTER THE NUMBER:");
        // int n=sc.nextInt();
        // System.out.println(n%2==0?"NUMBER IS EVEN":"NUMBER IS ODD");
        //2//
        // Scanner s=new Scanner(System.in);
        // System.out.println("ENTER THE THREE NUMBERS:");
        // int a=s.nextInt();
        // int b=s.nextInt();
        // int c=s.nextInt();
        // System.out.println(a>b?(a>c?"NUMBER\t"+a+"\tIS GREARER":"NUMBER\t"+""+c+"\tIS GREATER"):(b>c?"NUMBER\t"+b+"\tIS GREATER":"NUMBER\t"+c+"\tIS GREATER"));
        //3//
        Scanner s=new Scanner(System.in);
        // System.out.println("ENTER THE TWO NUMBERS:");
        // int a=s.nextInt();
        // int b=s.nextInt();
        // a=a+b;
        // b=a-b;
        // a=a-b;
        // System.out.println("NUMBER AFTER SWAP ARE "+"a= "+a+" b= "+b);
        //4//
        // System.out.println("ENTER THE LENGTH AND BREADTH OF RECTANGLE:");
        // int l=s.nextInt();
        // int b=s.nextInt();
        // System.out.println("AREA OF RECTANGLE IS= "+l*b);
        //5//
        System.out.println("ENTER THE RADIUS OF A CIRCLE:");
        int r=s.nextInt();
        System.out.println("AREA OF CIRCLE IS= "+3.14*r*r);
        s.close();
}
}

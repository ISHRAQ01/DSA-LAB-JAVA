import java.util.Scanner;

public class Greater {
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE THREE NUMBERS:");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        System.out.println(a>b?(a>c?"NUMBER\t"+a+"\tIS GREARER":"NUMBER\t"+""+c+"\tIS GREATER"):(b>c?"NUMBER\t"+b+"\tIS GREATER":"NUMBER\t"+c+"\tIS GREATER"));
    
    s.close();
}
}

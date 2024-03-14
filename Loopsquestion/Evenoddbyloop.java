import java.util.Scanner;

public class Evenoddbyloop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE RANGE:");
        int ch=s.nextInt();
        for(int i=0;i<=ch;i++){
            if(i%2==0)
                System.out.println(i+" IS A EVEN NUMBER");
            else
                System.out.println(i+" IS A ODD NUMBER");
        }
        s.close();
    }
    
    
}

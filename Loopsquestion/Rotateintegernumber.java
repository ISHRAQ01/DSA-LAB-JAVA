import java.util.Scanner;

public class Rotateintegernumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int n=s.nextInt();
        System.out.println("ENTER THE NUMBER OF ROTATES:");
        int r=s.nextInt();
        int len=0;
        int i=1;
        int temp1=n;
        int temp=0;
        int div=1;
        while(temp1>0){

            temp1/=10;
            len++;
        }
        r=r%len;
        while(len>1){
            div*=10;
            len--;
        }
        System.out.println("ROTATIONS ARE= ");
        while(r>0){
            temp=n%10;
            n=n/10;
            n=temp*div+n;
            r--;
            System.out.println(i+"= "+n);
            i++;
        }
    s.close();
    }
}

import java.util.Scanner;

public class Evenoddinnumber {
    static void evenodd() {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE RANGE: ");
        int n = s.nextInt();
        int temp=0;
        while(n>0){
            temp=n%10;
            if(temp%2==0)
                System.out.println("EVEN NUMBER IS "+temp);
            else    
                System.out.println("ODD NUMBER IS "+temp);
            n=n/10;
            
        }
        s.close();
    }
    public static void main(String[] args) {
        evenodd();
    }
}

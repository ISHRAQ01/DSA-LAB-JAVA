import java.util.Scanner;

class Reverse{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int n=s.nextInt();
        int r=0;
        while(n!=0){
            r=r*10+n%10;
            n/=10;
        }
        System.out.println("REVERSE OF A NUMBER IS:"+r);
        s.close();
    }
}
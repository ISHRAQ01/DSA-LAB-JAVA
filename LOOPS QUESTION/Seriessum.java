import java.util.Scanner;

public class Seriessum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE RANGE:");
        int n=s.nextInt();
        int sum=0;
        while(n>0){
            sum+=n*n;
            n--;
        }
        System.out.println("SUM OF SERIES IS: "+sum);
        s.close();
    }
}

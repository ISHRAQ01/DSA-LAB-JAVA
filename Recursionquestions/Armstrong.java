import java.util.Scanner;

public class Armstrong {
    static int power(int n,int p){
        if(n==0){
            return 0;
        }
        else if(p==0){
            return 1;
        }
        return n*power(n,p-1);
    }
    static int digit(int n,int count){
        if(n==0)
            return count;
        count+=1;
        return digit(n/10,count);
    }
    static int armstrong(int n, int sum,int t) {
            if (n <= 0) {
                return sum;
            }
            sum+=power(n%10,t);
            return armstrong(n / 10, sum,t);
            
            
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER: ");
        int n=s.nextInt();
        int r=digit(n,0);
        int sum=armstrong(n,0,r);
        if(sum==n){
            System.out.println("NUMBER "+n+" IS A ARMSTRONG NUMBER");
        }
        else    
            System.out.println("NUMBER "+n+" IS NOT A ARMSTRONG NUMBER");
        s.close();
    }
}

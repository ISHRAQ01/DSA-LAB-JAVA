import java.util.Scanner;

class Armstrong{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int n=s.nextInt();
        int digit=n;
        int temp=n;
        int c=0;
        while(temp!=0){
            temp/=10;
            c+=1;
        }
        temp=n;
        int sum=0;
        while(temp!=0){
            int rem=temp%10;
            temp/=10;
            sum+=Math.pow(rem,c);

        }
        if(digit==sum){
            System.out.println("ARMSTRONG NUMBER");
        }
        else{
            System.out.println("NOT AN ARMSTRONG NUMBER");
        }
        s.close();
    }
}
import java.util.Scanner;

class Onetwopattern{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int n=s.nextInt();
        int m=2;
        for(int i=1;i<n;i++){
            for(int a=i;a<n-1;a++){
                System.out.print(" ");
            }
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            for(int k=i;k>=2;k--){
                System.out.print(m++);
            }
            m=2;
            System.out.println();
        }
        s.close();
        
    }
}
import java.util.Scanner;
public class Rotate {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int n=a.length;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NO OF ROTATES");
        int q=sc.nextInt();
        while(q!=0){
            int temp=a[a.length-1];
            for (int j = n-2; j >=0; j--) {
                a[j+1]=a[j];
            }
            a[0]=temp;
            q=q-1;  
            System.out.print("{");
            for (int j = 0; j < a.length; j++) {
                if(j==a.length-1)
                    System.out.print(a[j]+"}");
                else
                    System.out.print(a[j]+",");
            }
            System.out.println();    
            
    }
    sc.close();
}
}


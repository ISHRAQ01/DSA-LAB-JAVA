import java.util.Scanner; 
public class Max2d {
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the elements");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(max<a[i][j]){
                    max=a[i][j];
                }
                if(min>a[i][j])
                    min=a[i][j];
            }
            
        }
        int temp=max;
        max=min;
        min=temp;
        

        System.out.println("MAX ELEMENT IS="+max+"MINIMUM ELEMENT IS="+min);
        sc.close();
    }
}

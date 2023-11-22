import java.util.Scanner;
public class Arraydemo {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        // int arr[]={1,2,3,4,5};
        // int[] arr2={1,2,3,4,5};
        int dy[]=new int[6];
        System.out.println("ENTER THE NUMBER:");
        for (int i = 0; i < dy.length; i++) {
            dy[i]=s.nextInt();
        }
        for (int i = 0; i < dy.length; i++) {
            System.out.print(dy[i]+" ");
        }
        s.close();
    }
}

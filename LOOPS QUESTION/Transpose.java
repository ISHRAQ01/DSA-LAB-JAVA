import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        int[][] a=new int[3][3];
        int[][] t=new int[3][3];
        
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE ELEMENTS OF AN ARRAY:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                t[i][j]=a[j][i];
            }
        }
        System.out.println("ORIGINAL MATRIX IS");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+a[i][j]+"\t");
            }  
            System.out.println();
        }
        System.out.println("TRANSPOSE MATRIX IS");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+t[i][j]+"\t");
            }  
            System.out.println();
        }
        sc.close();
}

}

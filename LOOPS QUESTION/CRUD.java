import java.util.Scanner;

public class CRUD {
    static void arraycreate(int a[], int n) { // CREATING AN ARRAY
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("ENTER THE ELEMENT OF ARRAY:" + (i + 1));
            a[i] = sc.nextInt();
        }
        sc.close();
    }

    static void read(int a[], int n) { // READING AN ARRAY
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void update(int a[], int index, int num, int n) { // UPDATING AN ARRAY
        for (int i = n - 1; i >= index; i--) {
            a[i + 1] = a[i];
        }
        a[index] = num;
    }

    static int delete(int a[], int in, int n) {
        int x;
        x = a[in];
        for (int i = in; i < n; i++) {
            a[i] = a[i + 1];
        }
        return x;
    }

    public static void main(String[] args) { // MAIN FUNCTION
        char ch;
        System.out.println("ENTER THE NO OF ITEMS IN ARRAY:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[100];
        do {
            System.out.println("1.CREARE AN ARRAY\n2.READ AN ARRAY:\n3.UPDATE:\n4.DELETE:");
            int c = sc.nextInt();
            switch (c) {
                case 1:
                    arraycreate(a, n);
                    break;
                case 2:
                    read(a, n);
                    break;
                case 3:
                    System.out.println("ENTER THE INDEX AND THE NUMBER:");
                    int index = sc.nextInt();
                    int num = sc.nextInt();
                    update(a, index, num, n);
                    n = n + 1;
                    break;
                case 4:
                    System.out.println("ENTER THE INDEX:");
                    int in = sc.nextInt();
                    System.out.print(delete(a, in, n));
                    n = n - 1;
                    break;
                default:
                    System.out.println("WRONG CHOICE");
            }
            System.out.print("\nDO YOU WISH TO CONTINUE:(YES(Y)/NO(N))");
            ch = sc.next().charAt(0);
        } while (ch == 'y');
        sc.close();
    }

}

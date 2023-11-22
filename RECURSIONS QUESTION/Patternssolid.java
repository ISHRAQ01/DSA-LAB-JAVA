import java.util.Scanner;

public class Patternssolid {
    static void printcol(int col) {
        if (col == 0) {
            return;
        }
        System.out.print("*");
        printcol(col - 1);
    }

    static void printstar(int row, int col) {
        if (row == 0) {
            return;
        }
        printcol(col);
        System.out.println();
        printstar(row - 1, col);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int row = s.nextInt();
        printstar(row,row);
        s.close();
    }

}

import java.util.Scanner;
   
public class Evennumber {
     static void Printnumber(int n){
        if(n<0){
            return;

        }
        System.out.println(n);
        Printnumber(n-2);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int n=s.nextInt();
        Printnumber(n);
        s.close();
    }
}

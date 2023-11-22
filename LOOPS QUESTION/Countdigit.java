import java.util.Scanner;

public class Countdigit {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print(("Enter the number:  "));
        int num = s.nextInt();
        int count = 0;
        while(num>0){

            num/=10;
            count++;
        }
  
        
        System.out.println("Total digits are: "+count);
        s.close();
    }
}
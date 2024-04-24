import java.lang.Exception;
import java.util.Scanner;

public class Dlregistration {
    static void Dl(int age,String name) throws Exception{
        if(age>18){
            System.out.println(name+" is eligible for driving.");
        }
        else{
    
            throw new Exception();
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NAME OF A PERSON: ");
        String name=s.nextLine();
        System.out.println("ENTER THE AGE OF A PERSON: ");
        int age=s.nextInt();
        try {
            Dl(age,name);
        } catch (Exception e) {
            System.out.println("The person is not eligible for driving.");
        }
        s.close();
       
    }
}

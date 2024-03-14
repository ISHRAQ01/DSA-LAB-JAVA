import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NAME: ");
        String name=s.nextLine();
        System.out.println("ENTER THE CLASS: ");
        String cls=s.nextLine();
        String a[]={"HINDI","ENGLISH","MATHS","PHYSICS","CHEMISTRY"};
        float marks[]=new float[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("ENTER THE MARKS OF "+a[i]+ " SUBJECT");
            marks[i]=s.nextFloat();
            while(marks[i]>100){
                System.out.println("MARKS CANNOT BE GREATER THEN 100 ENTER AGAIN\n");
                System.out.println("ENTER THE MARKS OF "+a[i]+ " SUBJECT");
                marks[i]=s.nextFloat();
            }
        }
        float average=0;
        for (int i = 0; i < marks.length; i++) {
            average+=marks[i]; 
        }
        System.out.println("NAME = "+name);
        System.out.println("CLASS = "+cls);
        System.out.println("SUBJECTS MARKS ARE =");
        for (int i = 0; i <5; i++) {
            System.out.println(a[i]+"="+marks[i]);
        }
        System.out.println("PERCENTAGE OF MARKS ARE= "+(average/500*100));
        s.close();
    }

    
}

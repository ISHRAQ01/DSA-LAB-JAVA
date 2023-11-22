import java.util.Scanner;

public class Insuranceofauser {
    static int insurance(){
        int in=0;
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE PERSON NAME:");
        String name=s.nextLine();
        System.out.println("ENTER THE PERSON GENDER:");
        String gender=s.nextLine();
        System.out.println("ENTER THE PERSON AGE:");
        int age=s.nextInt();
        s.nextLine();
        System.out.println("ENTER THE PERSON CITY(METRO OR NON METRO):");
        String city=s.nextLine();
        if(age>=25 && age<=35 && gender.equals("MALE") &&city.equals("METRO"))
            in=6;
        else if(age>=25 && age<=35 && gender.equals("MALE") &&city.equals("NONMETRO"))
            in=4;
        else if(age>=25 && age<=35 && gender.equals("FEMALE") &&city.equals("METRO"))
            in=3;
        else if(age>=25 && age<=35 && gender.equals("FEMALE") &&city.equals("NONMETRO"))
            in=2;
        else
            System.out.println("PERSON IS NOT INSURED");
        s.close();
        System.out.println("INSURANCE PREMIUM OF "+name+" IS");
        return in;


    }
    public static void main(String[] args) {
        int n=insurance();
        System.out.println(n+"%");
    }
}

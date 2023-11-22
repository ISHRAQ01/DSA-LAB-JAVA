import java.util.Scanner;

public class Celsiustofarenhiet {
    static void farenheit(float fer) {
        double car = ((fer - 32) * 5) / 9;
        System.out.println("THE CELSIUS TEMPERATURE IS =" + car + "c");
    }
    static void celsius(float cel) {
        double far = ((cel * 9) / 5) + 32;
        System.out.println("THE FARENHEIT TEMPERATURE IS =" + far + "f");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE TEMPERATURE IN CELSIUS:");
        float cel = sc.nextFloat();
        celsius(cel);
        System.out.println("ENTER THE TEMPERATURE IN FARENHEIT:");
        float fer = sc.nextFloat();
        farenheit(fer);
        sc.close();
    }
}

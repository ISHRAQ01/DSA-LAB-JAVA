import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE MONTH: ");
        String month = s.nextLine();
        switch (month) {
            case "January":
                System.out.println("Winter");
                break;
            case "February":
                System.out.println("Winter");
                break;
            case "March":
                System.out.println("Winter");
                break;
            case "April":
                System.out.println("Summer");
                break;
            case "May":
                System.out.println("Summer");
                break;
            case "June":
                System.out.println("Summer");
                break;
            case "July":
                System.out.println("Summer");
                break;
            case "August":
                System.out.println("Summer");
                break;
            case "September":
                System.out.println("Spring");
                break;
            case "October":
                System.out.println("Spring");
                break;
            case "November":
                System.out.println("Winter");
                break;
            case "December":
                System.out.println("Winter");
                break;

            default:
                break;
        }

        s.close();

    }
}
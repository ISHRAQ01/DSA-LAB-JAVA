import java.util.Scanner;

public class SimpleAtm {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE CHOICE\n1.CHECK BALANCE\n2.DEPOSIT MONEY\n3.WITHDRAW MONEY\n4.EXIT\n");
        int ch=s.nextInt();
        int balance=0;
        switch(ch){
            case 1:
                System.out.println("YOUR BALANCE IS= "+balance);
                break;
            case 2:
                System.out.println("ENTER THE AMOUNT TO BE DEPOSIT= ");
                float amount=s.nextFloat();
                balance+=amount;
                System.out.println("YOUR BALANCE BECOMES= "+balance);
                break;
            case 3:
                System.out.println("ENTER THE AMOUNT TO BE WITHDRAWN= ");
                float am=s.nextFloat();
                if(am<=balance){
                    System.out.println("YOUR AMOUNT "+am+" IS WITHDRAWN");
                    System.out.println("YOUR REMAINING BALANCE IS= "+(balance-am));
                }
                else
                    System.out.println("YOUR AMOUNT CANNOT BE WITHDRAWN INVALID BALANCE");
                break;
            case 4:
                break;
            default:
                System.out.println("WRONG CHOICE");
            }
            s.close();
}
}

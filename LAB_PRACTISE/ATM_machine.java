import java.util.*;
import com.demo.Account;
import com.demo.User;

public class ATM_machine {
    public static void main(String[] args) throws Exception {
        int[] accounts = {1254, 6325, 8547, 9654, 6327};
        User[] users = {
            new User("Ramesh", new Account(accounts[0], 1000)),
            new User("Mukesh", new Account(accounts[1], 1000)),
            new User("Suresh", new Account(accounts[2], 10000)),
            new User("Ganesh", new Account(accounts[3], 1000)),
            new User("Mahesh", new Account(accounts[4], 1000))
        };
        Scanner scanner = new Scanner(System.in);
        int AccNo,index=-1;
        boolean Registerd = false;
        // enter account
        System.out.print("Enter Account No: ");
        AccNo = scanner.nextInt();
        for (int element : accounts) {
            index++;
            if (element == AccNo) {
                Registerd = true;
                break;
            }
        }
        if (!Registerd) {
            System.out.println("Invalid Account Number. ");
        } else {
            while (true) {

                int Choice,amount;
                System.out.println("Choose Options\n1. Show Details \n2. Deposite \n3. Withdraw \n4. ShowBalance \n5. Exit");
                Choice = scanner.nextInt();
                switch (Choice) {
                    case 1:
                        users[index].AccDetails();
                        break;
                    case 2:
                    System.out.print("Enter Amount to Deposite: ");
                        amount = scanner.nextInt();
                        users[index].deposit(amount);
                        break;
                    case 3:
                    System.out.print("Enter Amount to Withdraw: ");
                        amount = scanner.nextInt();
                        users[index].debit(amount);
                        break;
                    case 4:
                        users[index].showBal();
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        break;
                }

            }
        }
        scanner.close();
    }
}


    


import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number and balance: ");
        String accnum = sc.next();
        double balance = sc.nextDouble();
        new account(accnum, balance);
        sc.close();

    }
}

class account {
    account(String accnum, double balance) {
        if (accnum == null || accnum.isEmpty()) {
            System.out.println("Error:Account number should not be null or empty");
            return;
        }
        if (balance < 0) {
            System.out.println("Error:Balance should not be negative");
            return;
        }
        System.out.println("Account Successfully created");
    }
}

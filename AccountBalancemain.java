import java.util.Scanner;

public class AccountBalancemain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ;
        System.out.println("Enter the number of accounts: ");
        int num = sc.nextInt();
        AccountBalance[] obj = new AccountBalance[num];
        long accNum;
        long accBal;
        for (int i = 0; i < num; i++) {
            accNum = sc.nextLong();
            accBal = sc.nextLong();
            obj[i] = new AccountBalance();
            obj[i].setAccNum(accNum);
            obj[i].setAccBal(accBal);
        }
        System.out.println("Enter the Account num to display balance: ");
        long AccNum = sc.nextLong();
        for (int i = 0; i < num; i++) {
            if (obj[i].getAccNum() == AccNum) {
                System.out.println(obj[i].getAccBal());
                break;
            } else {
                System.out.println("Account number doesn't exist");
                break;
            }
        }
        sc.close();
    }
}

class AccountBalance {
    private long accNum;
    private long accBal;

    public long getAccNum() {
        return accNum;
    }

    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }

    public long getAccBal() {
        return accBal;
    }

    public void setAccBal(long accBal) {
        this.accBal = accBal;
    }

}

import java.util.Scanner;

public class MoneyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rupees and paisa : ");
        double r1 = sc.nextDouble();
        double r2 = sc.nextDouble();
        money m1 = new money();
        money m2 = new money();
        m1.setRupees(r1);
        m2.setRupees(r2);
        m1.PrintSum(m2);
        sc.close();

    }
}

class money {
    private double rupees;

    public void setRupees(double rupees) {
        this.rupees = rupees;
    }

    public double getRupees() {
        return rupees;
    }

    void PrintSum(money obj) {
        double tot=(this.rupees + obj.getRupees());
        System.out.printf("Total : %.2f\n" ,tot );
    }
}

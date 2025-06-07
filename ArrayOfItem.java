
import java.util.Scanner;

public class ArrayOfItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numnber of details: ");
        int num = sc.nextInt();
        ItemType[] obj = new ItemType[num];
        String name;
        double cost, deposit;
        for (int i = 0; i < num; i++) {
            name = sc.next();
            cost = sc.nextDouble();
            deposit = sc.nextDouble();
            obj[i] = new ItemType(name, cost, deposit);
        }
        System.out.println("Enter the target to search: ");
        String target = sc.next();
        ArrayOfItem a = new ArrayOfItem();
        for (int i = 0; i < num; i++) {
            a.search(target, obj[i].getName(), obj[i].getCost(), obj[i].getDeposit());
        }
        for (int i = 0; i < num; i++) {
            obj[i].display();
        }
        sc.close();
    }

    void search(String target, String name, double cost, double deposit) {
        if (target.equals(name)) {
            System.out.printf("%s %.1f %.1f\n", name, cost, deposit);
        }

    }
}

class ItemType {
    private String name;
    private double cost, deposit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public ItemType(String name, double cost, double deposit) {
        this.name = name;
        this.cost = cost;
        this.deposit = deposit;
    }

    ItemType() {

    }

    void display() {
        System.out.printf("%s %.1f %.1f\n", name, cost, deposit);
    }

}

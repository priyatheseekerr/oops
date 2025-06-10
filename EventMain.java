import java.util.Scanner;

public class EventMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("name of the event,even details,owner name: ");
        String name = sc.nextLine();
        String detail = sc.nextLine();
        String ownerName = sc.nextLine();
        System.out.println("Enter the num 1 for exhibition and num 2 for stage Event: ");
        int num = sc.nextInt();
        if (num == 1) {
            Exhibition e = new Exhibition(name, detail, ownerName);
            System.out.println("Enter number of stalls: ");
            int n = sc.nextInt();
            e.display(n);
        } else {
            stage s = new stage(name, detail, ownerName);
            System.out.println("Enter number of shows and num of seats per show: ");
            s.display(sc.nextInt(), sc.nextInt());
        }
        sc.close();

    }
}

class event {
    protected String name, details, ownerName;

    event(String name, String details, String ownerName) {
        this.name = name;
        this.details = details;
        this.ownerName = ownerName;
    }
}

class Exhibition extends event {
    Exhibition(String name, String details, String ownerName) {
        super(name, details, ownerName);
    }

    void display(int num) {
        double res=num * 10000;
        System.out.println(res);
    }
}

class stage extends event {

    stage(String name, String details, String ownerName) {
        super(name, details, ownerName);

    }

    void display(int numOfShows, int numOfSeats) {
        double res=numOfSeats * numOfSeats * 50;
        System.out.println(res);
    }

}

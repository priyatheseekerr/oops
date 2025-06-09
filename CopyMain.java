import java.util.Scanner;

public class CopyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.next();
        System.out.println("Enter the rolllno: ");
        int rollNo = sc.nextInt();
        Copy c1 = new Copy(name, rollNo);
        Copy c2 = new Copy(c1);
        c1.display();
        c2.display();
        sc.close();

    }
}

class Copy {
    String name;
    int rollNo;

    Copy(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    Copy(Copy c) {
        name = c.name;
        rollNo = c.rollNo;
    }

    void display() {
        System.out.println("Name: " + name + "Roll no: " + rollNo);
    }
}

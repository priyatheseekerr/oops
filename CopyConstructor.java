
import java.util.Scanner;

public class CopyConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rollno and name: ");
        int rollno = sc.nextInt();
        String name = sc.next();
        copy obj = new copy(name, rollno);
        copy obj1 = new copy(obj);
        obj.display();
        obj1.display();
        sc.close();
    }
}

class copy {
    String name;
    int rollno;

    copy(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    copy(copy c) {
        name = c.name;
        rollno = c.rollno;
    }

    void display() {
        System.out.println(rollno + " " + name);
    }
}

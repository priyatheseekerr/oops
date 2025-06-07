import java.util.Scanner;

public class StallMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string name: ");
        String name = sc.next();
        System.out.println("Enter the details: ");
        String detail = sc.next();
        new stall();
        new stall(name, detail);
        sc.close();
    }
}

class stall {
    String name, detail;

    stall() {
        System.out.println("Using defaul constructor");
    }

    stall(String name, String detail) {
        this.name = name;
        this.detail = detail;
        System.out.println("Using parameterized constructor");
        System.out.println(name);
        System.out.println(detail);
    }
}

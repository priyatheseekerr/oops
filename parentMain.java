import java.util.Scanner;

public class parentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int l = sc.nextInt();
        int l1 = sc.nextInt();
        parent p = new parent();
        p.m1();
        p.m2(l);
        child c = new child();
        c.m1();
        c.m2(l1);
        sc.close();
    }
}

class parent {
    void m1() {
        System.out.println("From parent m1()");
    }

    void m2(int n) {
        System.out.println(n);
    }
}

class child extends parent {
    void m1() {
        System.out.println("From child m1()");
    }

    void m2(int n) {
        System.out.println(n);
    }
}
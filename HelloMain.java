import java.util.Scanner;

public class HelloMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        hello h = new hello();
        h.sayHello();
        h.sayHello(str);
        sc.close();

    }
}

class hello {
    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayHello(String str) {
        System.out.println("hello " + str);
    }
}

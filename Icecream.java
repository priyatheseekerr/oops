import java.util.Scanner;

public class Icecream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String values = sc.nextLine();
        String[] v = values.split(" ");
        checkIcecream c = new checkIcecream();
        if (v.length == 2) {
            int h = Integer.parseInt(v[1]);
            int r = Integer.parseInt(v[0]);
            c.quantity(h, r);
        } else {
            int r = Integer.parseInt(v[0]);
            c.quantity(r);
        }
        sc.close();
    }
}

class checkIcecream {
    void quantity(int h, int r) {
        double result = (1.0 / 3) * Math.PI * r * r * h;
        System.out.printf("%.2f\n", result);
    }

    void quantity(int r) {
        double result = (4.0 / 3) * 3.14 * (r * r * r);
        System.out.printf("%.2f\n", result);
    }
}
import java.util.Scanner;

public class wallMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the wall 1 dimensions: ");
        double len1 = sc.nextDouble();
        double height1 = sc.nextDouble();
        wall w1 = new wall(len1, height1);
        double len2 = sc.nextDouble();
        double height2 = sc.nextDouble();
        wall w2 = new wall(len2, height2);
        System.out.print("Area of wall 1: ");
        w1.calArea();
        System.out.println();
        System.out.print("Area of wall 2: ");
        w2.calArea();
        sc.close();

    }
}

class wall {
    double len, height;

    wall(double len, double height) {
        this.len = len;
        this.height = height;
    }

    void calArea() {
        System.out.print(len * height);
    }
}

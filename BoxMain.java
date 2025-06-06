import java.util.Scanner;

public class BoxMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width ,heigth and depth of the box");
        double width = sc.nextDouble(), height = sc.nextDouble(), depth = sc.nextDouble();
        box obj = new box(width, height, depth);
        if (width == 0 || height == 0 || depth == 0) {
            System.out.println("Invalid");
        } else {
            obj.calcBox();
        }
        sc.close();

    }
}

class box {
    private double width, height, depth;

    box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    void calcBox() {
        System.out.println(width * height * depth);
    }
}

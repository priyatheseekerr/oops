import java.util.Scanner;

public class PointMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number in integer: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        new point(x,y).display();;
        System.out.println("Enter the number in double: ");
        double X=sc.nextDouble();
        double Y=sc.nextDouble();
        new point(X,Y).display();
        sc.close();
    }
}
class point{
    int x,y;
    double X,Y;
    point(int x,int y){
        this.x=x;
        this.y=y;
    }
    point(double x,double y){
        this.X=x;
        this.Y=y;
    }
    void display(){
        System.out.println("Point(x,y): "+x+" "+y);
    }
}


import java.util.Scanner;

public class HikeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int len = sc.nextInt();
        calc[] obj = new calc[len];
        int id;
        String name;
        double salary;
        for (int i = 0; i < len; i++) {
            id = sc.nextInt();
            name = sc.next();
            salary = sc.nextDouble();
            obj[i] = new calc(id, name, salary);
        }
        System.out.println("Enter the salary hike amount: ");
        double hike=sc.nextDouble();
        for(int i=0;i<len;i++){
            obj[i].avg(hike);
        }
        sc.close();

    }
}

class calc {
    int id;
    String name;
    double salary;

    calc(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void avg(double hike) {
        if (salary < hike) {
            System.out.println("ID :" + id);
            System.out.println("NAME: " + name);
            System.out.println("SALARY: " + salary);
        }
    }
}

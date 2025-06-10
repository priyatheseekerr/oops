import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee id: ");
        int id = sc.nextInt();
        System.out.println("Enter employee salary: ");
        double salary = sc.nextDouble();
        // new Employee(id,salary);
        EmployeeLevel c = new EmployeeLevel(id, salary);
        c.leveCheck();
        sc.close();

    }
}

class Employee {
    int id;
    double salary;

    Employee(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }
}

class EmployeeLevel extends Employee {
    EmployeeLevel(int id, double salary) {
        super(id, salary);

    }

    void leveCheck() {
        int level = 0;
        if (super.salary < 100) {
            level = 2;
        } else {
            level = 1;
        }
        System.out.println("Id: " + super.id + " " + "Salary: " + super.salary + " " + "Level: " + level);
    }
}
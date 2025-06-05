
import java.util.Scanner;

public class ProfessorSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of professorr: ");
        int num = sc.nextInt();
        System.out.println("enter id,name,dept,age and salary: ");
        String id, name, age, dept;
        double salary;
        salarycalc[] obj = new salarycalc[num];
        for (int i = 0; i < num; i++) {
            id = sc.next();
            name = sc.next();
            age = sc.next();
            dept = sc.next();
            salary = sc.nextDouble();
            obj[i] = new salarycalc(id, name, age, dept, salary);
        }
        salarycalc high = obj[0];
        for (int i = 1; i < num; i++) {
            if (obj[i].salary > high.salary) {
                high = obj[i];
            }
        }
        System.out.println("The highest salary person details");
        System.out.println("ID: " + high.id);
        System.out.println("NAME: " + high.name);
        System.out.println("DEPT: " + high.dept);
        System.out.println("AGE: " + high.age);
        System.out.println("SALARY: " + high.salary);
        sc.close();

    }
}

class salarycalc {
    String id, name, age, dept;
    double salary;

    public salarycalc(String id, String name, String age, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.salary = salary;
    }

}

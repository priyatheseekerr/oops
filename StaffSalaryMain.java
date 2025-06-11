import java.util.Scanner;

public class StaffSalaryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name = sc.next();
        System.out.println("Enter the id :");
        int id = sc.nextInt();
        System.out.println("Enter the nof days and no of hours worked: ");
        int days = sc.nextInt();
        int hour = sc.nextInt();
        person p =new person();
        p.setName(name);
        staff s= new staff();
        s.setId(id);
        Temporary t = new Temporary();
        t.setDay(days);
        t.setHour(hour);
        p.displayName();
        s.displayId();
        t.displaySalary();
        sc.close();
    }
}

class person {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Nam: " + name);
    }
}

class staff extends person {
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void displayId() {
        System.out.println("ID : " + id);
    }

}

class Temporary extends staff {
    int day, hour;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    void displaySalary() {
        System.out.println("No.of.days: " + day + "\nNo.Of.Hours: " + hour + "\nSalary: " + (day * hour * 50));
    }

}

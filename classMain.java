import java.util.Arrays;
import java.util.Scanner;

public class classMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of class room:");
        String name = sc.next();
        System.out.println("Enter the number of student: ");
        int num = sc.nextInt();
        System.out.println("Enter the student name : ");
        String[] studName = new String[num];
        for (int i = 0; i < num; i++) {
            studName[i] = sc.next();
        }
        new Class(name, studName);

        sc.close();
    }
}

class Class {
    String name;
    String[] studName;

    Class(String name, String[] studName) {
        System.out.println("class name: " + name);
        System.out.println("Students" + Arrays.toString(studName));
    }
}



import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the weight in kilograms: ");
        double weight = sc.nextDouble();
        System.out.println("Enter the height in meter: ");
        double height = sc.nextDouble();
        calc obj = new calc();
        obj.bmicalc(weight, height);
        obj.gradecalc();
        obj.display();
        sc.close();

    }

}

class calc {
    double bmi;
    String grade;

    void bmicalc(double weight,
            double height) {
        bmi = weight / (height * height);
       
    }

    String gradecalc() {
        if (bmi < 18.5) {
            grade = "U";
        } else if (18.5 <= bmi && bmi < 25.0) {
            grade = "N";
        } else if (25.0 <= bmi && bmi < 30.0) {
            grade = "H";
        } else {
            grade = "O";
        }
        return grade;

    }

    void display() {
        System.out.println(grade);
    }
}

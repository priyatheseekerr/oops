
import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no of student: ");
        int len = sc.nextInt();
        calMark[] obj = new calMark[len];
        int rollno;
        int mark1;
        int mark2;
        int mark3;
        for (int i = 0; i < len; i++) {
            rollno = sc.nextInt();
            mark1 = sc.nextInt();
            mark2 = sc.nextInt();
            mark3 = sc.nextInt();
            obj[i] = new calMark(rollno, mark1, mark2, mark3);
        }
        sc.close();
        int high1 = 0, high2 = 0, high3 = 0;
        int r1 = 0, r2 = 0, r3 = 0;
        int tot = 0;
        int TotR = 0;
        for (int i = 0; i < len; i++) {
            int total = obj[i].calculate();
            System.out.println(total);
            if (obj[i].mark1 > high1) {
                high1 = obj[i].mark1;
                r1 = obj[i].rollno;
            }
            if (obj[i].mark2 > high2) {
                high2 = obj[i].mark2;
                r2 = obj[i].rollno;
            }
            if (obj[i].mark3 > high3) {
                high3 = obj[i].mark3;
                r3 = obj[i].rollno;
            }
            if (total > tot) {
                tot = total;
                TotR = obj[i].rollno;
            }

        }
        System.out.println(r1 + " " + high1);
        System.out.println(r2 + " " + high2);
        System.out.println(r3 + " " + high3);
        System.out.println(TotR + " " + tot);

    }
}

class calMark {
    int rollno;
    int mark1;
    int mark2;
    int mark3;

    calMark(int rollno,
            int mark1,
            int mark2,
            int mark3) {
        this.rollno = rollno;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    int calculate() {
        return mark1 + mark2 + mark3;
    }
}

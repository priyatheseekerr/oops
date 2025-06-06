
import java.util.Scanner;

public class AddTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hour,minute adn second: ");
        timecalc[] obj = new timecalc[2];
        int hour, minute, sec;
        for (int i = 0; i < 2; i++) {
            hour = sc.nextInt();
            minute = sc.nextInt();
            sec = sc.nextInt();
            obj[i] = new timecalc(hour, minute, sec);
        }
        int s = obj[0].sec + obj[1].sec;
        int m = obj[0].minute + obj[1].minute + s / 60;
        int h = obj[0].hour + obj[1].hour + m / 60;
        int days = h / 24;
        h %= 24;
        System.out.println(h + " : " + m % 60 + " : " + s % 60 + " -- " + days + " day");
        sc.close();

    }
}

class timecalc {
    int hour, minute, sec;

    public timecalc(int hour, int minute, int sec) {
        this.hour = hour;
        this.minute = minute;
        this.sec = sec;
    }

}

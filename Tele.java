import java.util.Scanner;

public class Tele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array len: ");
        int len = sc.nextInt();
        sc.nextLine();
        teleEntry[] obj = new teleEntry[len];
        String name;
        String num;
        for (int i = 0; i < len; i++) {
            name = sc.nextLine();
            num = sc.nextLine();
            obj[i] = new teleEntry(name, num);
        }
        System.out.println("Enetr the target: ");
        String targ = sc.nextLine();
        boolean flag = false;
        for (teleEntry s : obj) {
            if (s.name.toLowerCase().startsWith(targ)) {
                System.out.println(s.num);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Target not found");
        }
        sc.close();

    }
}

class teleEntry{
    String name;
    String num;

    teleEntry(String name, String num) {
        this.name = name;
        this.num = num;
    }
}
import java.util.Scanner;

public class Occurencemain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        System.out.println("Enter the character to count: ");
        char ch = sc.next().charAt(0);
        Occurence obj = new Occurence(str, ch);
        obj.count();
        sc.close();
    }
}

class Occurence {
    String str;
    char ch;

    public Occurence(String str, char ch) {
        this.str = str;
        this.ch = ch;
    }

    void count() {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println(count);
    }
}

import java.util.Scanner;

public class CheckVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        vow(ch);
        sc.close();
    }

    static void vow(char ch) {
        char c = ch;
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(c + " : Vowels");
        } else {
            System.out.println(c + " : Consonant");
        }
    }
}

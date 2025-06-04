import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        count obj = new count(num);
        System.out.println(obj.counting());
        sc.close();
    }
}

class count {
    int num;

    count(int num) {
        this.num = num;
    }

    int counting() {
        int temp = num;
        int count = 0;
        if (temp == 0)
            return 1;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;

    }
}

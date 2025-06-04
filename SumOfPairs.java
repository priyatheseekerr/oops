import java.util.Scanner;

public class SumOfPairs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int len = sc.nextInt();
        System.out.println("Enter the array element: ");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();
        pair(arr, len, target);
        sc.close();
    }

    static void pair(int[] arr, int len, int target) {
        boolean flag = false;
        int i = 0;
        while (i < len) {
            for (int j = 0; j < len; j++) {
                if (arr[i] + arr[j] == target) {
                    if (arr[i] == arr[j] && !flag) {
                        System.out.println(arr[i] + " " + arr[j]);
                        flag = true;
                    } else {
                        System.out.println(arr[i] + " " + arr[j]);
                    }
                }
            }
            i++;
        }
    }
}

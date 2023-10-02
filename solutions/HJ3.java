import java.util.Scanner;
import java.util.regex.Pattern;

public class HJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int len = 0;

        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            boolean repeat = false;
            if (i == 0) {
                arr[len++] = temp;
                continue;
            } else {
                for (int j = 0; j < len; j++) {
                    if (arr[j] == temp) {
                        repeat = true;
                        break;
                    }
                }
                if (!repeat) {
                    arr[len++] = temp;
                }
            }
        }

        sort(arr, len);
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void sort(int[] arr, int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

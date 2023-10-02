import java.util.Scanner;

public class HJ97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sumPositive = 0;
        int countPositive = 0;
        int countNegative = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > 0) {
                sumPositive += arr[i];
                countPositive++;
            } else if (arr[i] < 0) {
                countNegative++;
            }
        }
        float avg = countPositive == 0 ? 0 : (float) sumPositive / countPositive;
        System.out.printf("%d %.1f", countNegative, avg);
    }
}

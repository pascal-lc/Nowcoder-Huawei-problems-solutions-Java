import java.util.Scanner;

public class HJ56_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int count = perfectNumber(n);

            System.out.println(count);
        }
    }

    private static int perfectNumber(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    sum += j + i / j;
                }
            }
            if (sum == 2 * i) {
                count++;
            }
        }

        return count - 1;
    }
}

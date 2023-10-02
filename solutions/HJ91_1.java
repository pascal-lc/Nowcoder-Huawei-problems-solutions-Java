import java.util.Scanner;

public class HJ91_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int count = countSquarePath(n, m);
            System.out.println(count);
        }
    }

    private static int countSquarePath(int n, int m) {
        return m == 1 || n == 1 ? m + n : countSquarePath(n - 1, m) + countSquarePath(n, m - 1);
        // if (m == 1 || n == 1) {
        //     return m + n;
        // } else {
        //     return countSquarePath(n - 1, m) + countSquarePath(n, m - 1);
        // }
    }
}

import java.util.Scanner;

public class HJ91_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int count = countSquarePathDynamic(n, m);
            System.out.println(count);
        }
    }

    private static int countSquarePathDynamic(int n, int m) {
        int[][] memo = new int[n + 1][m + 1];
        return countSquarePathDynamic(n, m, memo);
    }

    private static int countSquarePathDynamic(int n, int m, int[][] memo) {
        if (n == 1 || m == 1) {
            return m + n;
        } else if (memo[n][m] != 0) {
            return memo[n][m];
        }
        memo[n][m] = countSquarePathDynamic(n - 1, m, memo) + countSquarePathDynamic(n, m - 1, memo);
        return memo[n][m];
    }
}

import java.util.Scanner;

/*
 * 1
 * 1    1    1
 * 1    2    3    2    1
 * 1    3    6    7    6    3    1
 * 1    4    10   16   19   16   10   4    1
 * 1    5    15   30   45   51   45   30   15   5    1
 */

//  Recursive
/*
 * R(i)(j) = R(i-1)(j) + R(i-1)(j-1) + R(i-1)(j-2)
 * R(*)(1) || R(*)(2*n-1) = 1
 * R(*)(-1) || R(*)(2*n) = 0
 * R(2)(2) = 1
 * What if R(5)(4) ?
 * R(5)(4) = R(4)(4)                                                                                + R(4)(3) + R(4)(2)
 *         = R(3)(4)                     + R(3)(3)                     + R(3)(2)
 *         = R(2)(4) + R(2)(3) + R(2)(2) + R(2)(3) + R(2)(2) + R(2)(1) + R(2)(2) + R(2)(1) + R(2)(0) + ...
 *         = 0       + 1       + 1       + 1       + 1       + 1       + 1       + 1       + 0 + ...
 *         = 7 + 6 + 3
 *         = 16
 */
public class HJ53 {
    public static void main(String[] ards) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int row = sc.nextInt();
            int column = 0;
            for (int i = 1; i <= row; i++) {
                int value = trangle(row, i);
                if (value % 2 == 0) {
                    column = i;
                    break;
                }
            }
            column = column == 0 ? -1 : column;
            System.out.println(column);
        }
    }

    // private static int trangle(int a, int b) {
    //     if ((a >= 1) && (((b == 1) || (b == 2 * a - 1)) || ((a == 2) && (b == 2)))) {
    //         return 1;
    //     }
    //     else if ((b <= -1) || (b >= 2 * a)) {
    //         return 0;
    //     }
    //     else {
    //         return trangle(a - 1, b) + trangle(a - 1, b - 1) + trangle(a - 1, b - 2);
    //     }
    // }

    private static int trangle(int a, int b) {
        return trangle(a, b, new int[a + 1][b + 1]);
    }

    private static int trangle(int a, int b, int[][] dp) {
        if ((a >= 1) && (((b == 1) || (b == 2 * a - 1)) || ((a == 2) && (b == 2)))) {
            return 1;
        }
        else if ((b <= -1) || (b >= 2 * a)) {
            return 0;
        }
        else if (dp[a][b] == 0) {
            dp[a][b] = trangle(a - 1, b, dp) + trangle(a - 1, b - 1, dp) + trangle(a - 1, b - 2, dp);
        }
        return dp[a][b];
    }
}

import java.util.Scanner;

/*
 * 描述
正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。

数据范围：

1 ≤ a, b ≤ 100000 

输入描述：
输入两个正整数A和B。

输出描述：
输出A和B的最小公倍数。

示例1
输入：
5 7

输出：
35

示例2
输入：
2 4

输出：
4
 */

public class Main14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int s = lcm(a, b);
            System.out.println(s);
        }
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    private static int gcd(int a, int b) {
        // return b == 0 ? a : gcd(b, a % b);
        if (b != 0) {
            while (((a %= b) != 0) && ((b %= a) != 0));
        }
        return a + b;
    }
}

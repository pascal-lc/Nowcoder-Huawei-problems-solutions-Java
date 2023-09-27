import java.util.Scanner;

/*
 * HJ9 提取不重复的整数
 * 描述
输入一个 int 型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
保证输入的整数最后一位不是 0。

数据范围：

1≤n≤10^8

 * 输入描述：
输入一个int型整数

 * 输出描述：
按照从右向左的阅读顺序，返回一个不含重复数字的新的整数

示例1
输入：
9876673

输出：
37689
 */

public class Main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int num = sc.nextInt();
            int[] digits = new int[8];
            int len = 0;
            int reverse = 0;
            while (num != 0) {
                boolean repeat = false;
                int digit = num % 10;
                num /= 10;
                for (int i = 0; i < len; i++) {
                    if (digits[i] == digit) {
                        repeat = true;
                        break;
                    }
                }
                if (!repeat) {
                    digits[len++] = digit;
                    reverse = reverse * 10 + digit;
                }
            }
            System.out.println(reverse);
        }
    }
}

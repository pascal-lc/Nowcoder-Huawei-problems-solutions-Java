import java.util.Scanner;

/*
 * 进制转换
 * 描述
写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。

数据范围：保证结果在 

1 ≤ n ≤ 2^31−1

输入描述：
输入一个十六进制的数值字符串。

输出描述：
输出该数值的十进制字符串。不同组的测试用例用\n隔开。

示例1
输入：
0xAA

输出：
170
 */

public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();

            int len = str.length();
            int s = 0;
            int num = 0;
            for (int i = 0; i < len-2; i++) {
                char c = str.charAt(len - 1 - i);
                if (c >= 'A' && c <= 'F') {
                    num = c - 'A' + 10;
                }
                else {
                    num = c - '0';
                }
                s += num * Math.pow(16, i);
            }

            System.out.println(s);

            // System.out.println(Integer.parseInt(str, 16));
        }
    }
}

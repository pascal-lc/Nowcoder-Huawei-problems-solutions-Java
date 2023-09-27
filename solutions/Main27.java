import java.util.Scanner;

/*
 * HJ100 等差数列
 * 描述
等差数列 2，5，8，11，14。。。。
（从 2 开始的 3 为公差的等差数列）
输出求等差数列前n项和


a(n) = a(1) + (n - 1) * d
s(n) = (a(1) + a(n)) * n / 2
     = (a(1) + (a(1) + (n - 1) * d)) * n / 2
     = (2 * a(1) + (n - 1) * d) * n / 2
     = a(1) * n + n * (n - 1) * d / 2

a(1) = 2
d = 3
a(n) = 2 + 3 * (n - 1)
s(n) = 2 * n + 3 * n * (n - 1) / 2
     = (3 * n^2 + n) / 2

数据范围：1≤n≤1000 
输入描述：
输入一个正整数n。

输出描述：
输出一个相加后的整数。

示例1
输入：
2

输出：
7

说明：
2+5=7  
示例2
输入：
275

输出：
113575

说明：
2+5+...+821+824=113575  
 */

public class Main27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sn = (3 * n * n + n) / 2;

        System.out.println(sn);
    }
}
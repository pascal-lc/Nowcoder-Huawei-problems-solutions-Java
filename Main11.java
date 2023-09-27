import java.util.Scanner;

/*
 * 描述

蛇形矩阵是由1开始的自然数依次排列成的一个矩阵上三角形。
例如，当输入5时，应该输出的三角形为：

1 3 6 10 15
2 5 9 14
4 8 13
7 12
11

 * 输入描述：

输入正整数N（N不大于100）

 * 输出描述：

输出一个N行的蛇形矩阵。

示例1
输入：
4

输出：
1 3 6 10
2 5 9
4 8
7
*/

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
                int r0 = (i * i - i + 2) / 2;
                int temp = i + 1;
            for (int j = 1; j <= n - (i - 1); j++) {
                System.out.print(r0 + " ");
                r0 = r0 + temp;
                temp += 1;
            }
            System.out.println();
        }
    }
}

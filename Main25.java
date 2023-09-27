import java.util.Scanner;

/*
 * HJ11 数字颠倒
 * 描述
输入一个整数，将这个整数以字符串的形式逆序输出
程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001


数据范围：0≤n≤2^30−1
输入描述：
输入一个int整数

输出描述：
将这个整数以字符串的形式逆序输出

示例1
输入：
1516000

输出：
0006151

示例2
输入：
0

输出：
0
 */

public class Main25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] digits = new int[10];

        if (num == 0) {
            System.out.println("0");
        }
        int len = num2digit(num, digits);
        String str = new String();
        for (int i = 0; i < len; i++) {
            str += digits[i];
        }
        System.out.println(str);
    }
    
    private static int num2digit(int num, int[] digits) {
        int index = 0;

        while (num != 0) {
            digits[index++] = num % 10;
            num /= 10;
        }

        return index;
    }
}

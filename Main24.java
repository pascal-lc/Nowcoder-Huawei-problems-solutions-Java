import java.util.Scanner;

/*
 * HJ46 截取字符串
 * 描述
输入一个字符串和一个整数 k，截取字符串的前k个字符并输出

数据范围：字符串长度满足 1≤n≤1000，1≤k≤n
输入描述：
1.输入待截取的字符串
2.输入一个正整数k，代表截取的长度

输出描述：
截取后的字符串

示例1
输入：
abABCcDEF
6

输出：
abABCc

示例2
输入：
bdxPKBhih
6

输出：
bdxPKB
 */

public class Main24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();

        // System.out.println(str.substring(0, k));

        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(chars[i]);
        }
        System.out.println(sb.toString());


        // char[] chars = str.toCharArray();
        // for (int i = 0; i < k; i++) {
        //     System.out.print(chars[i]);
        // }
    }
}

import java.util.Scanner;

/*
 * HJ12 字符串反转
 * 描述
接受一个只包含小写字母的字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）

 * 输入描述：
输入一行，为一个只包含小写字母的字符串。

 * 输出描述：
输出该字符串反转后的字符串。

示例1
输入：
abcd

输出：
dcba
 */

public class HJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            char[] chars = str.toCharArray();
            int len = str.trim().length();

            // for (int i = 0; i < len; i++) {
            //     System.out.print(chars[len - 1 - i]);
            // }

            for (int i = 0; i < len; i++) {
                char ch = str.charAt(len - 1 - i);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

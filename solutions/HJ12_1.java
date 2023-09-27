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

public class HJ12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            StringBuilder sb = new StringBuilder(str);
            System.out.println(sb.reverse());
            // for (int i = str.length() - 1; i >= 0; i--) {
            //     sb.append(str.charAt(i));
            // }
            // System.out.println(sb.toString());
            // System.out.println();
            // sc.close();
            // break;
        }
    }
}

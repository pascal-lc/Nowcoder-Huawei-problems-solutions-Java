import java.util.Scanner;

/*
 * HJ4 字符串分隔
 * 描述
输入一个字符串，请按长度为8拆分每个输入字符串并进行输出；
长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
输入描述：
连续输入字符串(每个字符串长度小于等于100)

输出描述：
依次输出所有分割后的长度为8的新字符串

示例1
输入：
abc

输出：
abc00000
 */

public class HJ4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
        String str = sc.nextLine();
        // char[] chars = str.toCharArray();
        int len = str.length();
        int complement = 8 - (len % 8);
        complement = complement == 8 ? 0 : complement;

        int q = len / 8;
        for (int i = 0; i < q; i++) {
            System.out.println(str.substring(i * 8, (i + 1) * 8));
        }
        System.out.print(str.substring(q * 8));
        System.out.println("0".repeat(complement));

        // for (int i = 0; i < len; i++) {
        //     System.out.print(chars[i]);
        //     if ((i + 1) % 8 == 0) {
        //         System.out.println();
        //     }
        // }
        // for (int i = 0; i < complement; i++) {
        //     System.out.print("0");
        // }
        }
    }
}
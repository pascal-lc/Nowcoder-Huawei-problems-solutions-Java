import java.util.Scanner;

/*
 * HJ21 简单密码
 * 描述
现在有一种密码变换算法。
九键手机键盘上的数字与字母的对应：
1--1, abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8, wxyz--9, 0--0，
把密码中出现的小写字母都变成九键键盘对应的数字，如：a 变成 2，x 变成 9.
而密码中出现的大写字母则变成小写之后往后移一位，如：X ，先变成小写，再往后移一位，变成了 y ，例外：Z 往后移是 a 。
数字和其它的符号都不做变换。
数据范围： 输入的字符串长度满足1≤n≤100 
输入描述：
输入一组密码，长度不超过100个字符。

输出描述：
输出密码变换后的字符串

示例1
输入：
YUANzhi1987

输出：
zvbo9441987
 */

public class Main26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        char[] chars1 = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                chars1[i] = chars[i];
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                if (chars[i] >= 'a' && chars[i] <= 'c') {
                    chars1[i] = '2';
                } else if (chars[i] >= 'd' && chars[i] <= 'f') {
                    chars1[i] = '3';
                } else if (chars[i] >= 'g' && chars[i] <= 'i') {
                    chars1[i] = '4';
                } else if (chars[i] >= 'j' && chars[i] <= 'l') {
                    chars1[i] = '5';
                } else if (chars[i] >= 'm' && chars[i] <= 'o') {
                    chars1[i] = '6';
                } else if (chars[i] >= 'p' && chars[i] <= 's') {
                    chars1[i] = '7';
                } else if (chars[i] >= 't' && chars[i] <= 'v') {
                    chars1[i] = '8';
                } else {
                    chars1[i] = '9';
                }
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                if (chars[i] >= 'A' && chars[i] <= 'Y') {
                    chars1[i] = (char) (chars[i] + 32 + 1);
                } else {
                    chars1[i] = 'a';
                }
            }
        }
        
        String str1 = new String(chars1);
        System.out.println(str1);
    }
}

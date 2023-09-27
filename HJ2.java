import java.util.Scanner;

/*
 * HJ2 计算某字符出现次数
 * 描述
写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字符，然后输出输入字符串中该字符的出现次数。（不区分大小写字母）

数据范围：1 ≤ n ≤ 1000
输入描述：
第一行输入一个由字母、数字和空格组成的字符串，第二行输入一个字符（保证该字符不为空格）。

输出描述：
输出输入字符串中含有该字符的个数。（不区分大小写字母）

示例1
输入：
ABCabc
A

输出：
2
 */

public class HJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.nextLine().charAt(0);
        int count = 0;
        for (String s : str.split("")) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                if (s.equals(String.valueOf(c)) || s.equals(String.valueOf((char) (c + 32)))
                        || s.equals(String.valueOf((char) (c - 32)))) {
                    count++;
                }
            }
            else if (s.equals(String.valueOf(c))) {
                count++;
            }
        }

        System.out.println(count);
    }
}

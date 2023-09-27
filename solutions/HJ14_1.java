import java.util.*;

/*
 * HJ14 字符串排序
 * 描述
给定 n 个字符串，请对 n 个字符串按照字典序排列。

数据范围：1 ≤ n ≤ 1000，字符串长度满足 1 ≤ len ≤ 100

 * 输入描述：
输入第一行为一个正整数 n (1 ≤ n ≤ 1000)，下面 n 行为 n 个字符串(字符串长度 len ≤ 100)，字符串中只含有大小写字母。

 * 输出描述：
数据输出 n 行，输出结果为按照字典序排列的字符串。
示例1
输入：

9
cap
to
cat
card
two
too
up
boat
boot

输出：

boat
boot
cap
card
cat
to
too
two
up
 */

public class HJ14_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n = Integer.valueOf(sc.nextLine());
        String[] strs = new String[n];

        while (n-- > 0) {
            strs[n] = sc.next();
        }

        // Arrays.sort(strs);
        // for (String str : strs) {
        //     System.out.println(str);
        // }
        Arrays.stream(strs).sorted().forEach(System.out::println);
    }
}

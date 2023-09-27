import java.util.*;

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

public class Main28{
    // 定义map容器存储按键对应数字字符的容器
    private static Map<String, String> map = new HashMap<>();
    // 静态初始化、加载map容器
    static{
        map.put("1","1");
        map.put("abc","2");
        map.put("def","3");
        map.put("ghi","4");
        map.put("jkl","5");
        map.put("mno","6");
        map.put("pqrs","7");
        map.put("tuv","8");
        map.put("wxyz","9");
        map.put("0","0");
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                String str = sc.nextLine();
                char[] chars = str.toCharArray();
                // 构造buffer容器存储转换后的字符串
                StringBuffer buffer = new StringBuffer();
                for (char c : chars) {
                    if (c >= '0' && c <= '9') {
                        // 如果是正整数则不需要进行加密
                        buffer.append(String.valueOf(c));
                    } else if (c >= 'A' && c <= 'Z') {
                        if (c >= 'A' && c <= 'Y') {
                            //如果是A~Y的大写字母则需要将其+32位转换成小写再向后移1位
                            char newChar = (char) (c + 32 + 1);
                            buffer.append(String.valueOf(newChar));
                        } else if (c == 'Z') {
                            // 如果是Z则加密成a
                            buffer.append("a");
                        }
                    } else {
                        // 去除map容器中的key与字符进行校验并加密
                        // Set<String> keys = map.keySet();
                        // for (String key : keys) {
                        for (String key : map.keySet()) {
                            if (key.contains(String.valueOf(c)))
                                buffer.append(map.get(key));
                        }
                    }
                }
                System.out.print(buffer.toString());
            }
        }
    }
}

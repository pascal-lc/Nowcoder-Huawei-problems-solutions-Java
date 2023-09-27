import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * HJ20 密码验证合格程序
 * 描述
密码要求:

1. 长度超过8位
2. 包括大小写字母.数字.其它符号,以上四种至少三种
3. 不能有长度大于2的包含公共元素的子串重复 （注：其他符号不含空格或换行）

数据范围：输入的字符串长度满足 

1 ≤ n ≤ 100 

输入描述：
一组字符串。

输出描述：
如果符合要求输出：OK，否则输出NG

示例1
输入：
021Abc9000
021Abc9Abc1
021ABC9000
021$bc9000

输出：
OK
NG
NG
OK
 */

public class Main16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String NG = "NG";
        final String OK = "OK";

        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            if (str.length() < 8 || str.length() > 100) {
                System.out.println(NG);
                continue;
            } else {
                int[] count = new int[] { 0, 0, 0, 0 };
                int sum = 0;
                String[] strList = str.split("");
                for (int i = 0; i < strList.length; i++) {
                    char s = strList[i].charAt(0);
                    if (s >= '0' && s <= '9') {
                        count[0] = 1;
                    } else if (s >= 'a' && s <= 'z') {
                        count[1] = 1;
                    } else if (s >= 'A' && s <= 'Z') {
                        count[2] = 1;
                    } else {
                        count[3] = 1;
                    }
                }
                for (int j = 0; j < count.length; j++) {
                    sum += count[j];
                }
                if (sum >= 3) {
                    if (hasSubString(str, 0, 3)) {
                        System.out.println(NG);
                        continue;
                    } else {
                        System.out.println(OK);
                        continue;
                    }

                } else {
                    System.out.println(NG);
                    continue;
                }
            }
            // System.out.println(result);
        }
    }
    
    private static boolean hasSubString(String str, int start, int end) {
        if (end > str.length()) {
            return false;
        } else if (str.substring(end).contains(str.substring(start, end))) {
            return true;
        } else {
            return hasSubString(str, start + 1, end + 1);
        }
    }
    
    // // 检查是否满足正则
    // private static boolean getMatch(String str){
    //     int count = 0;
    //     Pattern p1 = Pattern.compile("[A-Z]");
    //     if(p1.matcher(str).find()) {
    //         count++;
    //     }
    //     Pattern p2 = Pattern.compile("[a-z]");
    //     if(p2.matcher(str).find()) {
    //         count++;
    //     }
    //     Pattern p3 = Pattern.compile("[0-9]");
    //     if(p3.matcher(str).find()) {
    //         count++;
    //     }
    //     Pattern p4 = Pattern.compile("[^a-zA-Z0-9]");
    //     if(p4.matcher(str).find()) {
    //         count++;
    //     }
    //     if(count >= 3) {
    //         return false;
    //     } else {
    //         return true;
    //     }
    // }
}

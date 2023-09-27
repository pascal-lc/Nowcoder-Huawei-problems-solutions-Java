import java.util.*;

public class HJ31_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            int len = str.length();
            StringBuilder sb = new StringBuilder();
            char[] chars = str.toCharArray();

            for (int i = 0; i < len; i++) {
                if (!((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z'))) {
                    if (sb.length() != 0) {
                        // 字符于字符串，' ' 与 " " 是两种数据类型。
                        if (!sb.substring(sb.length() - 1).equals(" ")) {
                            sb.append(" ");
                        } else {
                            continue;
                        }
                    }
                } else {
                    sb.append(chars[i]);
                }
            }

            String[] strArr = sb.toString().split(" ");
            int lenStrArr = strArr.length;

            for (int i = 0; i < lenStrArr; i++) {
                System.out.print(strArr[lenStrArr - 1 - i] + " ");
            }
        }
    }
}

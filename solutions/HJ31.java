import java.util.*;

public class HJ31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            int len = str.length();
            StringBuilder sb = new StringBuilder(str);
            String strReverse = sb.reverse().toString();
            char[] chars = strReverse.toCharArray();

            int j = 0;
            for (int i = 0; i < len; i++) {
                if (!((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z'))) {
                    if (chars[j - 1] != ' ') {
                        chars[j] = ' ';
                        j++;
                    } else {
                        continue;
                    }
                }
                else {
                    chars[j] = chars[i];
                    j++;
                    }
            }
            
            // for (char ch : chars) {
            //     System.out.print(ch);
            // }
            for (int i = 0; i < j; i++) {
                System.out.print(chars[i]);
            }
        }
    }
}

import java.util.*;

public class HJ106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            int len = str.length();
            char[] chars = str.toCharArray();

            for (int i = 0; i < len; i++) {
                System.out.print(chars[len - 1 - i]);
            }
        }
    }
}

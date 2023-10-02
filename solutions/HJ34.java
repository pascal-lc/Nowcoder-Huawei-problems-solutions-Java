import java.util.Scanner;

public class HJ34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            int len = str.length();
            char[] chars = str.toCharArray();

            // StringBuilder sb = new StringBuilder();
            // for (int i = 0; i < len; i++) {
            //     // System.out.print(chars[i]);
            //     sb.append(chars[i]);
            // }
            // System.out.println(sb.toString());

            for (int i = 0; i < len; i++) {
                for (int j = 0; j < i; j++) {
                    if (chars[j] > chars[i]) {
                        char temp = chars[j];
                        chars[j] = chars[i];
                        chars[i] = temp;
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < len; i++) {
                // System.out.print(chars[i]);
                sb.append(chars[i]);
            }
            System.out.println(sb.toString());
        }
    }
}
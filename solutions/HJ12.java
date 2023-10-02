import java.util.Scanner;

public class HJ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            char[] chars = str.toCharArray();
            int len = str.trim().length();

            // for (int i = 0; i < len; i++) {
            //     System.out.print(chars[len - 1 - i]);
            // }

            for (int i = 0; i < len; i++) {
                char ch = str.charAt(len - 1 - i);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

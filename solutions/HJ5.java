import java.util.Scanner;

public class HJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();

            int len = str.length();
            int s = 0;
            int num = 0;
            for (int i = 0; i < len-2; i++) {
                char c = str.charAt(len - 1 - i);
                if (c >= 'A' && c <= 'F') {
                    num = c - 'A' + 10;
                }
                else {
                    num = c - '0';
                }
                s += num * Math.pow(16, i);
            }

            System.out.println(s);

            // System.out.println(Integer.parseInt(str, 16));
        }
    }
}

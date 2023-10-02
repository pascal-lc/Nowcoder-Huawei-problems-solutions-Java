import java.util.Scanner;

public class HJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int num = sc.nextInt();
            int[] digits = new int[8];
            int len = 0;
            int reverse = 0;
            while (num != 0) {
                boolean repeat = false;
                int digit = num % 10;
                num /= 10;
                for (int i = 0; i < len; i++) {
                    if (digits[i] == digit) {
                        repeat = true;
                        break;
                    }
                }
                if (!repeat) {
                    digits[len++] = digit;
                    reverse = reverse * 10 + digit;
                }
            }
            System.out.println(reverse);
        }
    }
}

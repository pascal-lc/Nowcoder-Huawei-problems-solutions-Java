import java.util.Scanner;

public class HJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] digits = new int[10];

        if (num == 0) {
            System.out.println("0");
        }
        int len = num2digit(num, digits);
        String str = new String();
        for (int i = 0; i < len; i++) {
            str += digits[i];
        }
        System.out.println(str);
    }
    
    private static int num2digit(int num, int[] digits) {
        int index = 0;

        while (num != 0) {
            digits[index++] = num % 10;
            num /= 10;
        }

        return index;
    }
}

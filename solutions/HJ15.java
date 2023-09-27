import java.util.*;

public class HJ15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            final int len = 32;
            int[] binArr = new int[len];

            int index = 0;
            while (n != 0) {
                binArr[index] = n % 2;
                n /= 2;
                index++;
            }

            int sumOne = 0;
            for (int i = 0; i < index; i++) {
                sumOne += binArr[i];
            }

            System.out.println(sumOne);
        }
    }
}

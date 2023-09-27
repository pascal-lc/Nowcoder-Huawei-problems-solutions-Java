import java.util.*;

public class HJ15_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int count = 0;
            while (n != 0) {
                // n = n & (n - 1); // 将二进制数最右边的1变成0，直到二进制n全为0
                // count++;

                if ((n & 1) == 1) {
                    count++;
                }
                n = n >>> 1;        // 无符号右移，等价于 n /= 2，但移位运算效率更高
            }

            System.out.println(count);
        }
    }
}

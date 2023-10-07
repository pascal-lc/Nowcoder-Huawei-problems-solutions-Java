import java.util.Scanner;

public class HJ86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            // int lenBits = (int) Math.ceil(Math.log(n) / Math.log(2));

            String strBinaryN = Integer.toBinaryString(n);
            int lenBits = strBinaryN.length();
            System.out.println(strBinaryN);
            for (int i = lenBits; i > 0; i--) {
                // 对于二进制中有多个最大连续比特 `1` 相等的情形不适用
                // 例如 101，第一次去除比特 1 便将 1 全部去除，只剩下 0，而 101 的最大连续比特 1 为 1。
                String str = strBinaryN.replaceAll("1{" + i + "}", "");
                int diff = strBinaryN.length() - str.length();
                if (diff != 0) {
                    System.out.println(diff);
                    // System.out.println(str);
                    break;
                }
            }
        }
    }
}

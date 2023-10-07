import java.util.Arrays;
import java.util.Scanner;

public class HJ86_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            String strN = Integer.toBinaryString(n);
            String[] strBinOneBIts = strN.split("[0]+");
            int len = strBinOneBIts.length;
            int[] arrLen = new int[len];

            for (int i = 0; i < len; i++) {
                arrLen[i] = strBinOneBIts[i].length();
            }
            Arrays.sort(arrLen);
            System.out.println(arrLen[len - 1]);
        }
    }
}

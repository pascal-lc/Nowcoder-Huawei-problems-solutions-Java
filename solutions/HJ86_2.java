import java.util.Scanner;

public class HJ86_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int max = 0;
            int cnt = 0;
            while (n > 0) {
                if ((n & 1) == 1) {
                    cnt++;
                    max = Math.max(max, cnt);
                } else {
                    cnt = 0;
                }
                n = n >>> 1;
            }
            System.out.println(max);
        }
    }
}
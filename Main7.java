import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int q = 0, r = 0;
            int s = 0;
            if (n == 0) {
                break;
            }
            while (n != 0) {
                q = n / 3;
                r = n % 3;
                s += q;
                n = q + r;

                if (n == 1) {
                    System.out.println(s);
                    break;
                }
                else if (n == 2) {
                    System.out.println(s + 1);
                    break;
                }
            }
            // int[] a = new int[n];
            // for (int i = 0; i < n; i++) {
            //     a[i] = scanner.nextInt();
            // }
        }
    }
}

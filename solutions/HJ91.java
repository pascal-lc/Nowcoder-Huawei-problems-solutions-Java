import java.util.Scanner;

public class HJ91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int count = countSquarePath(n, m);
            System.out.println(count);
        }
    }

    private static int countSquarePath(int n, int m) {
        return combination(n + m, m);
    }

    private static int combination(int n, int k) {
        return k == 0 ? 1 : n * combination(n - 1, k - 1) / k;
        // if (k == 0) {
        //     return 1;
        // }
        // else {
        //     return n * combination(n - 1, k - 1) / k;
        // }
    }
}

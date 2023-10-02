import java.util.Scanner;

public class HJ99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int count = countAutomorphicNumber(n);

            System.out.println(count);
        }
    }

    private static int countAutomorphicNumber(int n) {
        if (n == 0) {
            return 1;
        } else {
            int check = checkAutomorphicNumber(n);
            return countAutomorphicNumber(n - 1) + check;
        }
    }

    private static int checkAutomorphicNumber(int n) {
        // int check = 1;

        int n_ = n, n2 = n * n;
        while ((n_ > 0) && (n_ % 10 == n2 % 10)) {
            n_ /= 10;
            n2 /= 10;
        }
        int check = n_ == 0 ? 1 : 0;

        // int temp = 1;
        // while (n_ > 0) {
        //     temp *= 10;
        //     n_ /= 10;
        // }
        // int check = (n * (n - 1)) % temp == 0 ? 1 : 0;

        // int temp = 10, n1 = n * (n - 1);
        // while ((n_ > 0) && (n1 % temp == 0)) {
        //     n_ /= 10;
        //     n1 /= 10;
        // }
        // int check = n_ == 0 ? 1 : 0;

        // int len = 0;
        // while (n_ > 0) {
        //     len++;
        //     n_ /= 10;
        // }
        // int check = Math.pow(n, 2) % Math.pow(10, len) == n ? 1 : 0;

        // if (n_ != 0) {
        //     check = 0;
        // }

        return check;
    }
}

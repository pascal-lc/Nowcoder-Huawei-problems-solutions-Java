import java.util.Scanner;

public class HJ108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int s = lcm(a, b);
            System.out.println(s);
        }
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    private static int gcd(int a, int b) {
        // return b == 0 ? a : gcd(b, a % b);
        if (b != 0) {
            while (((a %= b) != 0) && ((b %= a) != 0));
        }
        return a + b;
    }
}

import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextDouble()) {
            double y = scanner.nextDouble();
            double x0 = 1.0;
            double x1 = 1.5;
            double eps = 1e-6;
            while ((x1 - x0) * (x1 - x0) > eps) {
                // while ((x1 * x1 * x1 - y) * (x1 * x1 * x1 - y) > eps) {
                // x1 = 2.0 / 3.0 * x0 + y / (3.0 * x0 * x0);
                x0 = x1;
                x1 = x0 - (x0 * x0 * x0 - y) / (3.0 * x0 * x0);
            }
            // System.out.println(x1);
            System.out.printf("%.1f", x1);
        }
    }
}

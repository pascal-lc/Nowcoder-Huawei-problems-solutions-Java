import java.util.Scanner;

public class HJ35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
                int r0 = (i * i - i + 2) / 2;
                int temp = i + 1;
            for (int j = 1; j <= n - (i - 1); j++) {
                System.out.print(r0 + " ");
                r0 = r0 + temp;
                temp += 1;
            }
            System.out.println();
        }
    }
}

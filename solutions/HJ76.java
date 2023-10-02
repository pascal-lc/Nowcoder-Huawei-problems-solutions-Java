import java.util.Scanner;

public class HJ76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int m = sc.nextInt();
            String expression = func(m);

            System.out.println(expression);
        }
    }

    private static String func(int m) {
        int[] mArr = new int[m];
        StringBuilder sb = new StringBuilder();

        if (m % 2 == 0) {
            int m2 = m * m - 1 - ((m / 2) - 1) * 2;
            for (int i = 0; i < m; i++) {
                mArr[i] = m2 + i * 2;
            }
        } else {
            int m2 = m * m - (m - 1);
            for (int i = 0; i < m; i++) {
                mArr[i] = m2 + i * 2;
            }
        }
        for (int i : mArr) {
            sb.append(i + " ");
        }
        String expression = sb.toString().trim().replaceAll(" ", "+");
        return expression;
    }
}

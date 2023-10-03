import java.util.Scanner;

public class HJ76_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int m = sc.nextInt();
            String expression = func(m);

            System.out.println(expression);
        }
    }

    private static String func(int m) {
        StringBuilder sb = new StringBuilder();

        int m2 = m * m - (m - 1);
        for (int i = 0; i < m; i++) {
            int temp = m2 + i * 2;
            sb.append(temp + " ");
        }
        String expression = sb.toString().trim().replaceAll(" ", "+");
        return expression;
    }
}

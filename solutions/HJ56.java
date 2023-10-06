import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HJ56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int count = perfectNumber(n);

            System.out.println(count);
        }
    }

    private static int perfectNumber(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    list.add(j);
                    list.add(i / j);
                }
            }
            if (listSum(list) == 2 * i) {
                count++;
                // for (int k : list) {
                //     System.out.print(k + " ");
                // }
                // System.out.println();
                // System.out.println(list);
            }
        }

        return count - 1;
    }

    private static int listSum(List<Integer> list) {
        int sum = 0;
        sum = list.stream().reduce(0, Integer::sum);
        // for (int i : list) {
        //     sum += i;
        // }

        return sum;
    }
}

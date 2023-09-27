import java.util.*;

public class HJ60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 != 0) {
                return;
            }
            // List<Integer> list = new ArrayList<>();
            // for (int i = 0; i <= n / 2; i++) {
            //     if (isPrime(i) && isPrime(n - i)) {
            //         // System.out.println(i + " " + (n - i));
            //         list.add(i);
            //     }
            // }
            // int tail = list.get(list.size() - 1);
            // // System.out.println(tail + "\n" + (n - tail));
            // System.out.println(tail);
            // System.out.println(n - tail);

            int i = n / 2, j = n - i;
            while (!isPrime(i) || !isPrime(j)) {
                i++;
                j--;
            }
            System.out.println(j);
            System.out.println(i);

        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

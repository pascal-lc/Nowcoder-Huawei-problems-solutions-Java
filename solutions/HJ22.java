import java.util.Scanner;

public class HJ22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            // if (n % 2 == 0) {
            //     s = n / 2;
            // }
            // else {
            //     s = (n - 1) / 2;
            // }
            s = n % 2 == 0 ? n / 2 : (n - 1) / 2;
            System.out.println(s);
        }
    }
}
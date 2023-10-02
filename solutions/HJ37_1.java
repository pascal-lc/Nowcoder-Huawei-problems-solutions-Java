import java.util.Scanner;

public class HJ37_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        int a1 = 1, a2 = 1;

        if ((n == 1) || (n == 2)) {
            s = 1;
        } else {
            int i = 2;
            while (i < n) {
                s = a1 + a2;
                a1 = a2;
                a2 = s;
                i++;
            }
        }

        System.out.println(s);
    }
}

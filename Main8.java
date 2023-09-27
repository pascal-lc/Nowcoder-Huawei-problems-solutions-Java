import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1, s = 0;
        int a1 = 1, a2 = 1;

        while (i <= n-2) {
            s = a1 + a2;
            a1 = a2;
            a2 = s;
            i++;
        }
        System.out.println(s);
    }
}

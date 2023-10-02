import java.util.Scanner;

/*
 * First Even Position => p
 * p = -1,                  if line < 3;
 * p = (2, 3, 2, 4) cycle,  else if line >= 3;
 */
public class HJ53_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int position = getFirstEvenPosition(n);
            System.out.println(position);
        }
    }

    private static int getFirstEvenPosition(int n) {
        int position;
        if (n < 3) {
            position = -1;
        }
        else {
            int nn = n - 2;
            if ((nn % 4 == 1) || (nn % 4 == 3)) {
                position = 2;
            } else if (nn % 4 == 2) {
                position = 3;
            } else {
                position = 4;
            }
        }
        return position;
    }
}

import java.util.Scanner;

/*
 * First Even Position => p
 * p = -1,                  if line < 3;
 * p = (2, 3, 2, 4) cycle,  else if line >= 3;
 */
public class HJ53_2 {
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
        // int[] positionArray = new int[] { 2, 3, 2, 4 };
        int[] positionArray2 = new int[] { 4, 2, 3, 2 };
        if (n < 3) {
            position = -1;
        } else {
            // position = positionArray[(n - 3) % 4];
            position = positionArray2[(n - 2) % 4];
        }
        return position;
    }
}


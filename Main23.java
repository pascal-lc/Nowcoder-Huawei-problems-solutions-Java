import java.util.Scanner;

public class Main23 {
    public static void main(String[] args) {
        // Play twenty questions;
        int k = Integer.parseInt(args[0]);
        int n = (int) Math.pow(2, k);
        System.out.printf("In[0 ~ %d]: ", n - 1);
        int guess = binarySearch(0, n);
        System.out.println("Out[]: " + guess);
    }

    private static int binarySearch(int low, int high) {
        // find number in [low, high]
        if (high - low == 1) {
            return low;
        }
        int mid = (low + high) / 2;
        System.out.print("Greater than or equal to " + mid + "? ");
        Scanner sc = new Scanner(System.in);
        boolean flag = sc.nextBoolean();
        if (flag) {
            return binarySearch(mid, high);
        }
        else {
            return binarySearch(low, mid);
        }
    }
}

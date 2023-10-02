import java.util.Scanner;

public class HJ97_1 {
    private int count = 0;
    private float avg = 0.0f;

    public HJ97_1(int count, float avg) {
        this.count = count;
        this.avg = avg;
    }

    public int getCount() {
        return count;
    }

    public float getAvg() {
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        HJ97_1 ca = getCountAvg(arr);
        System.out.printf("%d %.1f", ca.getCount(), ca.getAvg());
    }

    private static HJ97_1 getCountAvg(int[] arr) {
        int countPositive = 0;
        int countNegative = 0;
        int sumPositive = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sumPositive += arr[i];
                countPositive++;
            } else if (arr[i] < 0) {
                countNegative++;
            }
        }
        float avg = countPositive == 0 ? 0 : (float) sumPositive / countPositive;
        HJ97_1 ca = new HJ97_1(countNegative, avg);
        return ca;
    }
}

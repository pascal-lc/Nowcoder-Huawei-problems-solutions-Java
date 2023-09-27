import java.util.*;

public class HJ105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countN = 0, countP = 0;
        float sum = 0.0f;

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n >= 0) {
                countP++;
                sum += n;
            } else {
                countN++;
            }
        }
        float avg = 0.0f;
        System.out.println(countN);
        if (countP != 0) {
            avg = sum / countP;
        }
        System.out.printf("%.1f\n", avg);
    }
}

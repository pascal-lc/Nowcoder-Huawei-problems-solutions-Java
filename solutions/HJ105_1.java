import java.util.*;

public class HJ105_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }
        sc.close();

        int len = list.size();
        int countN = 0;
        float sum = 0.0f, avg = 0.0f;
        for (int i : list) {
            if (i < 0) {
                countN++;
            } else {
                sum += i;
            }
        }

        System.out.println(countN);
        if (countN != len) {
            avg = sum / (len - countN);
        }
        System.out.printf("%.1f", avg);
    }
}

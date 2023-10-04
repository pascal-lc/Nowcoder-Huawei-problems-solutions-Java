import java.util.Scanner;
import java.util.Calendar;

public class HJ73_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int[] date = new int[3];
            for (int i = 0; i < 3; i++) {
                date[i] = sc.nextInt();
            }
            int days = countDays(date);
            System.out.println(days);
        }
    }

    private static int countDays(int[] date) {
        int days;
        Calendar cal = Calendar.getInstance();
        cal.set(date[0], date[1] - 1, date[2]);
        days = cal.get(Calendar.DAY_OF_YEAR);

        return days;
    }
}

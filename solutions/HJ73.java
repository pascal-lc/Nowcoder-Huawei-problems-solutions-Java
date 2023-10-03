import java.util.Scanner;

public class HJ73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int[] month = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            int[] dateArr = new int[3];
            for (int i = 0; i < 3; i++) {
                dateArr[i] = sc.nextInt();
            }
            int days = countDays(month, dateArr);

            System.out.println(days);
        }
    }
    
    private static int countDays(int[] month, int[] dateArr) {
        int days = 0;
        int leap = ((dateArr[0] % 4 == 0 && dateArr[0] % 100 != 0) || dateArr[0] % 400 == 0) ? 1 : 0;
        for (int i = 0; i < dateArr[1] - 1; i++) {
            days += month[i];
        }
        int leap_ = leap == 1 && dateArr[1] > 2 ? 1 : 0;
        days += dateArr[2] + leap_;

        return days;
    }
}

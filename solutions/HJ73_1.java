import java.util.Scanner;

public class HJ73_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int[] dateArr = new int[3];
            for (int i = 0; i < 3; i++) {
                dateArr[i] = sc.nextInt();
            }
            int days = countDays(dateArr);

            System.out.println(days);
        }
    }

    private static int countDays(int[] dateArr) {
        int days = 0;
        int leap = (dateArr[0] % 4 == 0 && dateArr[0] % 100 != 0) || dateArr[0] % 400 == 0 ? 1 : 0;

        switch (dateArr[1]) {
            case 12:
                days += 30;
            case 11:
                days += 31;
            case 10:
                days += 30;
            case 9:
                days += 31;
            case 8:
                days += 31;
            case 7:
                days += 30;
            case 6:
                days += 31;
            case 5:
                days += 30;
            case 4:
                days += 31;
            case 3:
                days += 28;
            case 2:
                days += 31;
            case 1:
                days += dateArr[2];
        }
        int leap_ = leap == 1 && dateArr[1] > 2 ? 1 : 0;
        days += leap_;

        return days;
    }
}

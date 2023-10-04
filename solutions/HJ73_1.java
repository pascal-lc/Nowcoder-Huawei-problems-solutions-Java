import java.util.Scanner;

public class HJ73_1 {
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
        int days = 0;

        switch (date[1]) {
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
                days += isLeapYear(date[0]) ? 29 : 28;
            case 2:
                days += 31;
            case 1:
                days += date[2];
        }

        return days;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}

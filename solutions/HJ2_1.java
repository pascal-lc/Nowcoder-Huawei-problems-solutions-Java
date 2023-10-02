import java.util.Scanner;

public class HJ2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String strChar = sc.nextLine();
        int count = 0;
        for (String s : str.split("")) {
            count = s.toUpperCase().equals(strChar.toUpperCase()) ? ++count : count;
        }

        System.out.println(count);
    }
}

import java.util.Scanner;

public class HJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
        int count = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                // 或者 str.substring(i, i + 1).equals(" ")
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}


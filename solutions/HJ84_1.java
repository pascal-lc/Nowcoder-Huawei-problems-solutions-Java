import java.util.Scanner;

public class HJ84_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            int count = countUpperLetterTraverse(str);

            System.out.println(count);
        }
    }

    private static int countUpperLetterTraverse(String str) {
        int len = str.length();
        char[] chars = str.toCharArray();

        int count = 0;
        for (char ch : chars) {
            // if (ch >= 'A' && ch <= 'Z') {
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }

        return count;
    }
}

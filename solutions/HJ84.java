import java.util.Scanner;

public class HJ84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            int count = countUpperLetterRegEx(str);

            System.out.println(count);
        }
    }

    private static int countUpperLetterRegEx(String str) {
        int count = str.replaceAll("[^A-Z]", "").length();
        return count;
    }
}

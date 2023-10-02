import java.util.*;

public class HJ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] strArr = str.split(" ");
            int len = strArr.length;

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < len; i++) {
                // System.out.print(strArr[len - 1 - i] + " ");
                sb.append(strArr[len - 1 - i] + " ");
            }
            String strReverse = sb.toString().trim();
            System.out.println(strReverse);
        }
    }
}
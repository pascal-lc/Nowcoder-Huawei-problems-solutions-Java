import java.util.*;

public class HJ106_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            StringBuilder sb = new StringBuilder(str);
            String strReverse = sb.reverse().toString();
            System.out.println(strReverse);
        }
    }
}

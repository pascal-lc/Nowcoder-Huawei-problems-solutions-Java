import java.util.*;
import java.util.regex.*;

public class HJ40_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            int lenStr = str.length();
            int lenStrArr = 4;
            String[] strArr = new String[lenStrArr];
            strArr[0] = str.replaceAll("[^A-Za-z]", "");
            strArr[1] = str.replaceAll("[^ ]", "");
            strArr[2] = str.replaceAll("[^0-9]", "");
            strArr[3] = str.replaceAll("[0-9A-Za-z ]", "");

            for (int i = 0; i < lenStrArr; i++) {
                System.out.println(strArr[i].length());
            }
        }
    }
}

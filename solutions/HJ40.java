import java.util.*;
import java.util.regex.*;

public class HJ40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            int len = str.length();
            char[] chars = str.toCharArray();
            int[] count = new int[4];
            // int countLetter = 0;
            // int countSpace = 0;
            // int countNumber = 0;
            // int countOthers = 0;

            for (int i = 0; i < len; i++) {
                if (Character.isLetter(chars[i])) {
                    count[0]++;
                } else if (Character.isSpaceChar(chars[i])) {
                    count[1]++;
                } else if (Character.isDigit(chars[i])) {
                    count[2]++;
                } else {
                    count[3]++;
                }
            }
            for (int i : count) {
                System.out.println(i);
            }
            // for (int i = 0; i < len; i++) {
            //     if (Character.isLetter(chars[i])) {
            //         countLetter++;
            //     } else if (Character.isSpaceChar(chars[i])) {
            //         countSpace++;
            //     } else if (Character.isDigit(chars[i])) {
            //         countNumber++;
            //     } else {
            //         countOthers++;
            //     }
            // }
        }
    }
}

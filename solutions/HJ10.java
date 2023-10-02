import java.util.Scanner;
import java.util.*;

public class HJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            // int lenStr = str.length();
            // char[] chars = str.toCharArray();
            // HashSet<Character> hashSet = new HashSet<>();
            HashSet<String> hashSet = new HashSet<>();
            for (String s : str.split("")) {
                hashSet.add(s);
            }

            int lenSet = hashSet.size();
            System.out.println(lenSet);
        }
    }
}

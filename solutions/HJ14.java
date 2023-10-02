import java.util.*;

public class HJ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        String temp0 = sc.nextLine();

        // while (n-- > 0) {
        //     strs[n] = sc.nextLine();
        //     System.out.println(n);
        // }

        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                // if (strs[i].compareTo(strs[j]) < 0) {
                if (strs[i].toCharArray()[0] < strs[j].toCharArray()[0]) {
                    String temp = strs[i];
                    strs[i] = strs[j];
                    strs[j] = temp;
                }
            }
        }
        for (String str : strs) {
            System.out.println(str);
        }
        // System.out.println(temp);
    }
}

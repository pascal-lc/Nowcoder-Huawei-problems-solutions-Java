import java.util.*;

public class HJ14_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n = Integer.valueOf(sc.nextLine());
        String[] strs = new String[n];

        while (n-- > 0) {
            strs[n] = sc.next();
        }

        // Arrays.sort(strs);
        // for (String str : strs) {
        //     System.out.println(str);
        // }
        Arrays.stream(strs).sorted().forEach(System.out::println);
    }
}

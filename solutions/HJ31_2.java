import java.util.*;

public class HJ31_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] strArr = str.split("[^A-Za-z]+");
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < strArr.length; i++) {
                sb.append(strArr[strArr.length - 1 - i] + " ");
            }

            System.out.println(sb.toString().trim());

            // for (String s : strArr) {
            //     System.out.print(s + " ");
            // }
        }
    }
}

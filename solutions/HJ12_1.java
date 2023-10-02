import java.util.Scanner;

public class HJ12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            StringBuilder sb = new StringBuilder(str);
            System.out.println(sb.reverse());
            // for (int i = str.length() - 1; i >= 0; i--) {
            //     sb.append(str.charAt(i));
            // }
            // System.out.println(sb.toString());
            // System.out.println();
            // sc.close();
            // break;
        }
    }
}

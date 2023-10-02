import java.util.Scanner;
import java.util.Stack;

public class HJ12_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            int len = str.trim().length();

            Stack st = new Stack();
            for (int i = 0; i < len; i++) {
                char ch = str.charAt(i);
                st.push(ch);
            }
            while (!st.empty()) {
                char ch = (char) st.pop();
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

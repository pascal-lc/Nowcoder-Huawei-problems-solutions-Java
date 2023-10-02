import java.util.Scanner;

public class HJ46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();

        // System.out.println(str.substring(0, k));

        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(chars[i]);
        }
        System.out.println(sb.toString());


        // char[] chars = str.toCharArray();
        // for (int i = 0; i < k; i++) {
        //     System.out.print(chars[i]);
        // }
    }
}

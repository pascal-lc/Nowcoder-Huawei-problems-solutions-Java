import java.util.Scanner;

public class HJ4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
        String str = sc.nextLine();
        // char[] chars = str.toCharArray();
        int len = str.length();
        int complement = 8 - (len % 8);
        complement = complement == 8 ? 0 : complement;

        int q = len / 8;
        for (int i = 0; i < q; i++) {
            System.out.println(str.substring(i * 8, (i + 1) * 8));
        }
        System.out.print(str.substring(q * 8));
        System.out.println("0".repeat(complement));

        // for (int i = 0; i < len; i++) {
        //     System.out.print(chars[i]);
        //     if ((i + 1) % 8 == 0) {
        //         System.out.println();
        //     }
        // }
        // for (int i = 0; i < complement; i++) {
        //     System.out.print("0");
        // }
        }
    }
}
import java.util.Scanner;

public class HJ96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            str = str.replaceAll("([0-9]+)", "*$1*");

            System.out.println(str);
        }
    }
}

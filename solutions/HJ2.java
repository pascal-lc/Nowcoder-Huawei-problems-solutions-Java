import java.util.Scanner;

public class HJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.nextLine().charAt(0);
        int count = 0;
        for (String s : str.split("")) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                if (s.equals(String.valueOf(c)) || s.equals(String.valueOf((char) (c + 32)))
                        || s.equals(String.valueOf((char) (c - 32)))) {
                    count++;
                }
            }
            else if (s.equals(String.valueOf(c))) {
                count++;
            }
        }

        System.out.println(count);
    }
}

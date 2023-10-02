import java.util.Scanner;

public class HJ21_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        char[] chars1 = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                chars1[i] = chars[i];
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                if (chars[i] >= 'a' && chars[i] <= 'c') {
                    chars1[i] = '2';
                } else if (chars[i] >= 'd' && chars[i] <= 'f') {
                    chars1[i] = '3';
                } else if (chars[i] >= 'g' && chars[i] <= 'i') {
                    chars1[i] = '4';
                } else if (chars[i] >= 'j' && chars[i] <= 'l') {
                    chars1[i] = '5';
                } else if (chars[i] >= 'm' && chars[i] <= 'o') {
                    chars1[i] = '6';
                } else if (chars[i] >= 'p' && chars[i] <= 's') {
                    chars1[i] = '7';
                } else if (chars[i] >= 't' && chars[i] <= 'v') {
                    chars1[i] = '8';
                } else {
                    chars1[i] = '9';
                }
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                if (chars[i] >= 'A' && chars[i] <= 'Y') {
                    chars1[i] = (char) (chars[i] + 32 + 1);
                } else {
                    chars1[i] = 'a';
                }
            }
        }
        
        String str1 = new String(chars1);
        System.out.println(str1);
    }
}

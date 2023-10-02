import java.util.Scanner;

public class HJ96_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nextLine = sc.nextLine();
        char[] chars = nextLine.toCharArray();

        StringBuilder sb = new StringBuilder();
        boolean flag = true;

        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                if (flag) {
                    sb.append("*").append(aChar);
                    flag = false;
                } else {
                    sb.append(aChar);
                }
            } else {
                if (!flag) {
                    sb.append("*").append(aChar);
                    flag = true;
                } else {
                    sb.append(aChar);
                }
            }
        }
        // 判断最后一个字符是否为数字
        if (Character.isDigit(sb.charAt(sb.length() - 1))) {
            sb.append("*");
        }
        System.out.println(sb.toString());
    }
}


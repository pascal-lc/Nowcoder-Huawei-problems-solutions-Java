import java.util.Scanner;

public class HJ39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int same = 0;
        final int invalid = 1;
        final int different = 2;
        int result = 0;

        while (scanner.hasNextLine()) {
            String mask = scanner.nextLine();
            String ip1 = scanner.nextLine();
            String ip2 = scanner.nextLine();

            if (!isValidMask(mask) || !isValidIP(ip1) || !isValidIP(ip2)) {
                // System.out.println(invalid);
                // return;
                result = invalid;
            }
            else if (isSameIP(mask, ip1, ip2)) {
                result = same;
            }
            else {
                result = different;
            }
            System.out.println(result);
            //System.out.println(Arrays.toString(mask));
        }
    }

    private static boolean isValidMask(String mask) {
        String[] maskStr = mask.split("\\.");
        if (maskStr.length != 4) {
            return false;
        }
        int[] m = new int[maskStr.length];
        for (int i = 0; i < maskStr.length; i++) {
            m[i] = Integer.parseInt(maskStr[i]);
        }
        boolean flag = true;
        for (int i = 0; i < m.length; i++) {
            if (m[i] < 0 || m[i] > 255) {
                flag = false;
                break;
            }
            if (i < 3) {
                if (m[i] < m[i + 1]) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
    
    private static boolean isValidIP(String ip) {
        String[] ipStr = ip.split("\\.");
        if (ipStr.length != 4) {
            return false;
        }
        // int[] m = new int[ipStr.length];
        // for (int i = 0; i < ipStr.length; i++) {
        //     m[i] = Integer.parseInt(ipStr[i]);
        // }
        // boolean flag = true;
        // for (int i = 0; i < m.length; i++) {
        //     if (m[i] < 0 || m[i] > 255) {
        //         flag = !flag;
        //         break;
        //     }
        // }

        boolean flag = true;
        for (String s : ipStr) {
            int num = Integer.parseInt(s);
            if (num < 0 || num > 255) {
                flag = !flag;
                break;
            }
        }
        return flag;
    }

    private static boolean isSameIP(String mask, String ip1, String ip2) {
        String[] maskStr = mask.split("\\.");
        String[] ip1Str = ip1.split("\\.");
        String[] ip2Str = ip2.split("\\.");

        boolean flag = true;
        for (int i = 0; i < maskStr.length; i++) {
            int num0 = Integer.parseInt(maskStr[i]);
            int num1 = Integer.parseInt(ip1Str[i]);
            int num2 = Integer.parseInt(ip2Str[i]);

            if ((num0 & num1) != (num0 & num2)) {
                flag = !flag;
                break;
            }
        }
        return flag;
    }
}

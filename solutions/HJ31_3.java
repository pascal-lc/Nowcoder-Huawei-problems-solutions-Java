import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HJ31_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        ArrayList<String> result = new ArrayList<>();
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                temp += c;
            } else {
                if (temp.length() > 0) {
                    result.add(temp);
                    temp = "";
                }
            }
        }
        if (temp.length() > 0) {
            result.add(temp);
        }

        for (int i = result.size() - 1; i >= 0; i--) {
            if (i == 0)
                System.out.print(result.get(i));
            else
                System.out.print(result.get(i) + " ");
        }
    }
}

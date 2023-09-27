import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ31_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //只匹配字母
        String []split = bf.readLine().split("[^a-zA-Z]+");
        StringBuilder result = new StringBuilder();
        for (int i = split.length - 1; i >= 0; i--)
            result.append(split[i] + " ");
        System.out.println(result.toString().trim());
    }
}

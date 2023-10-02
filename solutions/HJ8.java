import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tabSize = sc.nextInt();
        Map<Integer, Integer> table = new HashMap<>(tabSize);

        for (int i = 0; i < tabSize; i++) {
            int key = sc.nextInt();
            int value = sc.nextInt();
            if (table.containsKey(key)) {
                table.put(key, table.get(key) + value);
            } else {
                table.put(key, value);
            }
        }

        table.keySet().stream().sorted().forEach(key -> System.out.println(key + " " + table.get(key)));

        // for (Integer key : table.keySet()) {
        //     System.out.println(key + " " + table.get(key));
        // }
    }
}

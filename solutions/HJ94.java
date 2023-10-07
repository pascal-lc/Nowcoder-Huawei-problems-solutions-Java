import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HJ94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int n = Integer.parseInt(sc.nextLine().trim());
            String candidates = sc.nextLine();
            int sum = Integer.parseInt(sc.nextLine().trim());
            String polls = sc.nextLine();

            String[] listCandidates = candidates.split(" ");
            Map<String, Integer> map = new LinkedHashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(listCandidates[i], 0);
            }
            map.put("Invalid", 0);

            String[] listPolls = polls.split(" ");
            for (int i = 0; i < sum; i++) {
                try {
                    // map.put(listPolls[i], map.get(listPolls[i]) + 1);
                    map.replace(listPolls[i], map.get(listPolls[i]) + 1);
                } catch (Exception e) {
                    // TODO: handle exception
                    map.put("Invalid", map.get("Invalid") + 1);
                }
            }

            // System.out.println(map);
            for (String key : map.keySet()) {
                System.out.println(key + " : " + map.get(key));
            }
        }
    }
}

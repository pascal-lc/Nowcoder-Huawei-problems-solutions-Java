import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HJ94_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            // int n = Integer.parseInt(sc.nextLine().trim());
            int n = sc.nextInt();
            sc.nextLine();
            String candidates = sc.nextLine();
            // int sum = Integer.parseInt(sc.nextLine().trim());
            int sum = sc.nextInt();
            sc.nextLine();
            String polls = sc.nextLine();

            Map<String, Integer> map = pollsCount(n, candidates, sum, polls);
            outputFormat(map);
        }
    }

    private static Map<String, Integer> pollsCount(int n, String candidates, int sum, String polls) {
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

        return map;
    }

    private static void outputFormat(Map<String, Integer> map) {
        // System.out.println(map);
        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}

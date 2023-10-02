import java.util.*;

public class HJ53_3 {
    public static List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            res.clear();
            for (int i = 0; i < n; i++) {
                List<Integer> row = new ArrayList<>();
                for (int j = 0; j < 2 * i + 1; j++) {
                    if (j == 0 || j == 2 * i) {
                        row.add(1);//首尾
                    } else if (j == 1) {//第二个
                        if (i == 1) {
                            row.add(1);//第二行的第二个比较特殊是1
                        } else {
                            row.add(res.get(i - 1).get(0) + res.get(i - 1).get(1));//其他行第二个
                        }
                    } else if (j == 2 * i - 1) {
                        row.add(res.get(i - 1).get(2 * (i - 1)) + res.get(i - 1).get(2 * (i - 1) - 1));//倒数第二个
                    } else {
                        row.add(res.get(i - 1).get(j) + res.get(i - 1).get(j - 1) + res.get(i - 1).get(j - 2));//中间的
                    }
                }
                res.add(row);
            }
            boolean flag = false;
            for (int i = 0; i < res.get(n - 1).size(); i++) {
                if (res.get(n - 1).get(i) % 2 == 0) {
                    System.out.println(i + 1);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(-1);
            }
        }

    }
}
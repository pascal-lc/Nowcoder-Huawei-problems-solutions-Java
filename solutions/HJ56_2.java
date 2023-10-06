// 比较有意思的题，使用一维动态规划求解
import java.util.*;

public class HJ56_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(process(n));
        }
    }

    public static int process(int n) {
        // 数组元素初始化都为 0
        int[] dp = new int[n + 1];
        // 获取数 n 中所有除自身以外的约数
        Set<Integer> list = new HashSet<>();
        for (int i = 6; i <= n; i++) {
            list = getFactors(i);
            // 计算 n 是不是完全数
            // n 以内的完全数依次传递
            dp[i] = dp[i - 1];
            if (isPerfectNum(list, i)) {
                dp[i] = dp[i - 1] + 1;
            }
        }
        return dp[n];
    }

    public static Set<Integer> getFactors(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                set.add(i);
                set.add(n / i);
            }
        }
        return set;
    }

    public static boolean isPerfectNum(Set<Integer> list, int n) {
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        return sum == n;
    }
}

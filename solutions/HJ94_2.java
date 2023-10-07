import java.util.Scanner;

public class HJ94_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            // 1.输入初始化
            int n = sc.nextInt(); // 候选人数
            String[] name = new String[n]; // 候选人名字
            for (int i = 0; i < n; i++) {
                name[i] = sc.next();
            }

            int m = sc.nextInt(); // 投票人数
            String[] select = new String[m]; // 投票人投票的候选人
            for (int i = 0; i < m; i++) {
                select[i] = sc.next();
            }

            // 2.统计票数
            // 四个人的票数统计，此处下标为n的表示统计不合法的字符数
            int[] count = new int[n + 1];
            for (int i = 0; i < m; i++) {
                boolean flag = false; // 标记该投票是否合法
                for (int j = 0; j < n; j++) {
                    if (select[i].equals(name[j])) {
                        count[j]++;
                        flag = true; // 合法标记
                        break;
                    }
                }
                if (!flag) { // 如果不合法，将不合法+1
                    count[n]++;
                }
            }

            // 3.打印结果
            for (int i = 0; i < count.length; i++) {
                if (i == n) { // 输出不合法的字符
                    System.out.println("Invalid : " + count[i]);
                    break;
                }
                System.out.println(name[i] + " : " + count[i]);
            }
        }
    }
}

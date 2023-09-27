import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * HJ3 明明的随机数
 * 描述
明明生成了N个1到500之间的随机整数。请你删去其中重复的数字，
即相同的数字只保留一个，把其余相同的数去掉，然后再把这些数从小到大排序，按照排好的顺序输出。

数据范围： 

1≤n≤1000  ，输入的数字大小满足 

1≤val≤500 
输入描述：
第一行先输入随机整数的个数 N。接下来的 N 行每行输入一个整数，代表明明生成的随机数。
具体格式可以参考下面的"示例"。

输出描述：
输出多行，表示输入数据处理后的结果

示例1
输入：
3
2
2
1

输出：
1
2

说明：
输入解释：
第一个数字是3，也即这个小样例的N=3，说明用计算机生成了3个1到500之间的随机整数，接下来每行一个随机数字，共3行，也即这3个随机数字为：
2
2
1
所以样例的输出为：
1
2
 */

public class Main17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int len = 0;

        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            boolean repeat = false;
            if (i == 0) {
                arr[len++] = temp;
                continue;
            } else {
                for (int j = 0; j < len; j++) {
                    if (arr[j] == temp) {
                        repeat = true;
                        break;
                    }
                }
                if (!repeat) {
                    arr[len++] = temp;
                }
            }
        }

        sort(arr, len);
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void sort(int[] arr, int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

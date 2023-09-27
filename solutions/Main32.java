import java.util.Scanner;

/*
 * HJ6 质数因子
 * 描述
功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）


数据范围：1 ≤ n ≤ 2×10^9+14
输入描述：
输入一个整数

输出描述：
按照从小到大的顺序输出它的所有质数的因子，以空格隔开。

示例1
输入：
180

输出：
2 2 3 3 5
 */

public class Main32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] primes = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43};
        int[] primeFactors = new int[10];

        int j = 0;
        int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            while (num % i == 0) {
                primeFactors[j++] = i;
                num /= i;
            }
        }

        // int i = 0, j = 0;
        // while (num != 1) {
        //     int r = num % primes[j];
        //     if (r == 0) {
        //         primeFactors[i] = primes[j];
        //         num /= primes[j];
        //         i++;
        //     } else {
        //         j++;
        //     }
        // }
        for (int k = 0; k < j; k++) {
            System.out.print(primeFactors[k] + " ");
        }
        System.out.println(num == 1 ? "" : num);
    }
}

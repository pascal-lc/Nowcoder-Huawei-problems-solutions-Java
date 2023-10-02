import java.util.Scanner;

public class HJ6 {
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

import java.util.Arrays;
import java.util.Scanner;

public class HJ80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int m = sc.nextInt();
            int[] arrM = new int[m];
            for (int i = 0; i < m; i++) {
                arrM[i] = sc.nextInt();
            }
            int n = sc.nextInt();
            int[] arrN = new int[n];
            for (int i = 0; i < n; i++) {
                arrN[i] = sc.nextInt();
            }

            int[] arrMerged = arrMerge(arrM, m, arrN, n);
            for (int i : arrMerged) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private static int[] arrMerge(int[] arrM, int m, int[] arrN, int n) {
        int[] arrMerged = new int[m + n];
        Arrays.sort(arrM);
        Arrays.sort(arrN);
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (arrM[i] <= arrN[j]) {
                if (k == 0 || arrMerged[k - 1] != arrM[i]) {
                    arrMerged[k++] = arrM[i++];
                } else {
                    i++;
                }
            } else if (arrM[i] > arrN[j]) {
                if (k == 0 || arrMerged[k - 1] != arrN[j]) {
                    arrMerged[k++] = arrN[j++];
                } else {
                    j++;
                }
            }
        }
        while (i < m) {
            if (k == 0 || arrMerged[k-1] != arrM[i]) {
                arrMerged[k++] = arrM[i++];
            } else {
                i++;
            }
        }
        while (j < n) {
            if (k == 0 || arrMerged[k-1] != arrN[j]) {
                arrMerged[k++] = arrN[j++];
            } else {
                j++;
            }
        }

        int[] arrMergedTrim = new int[k];
        for (int i_ = 0; i_ < k; i_++) {
            arrMergedTrim[i_] = arrMerged[i_];
        }

        return arrMergedTrim;
    }
}

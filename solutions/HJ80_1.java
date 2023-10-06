import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HJ80_1 {
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

            List<Integer> listMerged = arrMerge(arrM, m, arrN, n);
            for (int i : listMerged) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private static List<Integer> arrMerge(int[] arrM, int m, int[] arrN, int n) {
        List<Integer> listMerged = new ArrayList<>();
        Arrays.sort(arrM);
        Arrays.sort(arrN);
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arrM[i] <= arrN[j]) {
                if (listMerged.isEmpty() || listMerged.get(listMerged.size() - 1) != arrM[i]) {
                    listMerged.add(arrM[i++]);
                } else {
                    i++;
                }
            } else if (arrM[i] > arrN[j]) {
                if (listMerged.isEmpty() || listMerged.get(listMerged.size() - 1) != arrN[j]) {
                    listMerged.add(arrN[j++]);
                } else {
                    j++;
                }
            }
        }
        while (i < m) {
            if (listMerged.isEmpty() || listMerged.get(listMerged.size() - 1) != arrM[i]) {
                listMerged.add(arrM[i++]);
            } else {
                i++;
            }
        }
        while (j < n) {
            if (listMerged.isEmpty() || listMerged.get(listMerged.size() - 1) != arrN[j]) {
                listMerged.add(arrN[j++]);
            } else {
                j++;
            }
        }

        return listMerged;
    }
}

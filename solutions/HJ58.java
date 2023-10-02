import java.util.Scanner;

public class HJ58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // ascSort(arr, n);
        quickSort(arr, 0, n-1);

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void ascSort(int[] arr, int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = arr[start];
        int left = start;
        int right = end;

        while (left < right) {
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            arr[left] = arr[right];

            while (left < right && arr[left] <= pivot) {
                left++;
            }
            arr[right] = arr[left];
        }

        arr[left] = pivot;

        quickSort(arr, start, left - 1);
        quickSort(arr, left + 1, end);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

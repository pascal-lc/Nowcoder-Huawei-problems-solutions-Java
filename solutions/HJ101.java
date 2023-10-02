import java.util.Scanner;

public class HJ101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int flag = sc.nextInt();

        quickSort(arr, 0, n - 1);
        // quickSort(arr, 0, n - 1, flag);

        // if (flag == 0) {
        //     for (int i : arr) {
        //         System.out.print(i + " ");
        //     }
        // }
        // else if (flag == 1) {
        //     for (int i = n - 1; i >= 0; i--) {
        //         System.out.print(arr[i] + " ");
        //     }
        // }

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (flag == 0) {
                j = i;
            } else if (flag == 1) {
                j = n - 1 - i;
            }
            System.out.print(arr[j] + " ");
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
            while (left < right && arr[--right] >= pivot);
            arr[left] = arr[right];

            while (left < right && arr[++left] <= pivot);
            arr[right] = arr[left];
        }
        arr[left] = pivot;

        quickSort(arr, start, left - 1);
        quickSort(arr, left + 1, end);
    }

    // private static void quickSort(int[] arr, int start, int end) {
    //     if (start >= end) {
    //         return;
    //     }

    //     int left = start;
    //     int right = end;
    //     int pivot = arr[left];
    //     while (left < right) {
    //         while (left < right && arr[right] >= pivot) {
    //             right--;
    //         }
    //         arr[left] = arr[right];
    //         while (left < right && arr[left] <= pivot) {
    //             left++;
    //         }
    //         arr[right] = arr[left];
    //     }
    //     quickSort(arr, start, end - 1);
    //     quickSort(arr, start + 1, end);
    // }
}

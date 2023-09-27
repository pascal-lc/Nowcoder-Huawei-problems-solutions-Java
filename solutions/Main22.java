import java.util.Scanner;

/*
 * HJ101 输入整型数组和排序标识，对其元素按照升序或降序进行排序
 * 描述
输入整型数组和排序标识，对其元素按照升序或降序进行排序

数据范围：1≤n≤1000，元素大小满足0≤val≤100000

输入描述：
第一行输入数组元素个数
第二行输入待排序的数组，每个数用空格隔开
第三行输入一个整数0或1。0代表升序排序，1代表降序排序

输出描述：
输出排好序的数字

示例1
输入：
8
1 2 4 9 3 55 64 25
0

输出：
1 2 3 4 9 25 55 64

示例2
输入：
5
1 2 3 4 5
1

输出：
5 4 3 2 1
 */

public class Main22 {
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

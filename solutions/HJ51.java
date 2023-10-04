import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HJ51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(sc.nextInt());
        }
        int k = sc.nextInt();
        Iterator iter = linkedList.iterator();
        int count = 0;
        while (iter.hasNextInt) {
            count++;
            if (count == k) {
                Iterator iter2 = linkedList.iterator();
            }
            int temp1 = iter.nextInt();
            int temp2 = iter2.nextInt();
        }
    }
}

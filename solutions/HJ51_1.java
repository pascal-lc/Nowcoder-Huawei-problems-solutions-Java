import java.util.Scanner;

public class HJ51_1 {
    private static class LinkedListNode {
        int m_nKey;
        LinkedListNode next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            LinkedListNode head = new LinkedListNode();
            head.next = null;
            LinkedListNode tail = head;
            for (int i = 0; i < n; i++) {
                LinkedListNode node = new LinkedListNode();
                node.m_nKey = sc.nextInt();
                tail.next = node;
                tail = node;
                tail.next = null;
            }
            int k = sc.nextInt();
            int reverseK = getReverseKth(head, k);

            System.out.println(reverseK);
        }
    }

    private static int getReverseKth(LinkedListNode head, int k) {
        int count = 0;
        LinkedListNode nodeSlow = head.next;
        for (LinkedListNode nodeFast = head.next; nodeFast != null; nodeFast = nodeFast.next) {
            if (count >= k) {
                nodeSlow = nodeSlow.next;
            }
            count++;
        }
        return nodeSlow.m_nKey;
    }
}

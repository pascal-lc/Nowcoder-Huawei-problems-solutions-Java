import java.util.Scanner;

public class HJ51_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            LinkedListNode head = new LinkedListNode();
            head.next = null;
            LinkedListNode tail = head;
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                LinkedListNode node = new LinkedListNode(val, tail.next);
                tail.next = node;
                tail = node;
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

class LinkedListNode {
    int m_nKey;
    LinkedListNode next;

    LinkedListNode() {
    }

    LinkedListNode(int m_nKey) {
        this.m_nKey = m_nKey;
    }

    LinkedListNode(int m_nKey, LinkedListNode next) {
        this.m_nKey = m_nKey;
        this.next = next;
    }
}

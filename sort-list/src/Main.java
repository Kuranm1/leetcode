public class Main {
    public static ListNode merge(ListNode firstHead, ListNode secondHead) {
        ListNode dummyHead = new ListNode(0);
        ListNode temp = dummyHead;
        while (firstHead != null && secondHead != null) {
            if (firstHead.val < secondHead.val) {
                temp.next = new ListNode(firstHead.val);
                firstHead = firstHead.next;
            }
            else {
                temp.next = new ListNode(secondHead.val);
                secondHead = secondHead.next;
            }
                temp = temp.next;
        }

        if (firstHead != null) temp.next = firstHead;
        if (secondHead != null) temp.next = secondHead;

        return dummyHead.next;
    }

    public static int listLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    public static ListNode[] breakHalf(ListNode head) {
        ListNode[] result = new ListNode[2];
        int halfLength = listLength(head)/2;
        int count = 0;
        ListNode first = new ListNode(0);
        ListNode firstCurrent = first;
        ListNode second = new ListNode(0);
        ListNode secondCurrent = second;
        while (head != null) {
            ListNode temp = new ListNode(head.val);
            if (count < halfLength){
                firstCurrent.next = temp;
                firstCurrent = firstCurrent.next;
            }
            else {
                secondCurrent.next = temp;
                secondCurrent = secondCurrent.next;
            }
            count++;
            head = head.next;
        }
        result[0] = first.next;
        result[1] = second.next;
        return result;
    }

    public static ListNode sortList(ListNode head) {
        // Base case
        if (head == null || listLength(head) == 1) return head;
        // Break list in half and call recursively on each list
        ListNode[] nodes = breakHalf(head);
        ListNode left = sortList(nodes[0]);
        ListNode right = sortList(nodes[1]);
        // Merge two sorted list
        return merge(left, right);
    }


    public static void main(String[] args) {

        // Initialize an unsorted list
        int[] temp = {1,4,2,7};
        ListNode head = new ListNode(5);
        ListNode cur = head;
        for (int j : temp) {
            cur.next = new ListNode(j);
            cur = cur.next;
        }

        // Sort the list and print it
        cur = sortList(head);
        System.out.print("After sort:");
        while (cur != null) {
            System.out.print(" " + cur.val);
            cur = cur.next;
        }
    }
}
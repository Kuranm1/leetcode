public class Solution {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode beforeSlow = null;

        // Fast pointer will jump Nth times
        for (int i = 0; i < n; i++) {
            if (fast == null ) return null ;
            fast = fast.next;
        }

        // Slow,Faster pointers will move one step until the end of linked list
        // Slow pointer will point the Nth From end node
        while (fast != null){
            beforeSlow = slow;
            slow = slow.next;
            fast = fast.next;
        }

        // Remove the Node
        if (beforeSlow == null) { // if Nth From end node is the first node -> juts move head one step
            ListNode temp = head.next;
            head.val = temp.val;
            head.next = temp.next;
            return head;
        }
        else {
            beforeSlow.next = slow.next;
            slow.next = null;
        }

        return head;
    }

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        int k = 2;
        removeNthFromEnd(myLinkedList.getHead(),k);
        myLinkedList.printList();
    }
}

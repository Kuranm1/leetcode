public class Solution {
    public static ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode before = null;
        ListNode after = head.next;
        while (after != null){
            head.next = before;
            before = head;
            head = after;
            after = after.next;
        }
        head.next = before;
        return head;
    }
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);

        myLinkedList.setHead(reverseList(myLinkedList.getHead()));

        myLinkedList.printList();
    }
}

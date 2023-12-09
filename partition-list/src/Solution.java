public class Solution{

    public static ListNode partition(ListNode head, int x) {
        ListNode firstListHead = null;
        ListNode firstListTail = firstListHead;
        ListNode secondListHead = null;
        ListNode secondListTail = secondListHead;

        while (head != null){
            if (head.val < x){
                if (firstListHead == null){
                    firstListHead = new ListNode(head.val);
                    firstListTail = firstListHead;
                }else {
                    ListNode temp = firstListTail;
                    firstListTail = new ListNode(head.val);
                    temp.next = firstListTail;
                }
            }else {
                if (secondListHead == null){
                    secondListHead = new ListNode(head.val);
                    secondListTail = secondListHead;
                } else {
                    ListNode temp = secondListTail;
                    secondListTail = new ListNode(head.val);
                    temp.next = secondListTail;
                }
            }
            head = head.next;
        }

        if (firstListHead == null) return  secondListHead;

        firstListTail.next = secondListHead;
        return firstListHead;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList(3);
        ll.append(5);
        ll.append(8);
        ll.append(10);
        ll.append(2);
        ll.append(1);
        ll.setHead(partition(ll.getHead(),3));
        ll.printList();
    }
}

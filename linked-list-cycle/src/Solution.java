public class Solution {
    public static boolean hasCycle(ListNode head) {
        boolean hasLoop = false;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow){
                hasLoop = true;
                break;
            }
        }
        return hasLoop;
    }
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//        myLinkedList.append(4);
//        myLinkedList.append(5);

        // create a loop by connecting the tail to the second node
        myLinkedList.getTail().next = myLinkedList.getHead();


        System.out.println("Has Loop:");
        System.out.println(hasCycle(myLinkedList.getHead()));
    }
}

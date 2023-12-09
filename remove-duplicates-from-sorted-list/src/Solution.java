public class Solution {
    
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode pointer = head;
        while (pointer != null && pointer.next != null ){
            if (pointer.val == pointer.next.val){
                pointer.next = pointer.next.next;
            } else {
                pointer = pointer.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);

        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.append(4);

        myLinkedList.setHead(deleteDuplicates(myLinkedList.getHead()));

        myLinkedList.printList();

    }
}

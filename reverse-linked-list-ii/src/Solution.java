public class Solution {
    public static ListNode reverseBetween(ListNode head, int left, int right) {

        if (right - left <= 0) return head;
        if(head == null) return null;

        // Get the sublist to be reversed
        ListNode subListHead = head;
        ListNode subListHeadPrevious = null;
        for (int i = 1; i < left; i++) {
            subListHeadPrevious = subListHead;
            subListHead = subListHead.next;
        }


        // reverse sublist
        ListNode subListTail = subListHead;
        ListNode before = null;
        ListNode after = subListHead.next;
        for (int i = 0; i < right-left; i++) {
            subListHead.next = before;
            before = subListHead;
            subListHead = after;
            if(after != null) after = after.next;
        }
        subListHead.next = before;

        // Prepare the final list
        // Connect sublist head and tail to the original list
        subListTail.next = after;
        if(subListHeadPrevious == null)
            return subListHead;
        subListHeadPrevious.next = subListHead;

        return head;
    }

    public static void main(String[] args) {
        // Create a linked list with values 1, 2, 3, 4, and 5
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        System.out.println("Original linked list: ");
        myLinkedList.printList();

        // Reverse a sublist within the linked list
        System.out.println("\nReversed sublist (2, 4): ");
        myLinkedList.setHead(reverseBetween(myLinkedList.getHead(),2, 4));
        myLinkedList.printList();

        // Reverse another sublist within the linked list
        System.out.println("\nReversed entire linked list: ");
        myLinkedList.setHead(reverseBetween(myLinkedList.getHead(),0, 4));
        myLinkedList.printList();

        // Reverse a sublist of length 1 within the linked list
        System.out.println("\nReversed sublist of length 1 (2, 2): ");
        myLinkedList.setHead(reverseBetween(myLinkedList.getHead(),2, 2));
        myLinkedList.printList();

        // Reverse an empty linked list
        LinkedList emptyList = new LinkedList();
        System.out.println("\nReversed empty linked list: ");
        myLinkedList.setHead(reverseBetween(myLinkedList.getHead(),0, 0));
        emptyList.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            Original linked list:
            1
            2
            3
            4
            5

            Reversed sublist (2, 4):
            1
            4
            3
            2
            5

            Reversed entire linked list:
            5
            2
            3
            4
            1

            Reversed sublist of length 1 (2, 2):
            5
            2
            3
            4
            1

            Reversed empty linked list:

        */

    }
}

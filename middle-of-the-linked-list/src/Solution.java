
public class Solution {

    // my first solution
    public static ListNode middleNode(ListNode head) {
        ListNode middleNode = head;
        // get the length of the linkedList
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }

        int middleNodeIndex = length / 2;
        for (int i = 0; i < middleNodeIndex ; i++) {
            middleNode = middleNode.next;
        }
        return middleNode;
    }

    // another solution
    public static ListNode middleNode2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        System.out.println(middleNode(linkedList.getHead()).val);

    }
}

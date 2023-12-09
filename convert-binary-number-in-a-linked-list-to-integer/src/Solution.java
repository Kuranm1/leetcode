public class Solution {
    public static int getDecimalValue(ListNode head) {
        int result = 0 ;
        if (head == null) return result;

        int maxPowerValue = 0;
        int length = 0;

        ListNode temp = head;
        while (temp != null){
            temp = temp.next;
            length++;
        }

        maxPowerValue = (int) Math.pow(2, length-1);
        temp = head;
        while (temp != null){
            result +=  temp.val * maxPowerValue;
            maxPowerValue /= 2;
            temp = temp.next;
        }
        return result;
    }

    public static void main(String[] args) {

        // ---------------
        // Convert 1011 to 11
        // ---------------
        LinkedList list1 = new LinkedList(1);
        list1.append(0);
        list1.append(1);
        list1.append(1);
        System.out.println("Convert 1011 to 11:");
        System.out.println("Input: 1 -> 0 -> 1 -> 1");
        System.out.println("Output: " + getDecimalValue(list1.getHead()));
        System.out.println("---------------");

        // ---------------
        // Convert 1100 to 12
        // ---------------
        LinkedList list2 = new LinkedList(1);
        list2.append(1);
        list2.append(0);
        list2.append(0);
        System.out.println("Convert 1100 to 12:");
        System.out.println("Input: 1 -> 1 -> 0 -> 0");
        System.out.println("Output: " + getDecimalValue(list2.getHead()));
        System.out.println("---------------");

        // ---------------
        // Convert 1 to 1
        // ---------------
        LinkedList list3 = new LinkedList(1);
        System.out.println("Convert 1 to 1:");
        System.out.println("Input: 1");
        System.out.println("Output: " + getDecimalValue(list3.getHead()));
        System.out.println("---------------");

        // ---------------
        // Convert empty list to 0
        // ---------------
        LinkedList list4 = new LinkedList();
        System.out.println("Convert empty list to 0:");
        System.out.println("Input: empty");
        System.out.println("Output: " + getDecimalValue(list4.getHead()));
        System.out.println("---------------");

    }
}

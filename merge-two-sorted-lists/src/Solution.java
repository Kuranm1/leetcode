public class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode sortedListHead = new ListNode();
        ListNode temp = sortedListHead;

        while(list1 != null && list2 != null){
            if(list1.val>list2.val){
                temp.next = list2;
                list2 = list2.next;
            }
            else{
                temp.next = list1;
                list1 = list1.next;
            }
            temp = temp.next;
        }
        temp.next = (list1 == null) ? list2 : list1;

        return sortedListHead.next;
    }
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList(1);
        list1.append(1);
        list1.append(2);
        list1.append(2);
        list1.append(3);
        list1.append(4);
        list1.append(9);

        LinkedList list2 = new LinkedList(1);
        list2.append(3);
        list2.append(5);
        list2.append(6);


        LinkedList list3 = new LinkedList();
        list3.setHead(mergeTwoLists(list1.getHead(),list2.getHead()));
        list3.printList();

    }
}

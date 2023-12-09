
public class LinkedList {

    private ListNode head;
    private ListNode tail;
    private int length = 0;

    LinkedList(){
    }
    LinkedList(int value){
        head = new ListNode(value);
        tail = head;
        length = 1;
    }


    public ListNode getHead() {
        return head;
    }


    public ListNode getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    // Get by index O(n)
    public ListNode get(int index){
        ListNode foundNode = null;
        if (index >= 0 && index < length){
            foundNode = head;
            for (int i = 1; i <= index ; i++) {
                foundNode = foundNode.next;
            }
        }
        return foundNode;
    }

    // Set by index O(n)
    public boolean set(int index, int value) {
        ListNode foundNode = get(index);
        if (foundNode != null) {
            foundNode.val = value;
            return true;
        }
        return false;
    }

    // Add last O(1)
    public void append(int value){
        ListNode newNode = new ListNode(value);
        if (isEmpty())
            head = newNode;
        else
            tail.next = newNode;
        tail = newNode;
        length++;
    }

    // Remove last O(n)
    public ListNode removeLast(){
        if (isEmpty()) return null;
        ListNode lastNode = tail;
        if (this.length == 1) {
            head = null;
            tail = null;
        } else{
            ListNode newLastNode = get(length-2);
            newLastNode.next = null;
            tail = newLastNode;
        }
        length--;
        return lastNode;
    }

    // Add first O(1)
    public void prepend(int value){
        ListNode newNode = new ListNode(value);
        if (isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    // Remove first O(1)
    public ListNode removeFirst(){
        ListNode firstElement = null;
        if (!isEmpty()){
            firstElement = head;
            if (length == 1){
                head = null;
                tail = null;
            } else {
                head = head.next;
            }
            firstElement.next = null;
            length--;
        }
        return firstElement;
    }

    // Reverse O(n)
    public void reverse(){
        ListNode pointer = head;
        head = tail;
        tail = pointer;
        ListNode nextNode;
        ListNode previousNode = null;
        for (int i = 0; i < length ; i++){
            nextNode = pointer.next; // hold the next ListNode to be reversed
            pointer.next = previousNode; // reverse the ListNode next pointer to point backward
            previousNode = pointer;  // move the previous ListNode one step
            pointer = nextNode; // move the pointer one step
        }
    }

    // Insert at index O(n)
    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;
        if (index == 0)
            prepend(value);
        else if (index == length)
            append(value);
        else{
            ListNode newNode = new ListNode(value);
            ListNode temp = get(index-1);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        length++;
        return true;
    }

    // Remove at index O(n)
    public ListNode remove(int index) {
        if (index < 0 || index > length) return null;
        if (index == 0)  return removeFirst();
        if (index == length) return removeLast();
        ListNode removedElement = get(index);
        ListNode perElement = get(index-1);
        perElement.next = removedElement.next;
        removedElement.next = null;
        length--;
        return removedElement;
    }
    public boolean isEmpty(){
        return this.length == 0;
    }
    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.val);
            System.out.println("Tail: " + tail.val);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
}



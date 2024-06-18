import java.util.PriorityQueue;

class KthLargest {

    private int k;
    private int[] nums;

    PriorityQueue<Integer> minHeap;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
        minHeap = new PriorityQueue<>();
        for (int num : nums) add(num);
    }

    public int add(int val) {
        minHeap.add(val);
        if (minHeap.size() > k) minHeap.poll();
        return minHeap.peek();
    }
}
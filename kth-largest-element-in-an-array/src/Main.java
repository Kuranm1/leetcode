import java.util.PriorityQueue;

public class Main {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue();

        for (int i = 0; i < k ; i++){
            minHeap.add(nums[i]);
        }

        for (int i = k ; i < nums.length ; i++){
            
                if (nums[i] > minHeap.peek() ){
                    minHeap.poll();
                    minHeap.add(nums[i]);
                }
        }
        return minHeap.peek();

        // Second solution
        // Arrays.sort(nums);
        // int large = nums.length-k;
        //return nums[large];
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(findKthLargest(nums,k));
    }
}
import java.util.HashMap;

public class Solution {


    // O(n)
    public static int subarraySum(int[] nums, int k) {
        int total = 0;
        int cumulativeSum = 0;
        HashMap<Integer,Integer> sumFreq = new HashMap<>();
        sumFreq.put(0,1); // for the first subarray
        for (int num : nums) {
            cumulativeSum = cumulativeSum + num;
            if (sumFreq.containsKey(cumulativeSum - k)) {
                total += sumFreq.get(cumulativeSum - k);
            }
            sumFreq.put(cumulativeSum, sumFreq.getOrDefault(cumulativeSum, 0) + 1);
        }
        return total;
    }

    // O(n^2)
    public static int oldSubarraySum(int[] nums, int k) {
        int total = 0;
        int sum;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i];
            if (sum == k) {
                total++;
            }
            for (int j = i+1; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum == k){
                    total++;
                }
            }
        }

        return total;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,-3,-3,3};
        int k = 3;

        System.out.println(subarraySum(nums,k));
    }
}

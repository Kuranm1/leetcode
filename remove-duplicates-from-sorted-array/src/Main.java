import java.util.Arrays;

public class Main {
    public static int removeDuplicates(int[] nums) {
        int current = nums[0];
        int currentIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > current) {
                nums[++currentIndex] = nums[i];
                current = nums[i];
            }
        }
        return currentIndex+1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4};
        int k = removeDuplicates(nums);
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
    }
}

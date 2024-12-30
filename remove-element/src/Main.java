import java.util.Arrays;

public class Main {
    public static int removeElement(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != val) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
        int counter = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != val) break;
            counter++;
        }
        return nums.length - counter ;
    }

    public static void main(String[] args) {

        int[] nums = {0,1,2,2,3,0,4,2};
        int lengthAfterRemove  = removeElement(nums, 2);
        System.out.println(lengthAfterRemove);
        System.out.println(Arrays.toString(nums));
    }
}

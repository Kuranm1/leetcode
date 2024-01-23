import java.util.HashMap;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int [] _twoSum = new int[2];

        HashMap<Integer,Integer> numsIndex = new HashMap<>();

        int firstNum;
        int secondNum;
        for (int i = 0 ; i < nums.length ; i++){
            firstNum = nums[i];
            secondNum = target - firstNum;
            if (numsIndex.containsKey(secondNum)){
                _twoSum[0] = i;
                _twoSum[1] = numsIndex.get(secondNum);
                break;
            }
            numsIndex.put(firstNum,i);
        }
        return _twoSum;

    }

    public static void main(String[] args) {

    }
}

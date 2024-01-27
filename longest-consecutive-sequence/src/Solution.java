import java.util.*;

public class Solution {
    public static int longestConsecutive(int[] nums) {

        int _longestConsecutive = 0;
        int tempLongestConsecutive;

        Set<Integer> numsHash = new HashSet<>();
        for (int num : nums) {
            numsHash.add(num);
        }

        for (int num : numsHash) {
            if (!numsHash.contains(num-1)){
                tempLongestConsecutive = 1;
                while (numsHash.contains(num + 1)){
                    tempLongestConsecutive++;
                    num++;
                }
                _longestConsecutive = Math.max(tempLongestConsecutive, _longestConsecutive);
            }

        }
        return _longestConsecutive;
    }


    public static void main(String[] args) {
        int[] nums = {1,0,-1};
        System.out.println(longestConsecutive(nums));
    }
}

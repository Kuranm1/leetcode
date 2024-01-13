import java.util.HashSet;

public class Solution {

    public int findDuplicate(int[] nums) {
        HashSet<Integer> foundNumbers = new HashSet<>();
        for (int num : nums){
            if (foundNumbers.contains(num)) return num;
            foundNumbers.add(num);
        }

        return 0; // the problem constrain has at least one duplicate so this line to satisfy the compiler only
    }

    public static void main(String[] args) {

    }
}

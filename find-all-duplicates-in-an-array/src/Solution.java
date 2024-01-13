import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        HashMap<Integer,Integer> numbersOccurrence = new HashMap<>();

        for (int num: nums){
            if (numbersOccurrence.containsKey(num)){
                if (numbersOccurrence.get(num) == 1){
                    duplicates.add(num);
                    numbersOccurrence.put(num,2);
                }
            }
            else
                numbersOccurrence.put(num,1);
        }

        return duplicates;
    }
    public static void main(String[] args) {

    }
}

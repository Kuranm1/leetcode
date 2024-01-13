import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> intersectionsHash = new HashSet<>();
        HashMap<Integer,Boolean> foundValue = new HashMap<>();

        for (int num: nums1) foundValue.put(num,true);
        for (int num: nums2) if (foundValue.get(num) != null) intersectionsHash.add(num);

        int[] intersectionsArray = new int[intersectionsHash.size()];
        int i = 0;
        for (int num : intersectionsHash) {
            intersectionsArray[i] = num;
            i++;
        }
        return intersectionsArray;
    }

    public static void main(String[] args) {

    }
}
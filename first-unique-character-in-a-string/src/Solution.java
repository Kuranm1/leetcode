import java.util.HashMap;

public class Solution {

    public static int firstUniqChar(String s) {

        HashMap<Character,Integer> charFrequencies = new HashMap<>();

        for(char c : s.toCharArray()){
            charFrequencies.put(c,charFrequencies.getOrDefault(c,0)+1);
        }

        int i = 0;
        for (char c: s.toCharArray()){
            if (charFrequencies.get(c) == 1) return i;
            i++;
        }

        return -1;
    }

    public static void main(String[] args) {

    }
}

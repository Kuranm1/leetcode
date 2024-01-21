import java.lang.reflect.Array;
import java.util.*;

public class Solution {

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> _groupAnagrams = new ArrayList<>();
        HashMap<String,List<String>> anagramHash = new HashMap<>();

        String key;
        char[] keyAsArray;
        for (String s : strs){
            keyAsArray = s.toCharArray();
            Arrays.sort(keyAsArray);
            key = Arrays.toString(keyAsArray);
            if(!anagramHash.containsKey(key)) anagramHash.put(key,new ArrayList<>());
            anagramHash.get(key).add(s);
        }

        for (Map.Entry<String, List<String>> entry : anagramHash.entrySet()){
            _groupAnagrams.add(entry.getValue());
        }

        return _groupAnagrams;

    }


    public static void main(String[] args) {

        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}

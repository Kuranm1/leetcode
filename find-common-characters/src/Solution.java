import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static List<String> commonChars(String[] words) {

        List<String> common = new ArrayList<>();

        HashMap<String,HashMap<Character,Integer>> wordsHash = new HashMap<>();
        String min_word = words[0];

        for (String word: words){
            if (word.length() < min_word.length()) min_word = word;

            wordsHash.put(word, new HashMap<>());
            int currentCharFreq;
            for (char c : word.toCharArray()){
                currentCharFreq = wordsHash.get(word).getOrDefault(c,0);
                wordsHash.get(word).put(c,currentCharFreq+1);
            }
        }

        for(Character c : min_word.toCharArray()){
            int min_char_freq = wordsHash.get(min_word).get(c);

            for(HashMap<Character,Integer> wordCharFreq : wordsHash.values()){
                int char_freq = wordCharFreq.getOrDefault(c,0);
                if ( char_freq < min_char_freq) min_char_freq = char_freq;
            }

            if (common.contains(c.toString())) continue;

            for(int i=0 ; i< min_char_freq ; i++){
                common.add(c.toString());
            }
        }

        return common;
    }
    public static void main(String[] args) {

        String[] words =  {"bella","label","roller"};
        commonChars(words);
    }
}

public class Main {

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1)
            return strs[0];

        StringBuilder longestCommonPrefix = new StringBuilder();
        int shortestWordLength = strs[0].length();
        boolean isLongestCommonPrefixFound = false;
        boolean isSearchFinished = false;

        // get the shorter possible value
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < shortestWordLength)
                shortestWordLength = strs[i].length();
        }


        for (int i = 0; i < shortestWordLength; i++) {

            char currentChar = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                String word =  strs[j];

                if (word.charAt(i) == currentChar){
                    if (j == strs.length-1) {
                        isLongestCommonPrefixFound = true;
                        longestCommonPrefix.append(currentChar);
                    }
                }
                else {
                    isSearchFinished = true;
                    break;
                }
            }

            if (isSearchFinished)
                break;
        }

        if (isLongestCommonPrefixFound)
            return longestCommonPrefix.toString();

        return "";
    }
    public static void main(String[] args) {
        String[] strs = new String [] {"mas", "mad", "masa"};
        System.out.println(longestCommonPrefix(strs));

    }
}

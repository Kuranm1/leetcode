public class Solution {
    public static void reverseString(char[] s) {
        int last = s.length-1;
        char temp;
        for(int i=0 ; i <= last/2 ; i++){
            temp = s[i];
            s[i] = s[last-i];
            s[last-i]=temp;
        }
    }
    public static void main(String[] args) {
        char[] s = {'1','2','3','4','5'};
        reverseString(s);
        System.out.println(s);
    }
}

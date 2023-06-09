import java.util.HashMap;

public class Main {
    public static int romanToInt(String s) {
        HashMap<Character,Integer> romanInt = new HashMap<Character,Integer>() {{
            put('I',1);
            put('V',5);
            put('X',10);
            put('L',50);
            put('C',100);
            put('D',500);
            put('M',1000);
        }};


        char currentChar = s.charAt(s.length()-1);
        char lastChar = currentChar;
        int sum=romanInt.get(currentChar);

        for (int i = s.length()-2; i >= 0 ; i--) {
            currentChar = s.charAt(i);
            if (romanInt.get(currentChar) >= romanInt.get(lastChar)){
                sum=sum+romanInt.get(currentChar);
                lastChar = currentChar;
                continue;
            }
            sum=sum-romanInt.get(currentChar);
            lastChar=currentChar;
        }

        return sum;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }
}

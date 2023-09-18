import java.io.OutputStream;
import java.io.Serializable;
import java.util.*;

public class ValidParentheses {

    public static boolean isValid(String s) {

        if (s.length() < 2) return false;

        Set<String> openParentheses = new HashSet<>(Arrays.asList("(", "{", "["));

        HashMap<String,String> parenthesesMap = new HashMap<>(){{
            put(")","(");
            put("}","{");
            put("]","[");
        }};

        Stack<String> parenthesesStack = new Stack<>();

        // loop through each parenthese if open parentheses push in stack
        for (String p : s.split("")) {
            if (openParentheses.contains(p))
                parenthesesStack.push(p);
            else {
                // if close parentheses check last element in stack
                if (!parenthesesStack.empty() && parenthesesStack.peek().equals(parenthesesMap.get(p)))
                    parenthesesStack.pop();
                else
                    return false;
            }
        }



        return parenthesesStack.empty();
    }


    public static void main(String[] args) {
        System.out.println(isValid("{()}"));
    }
}

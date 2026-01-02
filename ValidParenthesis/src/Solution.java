import java.util.Stack;

public class Solution {

    public boolean isValid(String s){

        Stack<Character> stack = new Stack<>();

        char[] charArray = s.toCharArray();
        for(int i = 0; i < charArray.length; i++) {
            char c = charArray[i];

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();
                if (
                        (c == ')' && top != '(') ||
                                (c == '}' && top != '{') ||
                                (c == ']' && top != '[')
                ) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

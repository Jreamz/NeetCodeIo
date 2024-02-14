package Arrays;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/

public class ValidParentheses {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int index = 0; index < s.length(); index++) {

            char currentChar = s.charAt(index);

            switch (currentChar)  {
                case '(', '[', '{' -> {
                    stack.push(currentChar);
                }
                case ')', ']', '}' -> {
                    if (stack.isEmpty() ||
                        (currentChar == ')' && stack.pop() != '(') ||
                        (currentChar == ']' && stack.pop() != '[') ||
                        (currentChar == '}' && stack.pop() != '{')) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}

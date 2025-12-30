package org.phase5;

import java.util.Stack;

public class ValidParenthesis {

    private final Stack<Character> parenthesisStack;

    public ValidParenthesis() {
        this.parenthesisStack = new Stack<>();
    }

    public boolean isValid(String s) {
        char[] input = s.toCharArray();
        for (char c : input) {
            switch (c) {
                case '(', '[', '{':
                    parenthesisStack.add(c);
                    break;
                case ')':
                    if (!parenthesisStack.empty() && parenthesisStack.peek() == '(') {
                        parenthesisStack.pop();
                    } else {
                        parenthesisStack.add(c);
                    }
                    break;
                case ']':
                    if (!parenthesisStack.empty() && parenthesisStack.peek() == '[') {
                        parenthesisStack.pop();
                    } else {
                        parenthesisStack.add(c);
                    }
                    break;
                case '}':
                    if (!parenthesisStack.empty() && parenthesisStack.peek() == '{') {
                        parenthesisStack.pop();
                    } else {
                        parenthesisStack.add(c);
                    }
                    break;
            }
        }
        return parenthesisStack.empty();
    }
}

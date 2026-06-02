package org.phase5;

public class Palindrome {

    public boolean isPalindrome(int x) {
        String stringValue = String.valueOf(x);
        String reverse = new StringBuilder(stringValue).reverse().toString();
        return stringValue.equals(reverse);
    }
}

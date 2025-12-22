package org.phase5;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        String lowerCase = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return lowerCase.contentEquals(new StringBuilder(lowerCase).reverse());
    }
}

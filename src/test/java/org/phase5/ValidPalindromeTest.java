package org.phase5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidPalindromeTest {

    private ValidPalindrome validPalindrome;

    @BeforeEach
    public void setUp() {
        validPalindrome = new ValidPalindrome();
    }

    @Test
    public void test1() {
        assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void test2() {
        assertFalse(validPalindrome.isPalindrome("race a car"));
    }

    @Test
    public void test3() {
        assertTrue(validPalindrome.isPalindrome(" "));
    }
}

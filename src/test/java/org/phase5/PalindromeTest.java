package org.phase5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {

    private Palindrome palindrome;

    @BeforeEach
    public void setUp() {
        palindrome = new Palindrome();
    }

    @Test
    public void singleDigitNumber() {
        assertTrue(palindrome.isPalindrome(0));
    }

    @Test
    public void negativeNumber() {
        assertFalse(palindrome.isPalindrome(-1));
    }
}

package org.phase5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesisTest {

    private ValidParenthesis validParenthesis;

    @BeforeEach
    public void setUp() {
        validParenthesis = new ValidParenthesis();
    }

    @Test
    public void singleMatch() {
        assertTrue(validParenthesis.isValid("()"));
    }

    @Test
    public void multipleMatch() {
        assertTrue(validParenthesis.isValid("()[]{}"));
    }

    @Test
    public void unmatch() {
        assertFalse(validParenthesis.isValid("(]"));
    }

    @Test
    public void nested() {
        assertTrue(validParenthesis.isValid("([])"));
    }

    @Test
    public void mixed() {
        assertFalse(validParenthesis.isValid("([)]"));
    }

    @Test
    public void singleUnmatch() {
        assertFalse(validParenthesis.isValid("]"));
    }
}

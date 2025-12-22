package org.phase5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RansomNoteTest {

    private RansomNote ransomNote;

    @BeforeEach
    public void setUp() {
        ransomNote = new RansomNote();
    }

    @Test
    public void test1() {
        assertFalse(ransomNote.canConstruct("a", "b"));
    }

    @Test
    public void test2() {
        assertFalse(ransomNote.canConstruct("aa", "ab"));
    }

    @Test
    public void test3() {
        assertTrue(ransomNote.canConstruct("aa", "aab"));
    }
}

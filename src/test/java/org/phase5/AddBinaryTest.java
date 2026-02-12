package org.phase5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddBinaryTest {

    private AddBinary addBinary;

    @BeforeEach
    public void setUp() {
        addBinary = new AddBinary();
    }

    @Test
    public void test1() {
        assertEquals("100", addBinary.addBinary("11", "1"));
    }

    @Test
    public void test2() {
        assertEquals("10101", addBinary.addBinary("1010", "1011"));
    }
}

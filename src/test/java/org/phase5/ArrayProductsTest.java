package org.phase5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayProductsTest {

    @Test
    public void emptyArray() {
        int[] result = ArrayProducts.arrayOfArrayProducts(new int[]{});

        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void singleElementArray() {
        int[] result = ArrayProducts.arrayOfArrayProducts(new int[]{ 1 });

        assertArrayEquals(new int[]{}, result);
    }


    @Test
    public void nonEmptyArray1() {
        int[] result = ArrayProducts.arrayOfArrayProducts(new int[]{ 8, 10, 2 });

        assertArrayEquals(new int[]{ 20, 16, 80 }, result);
    }

    @Test
    public void nonEmptyArray2() {
        int[] result = ArrayProducts.arrayOfArrayProducts(new int[]{ 2, 7, 3, 4 });

        assertArrayEquals(new int[]{ 84, 24, 56, 42 }, result);
    }
}

package org.phase5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInsertPositionTest {

    private SearchInsertPosition searchInsertPosition;

    @BeforeEach
    public void setUp() {
        searchInsertPosition = new SearchInsertPosition();
    }

    @Test
    public void emptyArray() {
        int position = searchInsertPosition.searchInsert(new int[]{}, 1);
        assertEquals(0, position);
    }

    @Test
    public void singleElement() {
        int position = searchInsertPosition.searchInsert(new int[]{ 1 }, 1);
        assertEquals(0, position);
    }

    @Test
    public void multipleElementsMatching() {
        int position = searchInsertPosition.searchInsert(new int[]{ 1, 3, 5, 6 }, 5);
        assertEquals(2, position);
    }

    @Test
    public void multipleElementsNotMatching() {
        int position = searchInsertPosition.searchInsert(new int[]{ 1, 3, 5, 6 }, 2);
        assertEquals(1, position);
    }

    @Test
    public void multipleElementsNotMatching2() {
        int position = searchInsertPosition.searchInsert(new int[]{ 1, 3, 5, 6 }, 7);
        assertEquals(4, position);
    }
}

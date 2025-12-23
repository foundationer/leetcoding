package org.phase5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SummaryRangesListTest {

    private SummaryRanges summaryRanges;

    @BeforeEach
    public void setUp() {
        summaryRanges = new SummaryRanges();
    }

    @Test
    public void testSummaryRanges() {
        int[] nums = {0,1,2,4,5,7};
        List<String> expected = Arrays.asList("0->2","4->5","7");
        assertEquals(expected, summaryRanges.summaryRanges(nums));
    }

    @Test
    public void testSummaryRanges2() {
        int[] nums = {0,2,3,4,6,8,9};
        List<String> expected = Arrays.asList("0","2->4","6","8->9");
        assertEquals(expected, summaryRanges.summaryRanges(nums));
    }

    @Test
    public void testSummaryRanges3() {
        int[] nums = { -1 };
        List<String> expected = List.of("-1");
        assertEquals(expected, summaryRanges.summaryRanges(nums));
    }
}

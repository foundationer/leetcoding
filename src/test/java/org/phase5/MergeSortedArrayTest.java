package org.phase5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MergeSortedArrayTest {

    private MergeSortedArray mergeSortedArray;

    @BeforeEach
    public void setUp() {
        mergeSortedArray = new MergeSortedArray();
    }

    @Test
    public void test1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        mergeSortedArray.merge(nums1, 3, nums2, 3);

        assertThat(nums1, is(new int[] {1, 2, 2, 3, 5, 6}));
    }

    @Test
    public void test2() {
        int[] nums1 = { 1 };
        int[] nums2 = { };

        mergeSortedArray.merge(nums1, 1, nums2, 0);

        assertThat(nums1, is(new int[] { 1 }));
    }

    @Test
    public void test3() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        mergeSortedArray.merge(nums1, 3, nums2, 3);

        assertThat(nums1, is(new int[] {1, 2, 2, 3, 5, 6}));
    }
}

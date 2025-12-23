package org.phase5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            return Collections.emptyList();
        } else if(nums.length == 1) {
            result.add(String.valueOf(nums[0]));
        } else {
            int start = nums[0];
            int end = start;
            for(int i = 1; i < nums.length;) {
                while((i < nums.length) && end + 1 == nums[i]) {
                    end = nums[i++];
                }
                if(start == end) {
                    result.add(String.valueOf(end));
                } else {
                    result.add(start + "->" + end);
                }
                if(i < nums.length) {
                    start = nums[i];
                    end = start;
                    i++;
                    if (i == nums.length) {
                        // one element left, add it
                        result.add(String.valueOf(end));
                    }
                }
            }
        }
        return result;
    }
}

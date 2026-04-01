package org.phase5;

import java.util.stream.IntStream;

public class ArrayProducts {

    static int[] arrayOfArrayProducts(int[] arr) {
        if(arr.length > 1) {
            int[] result = IntStream.generate(() -> 1).limit(arr.length).toArray();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (i != j) {
                        result[i] *= arr[j];
                    }
                }
            }
            return result;
        } else {
            return new int[]{};
        }
    }
}
